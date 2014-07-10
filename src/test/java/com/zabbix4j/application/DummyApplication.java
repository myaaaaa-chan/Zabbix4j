package com.zabbix4j.application;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author yajima 2014
 */
public class DummyApplication extends ZabbixApiTestDummyMethodBase {
    public DummyApplication(ZabbixApi zabbixApi) {

        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationObject obj = new ApplicationObject();
        obj.setName("Application before update." + new Date().getTime());
        obj.setHostid(10113);
        request.addApplicationObject(obj);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(targetId);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
