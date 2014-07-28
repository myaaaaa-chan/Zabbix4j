package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostGetobjectsTest extends ZabbixApiTestBase {
    public HostGetobjectsTest() {
        super();
    }

    @Test
    public void testGetobjects1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer targetId = dummyHost.createHost();

        try {
            HostGetobjectsRequest request = new HostGetobjectsRequest();
            HostGetobjectsRequest.Params params = request.getParams();

            params.setHostid(targetId);

            HostGetobjectsResponse response = zabbixApi.host().getobjects(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            HostObject obj = response.getResult().get(0);
            assertNotNull(response);
            assertThat(obj.getHostid(), Is.is(targetId));
        } finally {
            dummyHost.deleteHost(targetId);
        }

    }
}
