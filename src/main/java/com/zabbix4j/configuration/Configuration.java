/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * @author Suguru Yajima on 2014/05/24.
 */
public class Configuration extends ZabbixApiMethod {

    public Configuration(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to export configuration data as a serialized string.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/configuration/export">configuration.export</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public ConfigurationExportResponse export(ConfigurationExportRequest request) throws ZabbixApiException {
        ConfigurationExportResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, ConfigurationExportResponse.class);

        return response;
    }

    /**
     * This method allows to import configuration data from a serialized string.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/configuration/import">configuration.import</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public ConfigurationImportResponse imports(ConfigurationImportRequest request) throws ZabbixApiException {
        ConfigurationImportResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, ConfigurationImportResponse.class);

        return response;
    }
}
