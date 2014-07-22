package com.zabbix4j.graphprototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototype extends ZabbixApiMethod {

    public GraphPrototype(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new graph prototypes.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/create">graphprototype.create</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeCreateResponse create(GraphPrototypeCreateRequest request) throws ZabbixApiException {
        GraphPrototypeCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeCreateResponse.class);

        return response;
    }

    /**
     * This method allows to delete graph prototypes.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/delete">graphprototype.delete</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeDeleteResponse delete(GraphPrototypeDeleteRequest request) throws ZabbixApiException {
        GraphPrototypeDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeDeleteResponse.class);

        return response;
    }

    /**
     * This method allows to update existing graph prototypes.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/update">graphprototype.update</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeUpdateResponse update(GraphPrototypeUpdateRequest request) throws ZabbixApiException {
        GraphPrototypeUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeUpdateResponse.class);

        return response;
    }

    /**
     * The method allows to retrieve graph prototypes according to the given parameters.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/get">graphprototype.get</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeGetResponse get(GraphPrototypeGetRequest request) throws ZabbixApiException {
        GraphPrototypeGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeGetResponse.class);

        return response;
    }

    /**
     * This method allows to retrieve graph prototypes that match the given filter criteria.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/getobjects">graphprototype.getobjects</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeGetobjectsResponse getobjects(GraphPrototypeGetobjectsRequest request) throws ZabbixApiException {
        GraphPrototypeGetobjectsResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeGetobjectsResponse.class);

        return response;
    }

    /**
     * This method checks if at least one graph prototype that matches the given filter criteria exists.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/graphprototype/exists">graphprototype.exists</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public GraphPrototypeExistsResponse exists(GraphPrototypeExistsRequest request) throws ZabbixApiException {
        GraphPrototypeExistsResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, GraphPrototypeExistsResponse.class);

        return response;
    }
}
