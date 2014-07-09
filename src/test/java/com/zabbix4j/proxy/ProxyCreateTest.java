package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ProxyCreateTest extends ZabbixApiTestBase {

    public ProxyCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        final Integer hostId = 10147;

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        params.addHostId(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getProxyids().get(0);
        assertNotNull(actualId);
    }
}
