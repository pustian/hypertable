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
/// Declarations for Rename request handler.
/// This file contains declarations for Rename, a server-side request handler
/// used to invoke the <i>rename</i> function of a file system broker.

#ifndef FsBroker_Lib_Request_Handler_Rename_h
#define FsBroker_Lib_Request_Handler_Rename_h

#include <AsyncComm/ApplicationHandler.h>
#include <AsyncComm/Comm.h>
#include <AsyncComm/Event.h>

#include <FsBroker/Lib/Broker.h>

namespace Hypertable {
namespace FsBroker {
namespace Lib {
namespace Request {
namespace Handler {

  /// @addtogroup FsBrokerLibRequestHandler
  /// @{

  /// Application handler for <i>rename</i> function.
  class Rename : public ApplicationHandler {

  public:
    /// Constructor.
    /// Initializes parent application handler class with <code>event</code>
    /// and inititalizes #m_comm and #m_broker with <code>comm</code> and
    /// <code>broker</code>, respectively
    /// @param comm Pointer to comm layer
    /// @param broker Pointer to file system broker object
    /// @param event Comm layer event instigating the request
    Rename(Comm *comm, Broker *broker, EventPtr &event) :
      ApplicationHandler(event), m_comm(comm), m_broker(broker) {}

    /// Invokes the rename function.
    /// Decodes the request parameters from the underlying event object and then
    /// calls the rename function of #m_broker.
    virtual void run();

  private:
    /// Pointer to comm layer
    Comm *m_comm;

    /// Pointer to file system broker object
    Broker *m_broker;
  };

  /// @}

}}}}}

#endif // FsBroker_Lib_Request_Handler_Rename_h
