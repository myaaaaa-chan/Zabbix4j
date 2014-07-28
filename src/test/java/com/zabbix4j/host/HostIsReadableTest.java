package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostIsReadableTest extends ZabbixApiTestBase {
    public HostIsReadableTest() {
        super();
    }

    @Test
    public void testIsReadble1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer targetId = dummyHost.createHost();

        try {
            HostIsReadableRequest request = new HostIsReadableRequest();
            request.addHostId(targetId);

            HostIsReadableResponse response = zabbixApi.host().isReadable(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyHost.deleteHost(targetId);
        }
    }
}
