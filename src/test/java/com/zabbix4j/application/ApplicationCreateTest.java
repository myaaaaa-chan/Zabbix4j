package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/22.
 */
public class ApplicationCreateTest extends ZabbixApiTestBase {

    public ApplicationCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationObject obj = new ApplicationObject();
        obj.setName("Application crated." + new Date().getTime());
        obj.setHostid(10113);
        request.addApplicationObject(obj);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        assertNotNull(id);

        DummyApplication dummyApplication = new DummyApplication(zabbixApi);
        dummyApplication.delete(id);
    }
}
