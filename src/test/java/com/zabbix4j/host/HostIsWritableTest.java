package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostIsWritableTest extends ZabbixApiTestBase {
    public HostIsWritableTest() {
        super();
    }

    @Test
    public void testIsWritable1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer targetId = dummyHost.createHost();

        try {
            HostIsWritableRequest request = new HostIsWritableRequest();
            request.addHostId(targetId);

            HostIsWritableResponse response = zabbixApi.host().isWritable(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyHost.deleteHost(targetId);
        }

    }
}
