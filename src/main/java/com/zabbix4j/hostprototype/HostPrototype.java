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
