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

package com.zabbix4j.graph;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * @author Suguru Yajima on 2014/05/29.
 */
public class Graph extends ZabbixApiMethod {
    public Graph(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new graphs.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/create">graph.create</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphCreateResponse create(GraphCreateRequest request) throws ZabbixApiException {
        GraphCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphCreateResponse.class);

        return response;
    }

    /**
     * This method allows to update existing graphs.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/update">graph.update</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphUpdateResponse update(GraphUpdateRequest request) throws ZabbixApiException {
        GraphUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphUpdateResponse.class);

        return response;
    }

    /**
     * This method allows to delete graphs.
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/delete">graph.delete</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphDeleteResponse delete(GraphDeleteRequest request) throws ZabbixApiException {
        GraphDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphDeleteResponse.class);

        return response;
    }

    /**
     * The method allows to retrieve graphs according to the given parameters.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/get">graph.get</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphGetResponse get(GraphGetRequest request) throws ZabbixApiException {
        GraphGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);


        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphGetResponse.class);

        return response;
    }

    /**
     * This method checks if at least one graph that matches the given filter criteria exists.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/exists">graph.exists</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphExistsResponse exists(GraphExistsRequest request) throws ZabbixApiException {
        GraphExistsResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);


        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphExistsResponse.class);

        return response;
    }

    /**
     * This method allows to retrieve graphs that match the given filter criteria.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graph/getobjects">graph.getobjects</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphGetObjectsResponse getobjects(GraphGetObjectsRequest request) throws ZabbixApiException {
        GraphGetObjectsResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);


        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphGetObjectsResponse.class);

        return response;
    }
}
