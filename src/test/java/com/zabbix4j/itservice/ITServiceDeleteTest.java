package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ITServiceDeleteTest extends ZabbixApiTestBase {

    public ITServiceDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        DummyITService dummy = new DummyITService(zabbixApi);
        Integer targetId = dummy.create();

        ITServiceDeleteRequest request = new ITServiceDeleteRequest();
        request.addServiceId(targetId);

        ITServiceDeleteResponse response = zabbixApi.itservice().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getServiceids().get(0);

        assertThat(targetId, is(actualId));
    }
}
