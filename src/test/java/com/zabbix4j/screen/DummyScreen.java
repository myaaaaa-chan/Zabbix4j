package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyScreen extends ZabbixApiTestDummyMethodBase {
    public DummyScreen(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        ScreenCreateRequest request = new ScreenCreateRequest();
        ScreenCreateRequest.Params params = request.getParams();
        params.setName("test.screen.create." + new Date().getTime());
        params.setHsize(3);
        params.setVsize(2);

        ScreenCreateResponse response = zabbixApi.screen().create(request);

        Integer actualId = response.getResult().getScreenids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        ScreenDeleteRequest request = new ScreenDeleteRequest();
        request.addScreenId(targetId);

        ScreenDeleteResponse response = zabbixApi.screen().delete(request);

    }
}
