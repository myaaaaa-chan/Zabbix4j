package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostDeleteTest extends ZabbixApiTestBase {

    public HostDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        int hostId = dummyHost.createHost();

        HostDeleteRequest request = new HostDeleteRequest();
        request.addParams(hostId);

        HostDeleteResponse response = zabbixApi.host().delete(request);

        assertNotNull(response);
        int deletedId = response.getResult().getHostids().get(0);
        assertEquals(hostId, deletedId);
    }
}
