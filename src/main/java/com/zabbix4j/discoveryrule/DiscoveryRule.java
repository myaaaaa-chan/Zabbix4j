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

package com.zabbix4j.discoveryrule;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * @author Suguru Yajima on 2014/05/26.
 */
public class DiscoveryRule extends ZabbixApiMethod {

    public DiscoveryRule(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new discrovery rules.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/create">drule.create</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleCreateResponse create(DRuleCreateRequest request) throws ZabbixApiException {
        DRuleCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleCreateResponse.class);

        return response;
    }

    /**
     * This method allows to delete discovery rules.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/delete">drule.delete</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleDeleteResponse delete(DRuleDeleteRequest request) throws ZabbixApiException {
        DRuleDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleDeleteResponse.class);

        return response;
    }

    /**
     * This method allows to update existing discovery rules.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/update">drule.update</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleUpdateResponse update(DRuleUpdateRequest request) throws ZabbixApiException {
        DRuleUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleUpdateResponse.class);

        return response;
    }

    /**
     * The method allows to retrieve discovery rules according to the given parameters.</br>
     * <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/get">drule.get</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleGetResponse get(DRuleGetRequest request) throws ZabbixApiException {
        DRuleGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleGetResponse.class);

        return response;
    }

    /**
     * This method checks if at least one discrovery rule that matches the given filter criteria exists.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/exists">drule.exists</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleExistResponse exist(DRuleExistRequest request) throws ZabbixApiException {
        DRuleExistResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleExistResponse.class);

        return response;
    }

    /**
     * This method checks if the given discovery rules are available for reading.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/isreadable">drule.isreadable</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleIsReadableResponse isReadable(DRuleIsReadableRequest request) throws ZabbixApiException {
        DRuleIsReadableResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleIsReadableResponse.class);

        return response;
    }

    /**
     * This method checks if the given discovery rules are available for writing.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/drule/iswritable">drule.iswritable</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public DRuleIsWritableResponse isWritable(DRuleIsWritableRequest request) throws ZabbixApiException {
        DRuleIsWritableResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, DRuleIsWritableResponse.class);

        return response;
    }
}
