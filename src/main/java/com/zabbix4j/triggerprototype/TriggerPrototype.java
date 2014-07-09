package com.zabbix4j.triggerprototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototype extends ZabbixApiMethod {
    public TriggerPrototype(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    public TriggerPrototypeCreateResponse create(TriggerPrototypeCreateRequest request) throws ZabbixApiException {
        TriggerPrototypeCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TriggerPrototypeCreateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public TriggerPrototypeDeleteResponse delete(TriggerPrototypeDeleteRequest request) throws ZabbixApiException {
        TriggerPrototypeDeleteResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TriggerPrototypeDeleteResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public TriggerPrototypeUpdateResponse update(TriggerPrototypeUpdateRequest request) throws ZabbixApiException {
        TriggerPrototypeUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TriggerPrototypeUpdateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }

    public TriggerPrototypeGetResponse get(TriggerPrototypeGetRequest request) throws ZabbixApiException {
        TriggerPrototypeGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TriggerPrototypeGetResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
}
