package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ProxyUpdateTest extends ZabbixApiTestBase {

    public ProxyUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyProxy dummyProxy = new DummyProxy(zabbixApi);
        Integer targetId = dummyProxy.createWithoutHost();

        try {
            ProxyUpdateRequest request = new ProxyUpdateRequest();
            ProxyUpdateRequest.Params params = request.getParams();

            params.setProxyid(targetId);
            params.setHost("Active proxy");
            params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);

            ProxyUpdateResponse response = zabbixApi.proxy().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getProxyids().get(0);
            assertThat(actualId, is(targetId));
        } finally {
            dummyProxy.delete(targetId);
        }
    }
}
