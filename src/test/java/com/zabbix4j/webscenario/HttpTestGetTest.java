package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class HttpTestGetTest extends ZabbixApiTestBase {

    public HttpTestGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyWebScenario dummyWebScenario = new DummyWebScenario(zabbixApi);
        Integer targetId = dummyWebScenario.create();

        try {
            HttpTestGetRequest request = new HttpTestGetRequest();
            HttpTestGetRequest.Params params = request.getParams();

            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectSteps(ZabbixApiParamter.QUERY.extend.name());
            params.setExpandName(true);
            params.setExpandStepName(true);

            HttpTestGetResponse response = zabbixApi.webscenario().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));
        } finally {
            dummyWebScenario.delete(targetId);
        }
    }
}
