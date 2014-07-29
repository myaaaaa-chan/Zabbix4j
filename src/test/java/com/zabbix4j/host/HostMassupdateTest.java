package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostMassupdateTest extends ZabbixApiTestBase {
    public HostMassupdateTest() {
        super();
    }

    @Test
    public void testMassupdate1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer targetId1 = dummyHost.createHost();
        Integer targetId2 = dummyHost.createHost();

        final Integer templateId = 10001;

        try {
            HostMassupdateRequest request = new HostMassupdateRequest();
            HostMassupdateRequest.Params params = request.getParams();
            params.addHostId(targetId1);
            params.addHostId(targetId2);
            params.addClearTemplate(templateId);

            HostMassupdateResponse response = zabbixApi.host().massupdate(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult().getHostids().get(0), Is.is(targetId1));
            assertThat(response.getResult().getHostids().get(1), Is.is(targetId2));
        } finally {
            dummyHost.deleteHost(targetId1);
            dummyHost.deleteHost(targetId2);
        }
    }
}
