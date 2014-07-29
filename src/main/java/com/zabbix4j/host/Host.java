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

package com.zabbix4j.host;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class Host extends ZabbixApiMethod {

    public Host(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new hosts.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/create">host.create</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostCreateResponse create(HostCreateRequest request) throws ZabbixApiException {
        HostCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostCreateResponse.class);

        return response;
    }

    /**
     * This method allows to update existing hosts.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/update">host.update</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostUpdateResponse update(HostUpdateRequest request) throws ZabbixApiException {
        HostUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostUpdateResponse.class);


        return response;
    }

    /**
     * The method allows to retrieve hosts according to the given parameters.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/get">host.get</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostGetResponse get(HostGetRequest request) throws ZabbixApiException {
        HostGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostGetResponse.class);

        return response;
    }

    /**
     * This method checks if at least one host that matches the given filter criteria exists.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/exists">host.exists</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostExistResponse exist(HostExistRequest request) throws ZabbixApiException {
        HostExistResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostExistResponse.class);

        return response;
    }

    /**
     * This method allows to delete hosts.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/delete">host.delete</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostDeleteResponse delete(HostDeleteRequest request) throws ZabbixApiException {
        HostDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostDeleteResponse.class);

        return response;
    }

    /**
     * This method allows to retrieve hosts that match the given filter criteria.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/getobjects">host.getobjects</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostGetobjectsResponse getobjects(HostGetobjectsRequest request) throws ZabbixApiException {
        HostGetobjectsResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostGetobjectsResponse.class);

        return response;
    }

    /**
     * This method checks if the given hosts are available for reading. </br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/isreadable">host.isreadable</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostIsReadableResponse isReadable(HostIsReadableRequest request) throws ZabbixApiException {
        HostIsReadableResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostIsReadableResponse.class);

        return response;
    }

    /**
     * This method checks if the given hosts are available for writing.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/iswritable">host.iswritable</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostIsWritableResponse isWritable(HostIsWritableRequest request) throws ZabbixApiException {
        HostIsWritableResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostIsWritableResponse.class);

        return response;
    }

    /**
     * This method allows to simultaneously add multiple related objects to all the given hosts.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/massadd">host.massadd</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostMassaddResponse massadd(HostMassaddRequest request) throws ZabbixApiException {
        HostMassaddResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostMassaddResponse.class);

        return response;
    }

    /**
     * This method allows to remove related objects from multiple hosts.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/host/massremove">host.massremove</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostMassRemoveResponse massremove(HostMassremoveRequest request) throws ZabbixApiException {
        HostMassRemoveResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostMassRemoveResponse.class);

        return response;
    }
}
