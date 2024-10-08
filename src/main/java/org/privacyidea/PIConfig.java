/*
 * Copyright 2023 NetKnights GmbH - nils.behlen@netknights.it
 * lukas.matusiewicz@netknights.it
 * - Modified
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License here:
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">License</a>
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.privacyidea;

class PIConfig
{
    String serverURL;
    String realm = "";
    boolean doSSLVerify = true;
    String apiKey = "";
    String serviceAccountName = "";
    String serviceAccountPass = "";
    String serviceAccountRealm = "";
    boolean disableLog = false;
    String userAgent;
    int httpTimeoutMs = 30000;

    public PIConfig(String serverURL, String userAgent)
    {
        this.serverURL = serverURL;
        this.userAgent = userAgent;
    }
}
