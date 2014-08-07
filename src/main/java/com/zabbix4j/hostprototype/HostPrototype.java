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

package com.zabbix4j.hostprototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * Created by Suguru Yajima on 2014/06/05.
 */
public class HostPrototype extends ZabbixApiMethod {

    public HostPrototype(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new host prototypes.
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     * @see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/hostprototype/create">hostprototype.create</a>
     */
    public HostPrototypeCreateResponse create(HostPrototypeCreateRequest request) throws ZabbixApiException {
        HostPrototypeCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostPrototypeCreateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public HostPrototypeDeleteResponse delete(HostPrototypeDeleteRequest request) throws ZabbixApiException {
        HostPrototypeDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostPrototypeDeleteResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public HostPrototypeUpdateResponse update(HostPrototypeUpdateRequest request) throws ZabbixApiException {
        HostPrototypeUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostPrototypeUpdateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public HostPrototypeGetReponse getl(HostPrototypeGetRequest request) throws ZabbixApiException {
        HostPrototypeGetReponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostPrototypeGetReponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
}
