/*
 * (C) Copyright 2011 Nuxeo SA (http://nuxeo.com/) and contributors.
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
 *     Sun Seng David TAN <stan@nuxeo.com>, jcarsique
 */
package org.nuxeo.launcher.sync;

import org.nuxeo.launcher.NuxeoLauncher;
import org.nuxeo.launcher.gui.NuxeoFrame;
import org.nuxeo.launcher.gui.NuxeoLauncherGUI;

/**
 * Customized NuxeoLauncherGui to instantiate a {@link NuxeoSyncFrame} instead of {@link NuxeoFrame}
 * {@link NuxeoSyncFrame} adds the sync tab.
 *
 * @author Sun Seng David TAN <stan@nuxeo.com>
 */
public class NuxeoLauncherSyncGUI extends NuxeoLauncherGUI {

    public NuxeoLauncherSyncGUI(NuxeoLauncher launcher) {
        super(launcher);
    }

    @Override
    protected NuxeoFrame createNuxeoFrame(NuxeoLauncherGUI controller) {
        return new NuxeoSyncFrame(controller);
    }

    @Override
    public void updateServerStatus() {
        super.updateServerStatus();
        ((NuxeoSyncFrame) nuxeoFrame).updateSyncButton();
    }

}
