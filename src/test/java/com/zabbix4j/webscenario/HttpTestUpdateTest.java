package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class HttpTestUpdateTest extends ZabbixApiTestBase {
    public HttpTestUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyWebScenario dummyWebScenario = new DummyWebScenario(zabbixApi);
        Integer targetId = dummyWebScenario.create();

        try {
            HttpTestUpdateRequest request = new HttpTestUpdateRequest();
            HttpTestUpdateRequest.Params params = request.getParams();
            params.setHttptestid(targetId);
            params.setStatus(WebScenarioObject.STATUS.DISABLED.value);

            HttpTestUpdateRespose respose = zabbixApi.webscenario().update(request);
            assertNotNull(respose);

            Integer actualId = respose.getResult().getHttptestids().get(0);
            assertThat(actualId, Is.is(targetId));
        } finally {
            dummyWebScenario.delete(targetId);
        }

    }
}
