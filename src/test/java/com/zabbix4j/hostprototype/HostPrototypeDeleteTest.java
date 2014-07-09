package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeDeleteTest extends ZabbixApiTestBase {

    public HostPrototypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        ZabbixApiTestDummyHostPrototype dummy = new ZabbixApiTestDummyHostPrototype(zabbixApi);
        try {
            Integer targetId = dummy.createHost();

            HostPrototypeDeleteRequest request = new HostPrototypeDeleteRequest();
            request.addHostId(targetId);

            HostPrototypeDeleteResponse response = zabbixApi.hostPrototype().delete(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));
        } finally {

        }
    }
}
