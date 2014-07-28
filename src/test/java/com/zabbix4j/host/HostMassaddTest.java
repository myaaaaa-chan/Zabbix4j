package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.usermacro.Macro;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostMassaddTest extends ZabbixApiTestBase {
    public HostMassaddTest() {
        super();
    }

    @Test
    public void testMassadd1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer targetId1 = dummyHost.createHost();
        Integer targetId2 = dummyHost.createHost();

        try {
            HostMassaddRequest request = new HostMassaddRequest();
            HostMassaddRequest.Params params = request.getParams();
            params.addHostId(targetId1);
            params.addHostId(targetId2);

            Macro macro1 = new Macro();
            macro1.setMacro("{$MACROOOO1}");
            macro1.setValue("value1");
            params.addMacro(macro1);

            Macro macro2 = new Macro();
            macro2.setMacro("{$MACROOOO2}");
            macro2.setValue("value2");
            params.addMacro(macro2);

            HostMassaddResponse response = zabbixApi.host().massadd(request);
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
