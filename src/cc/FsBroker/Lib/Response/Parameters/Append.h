/* -*- c++ -*-
 * Copyright (C) 2007-2016 Hypertable, Inc.
 *
 * This file is part of Hypertable.
 *
 * Hypertable is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * Hypertable is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

/// @file
/// Declarations for Append response parameters.
/// This file contains declarations for Append, a class for encoding and
/// decoding response paramters to the <i>append</i> file system broker
/// function.

#ifndef FsBroker_Lib_Response_Parameters_Append_h
#define FsBroker_Lib_Response_Parameters_Append_h

#include <Common/Serializable.h>

#include <string>

using namespace std;

namespace Hypertable {
namespace FsBroker {
namespace Lib {
namespace Response {
namespace Parameters {

  /// @addtogroup FsBrokerLibResponseParameters
  /// @{

  /// %Response parameters for <i>append</i> requests.
  class Append : public Serializable {

  public:
    /// Constructor.
    /// Empty initialization for decoding.
    Append() {}

    /// Constructor.
    /// Initializes with response parameters for encoding.  Sets #m_offset to
    /// <code>offset</code> and #m_amount to <code>amount</code>.
    /// @param offset Append offset
    /// @param amount Amount of data appended
    Append(uint64_t offset, uint32_t amount)
      : m_offset(offset), m_amount(amount) {}

    /// Gets append offset
    /// @return Append offset
    uint64_t get_offset() { return m_offset; }

    /// Gets amount of data appended
    /// @return Amount of data appended
    uint32_t get_amount() { return m_amount; }

  private:

    uint8_t encoding_version() const override;

    size_t encoded_length_internal() const override;

    void encode_internal(uint8_t **bufp) const override;

    void decode_internal(uint8_t version, const uint8_t **bufp,
			 size_t *remainp) override;

    /// Offset at which data was appended
    uint64_t m_offset {};

    /// Amount of data appended
    uint32_t m_amount {};

  };

  /// @}

}}}}}

#endif // FsBroker_Lib_Response_Parameters_Append_h
