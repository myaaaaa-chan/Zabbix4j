package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ProxyGetTest extends ZabbixApiTestBase {
    public ProxyGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {

        DummyProxy dummyProxy = new DummyProxy(zabbixApi);
        Integer targetId = dummyProxy.createWithoutHost();

        try {
            ProxyGetRequest request = new ProxyGetRequest();
            ProxyGetRequest.Params params = request.getParams();
            params.addProxyId(targetId);
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());

            ProxyGetResponse response = zabbixApi.proxy().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            ProxyGetResponse.Result result = response.getResult().get(0);
            assertThat(result.getProxyid(), is(targetId));

        } finally {
            dummyProxy.delete(targetId);
        }
    }
}
