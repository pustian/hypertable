/*
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

#ifndef Hyperspace_ServerKeepaliveHandler_h
#define Hyperspace_ServerKeepaliveHandler_h

#include "Event.h"

#include <AsyncComm/ApplicationQueue.h>
#include <AsyncComm/Comm.h>
#include <AsyncComm/DispatchHandler.h>

#include <mutex>

namespace Hyperspace {

  class Master;

  /*
   */
  class ServerKeepaliveHandler : public DispatchHandler {
  public:
    ServerKeepaliveHandler(Comm *comm, Master *master,
                           ApplicationQueuePtr &app_queue_ptr);
    void start();
    virtual void handle(Hypertable::EventPtr &event_ptr);
    void deliver_event_notifications(uint64_t session_id);
    void shutdown();

  private:
    Comm              *m_comm;
    Master            *m_master;
    struct sockaddr_in m_send_addr;
    ApplicationQueuePtr m_app_queue_ptr;
    std::mutex m_mutex;
    bool m_shutdown {};
  };
  typedef std::shared_ptr<ServerKeepaliveHandler> ServerKeepaliveHandlerPtr;
}

#endif // Hyperspace_ServerKeepaliveHandler_h

