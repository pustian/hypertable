#
# Copyright (C) 2007-2016 Hypertable, Inc.
#
# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 3
# of the License, or any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
# 02110-1301, USA.
#

# metalog_tool - program to print a textual representation of the metalog
add_executable(ht_metalog_tool ht_metalog_tool.cc)
target_link_libraries(ht_metalog_tool Hypertable HyperRanger HyperMaster ${BOOST_LIBS} ${RE2_LIBRARY}
                                   ${SIGAR_LIBRARY} ${EXPAT_LIBRARIES} ${NCURSES_LIBRARY}
                                   ${EDITLINE_LIBRARY} ${HYPERTABLE_LIBRARIES}
                                   ${SNAPPY_LIBRARY} ${MALLOC_LIBRARY} ${Libssl_LIBRARIES})

if (NOT HT_COMPONENT_INSTALL)
  install(TARGETS ht_metalog_tool RUNTIME DESTINATION bin)
endif ()
