/*
 * (C) Copyright 2006-2009 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 */
package org.nuxeo.ecm.platform.sync.server.webservices;

/**
 * @author rux rdarlea@nuxeo.com
 */
public interface StatefulWebServiceManagement {
    /**
     * Keeps alive the session. The Client can call this method to touch the instance. That way it is prevented the
     * destruction of the Stateful Web Service even if the Client has nothing really to communicate with the Server.
     */
    void keepAlive();

    /**
     * Destroys the service. It is called from the timeout callback, allowing the service to gracefully clean up.
     */
    void destroySession();
}
