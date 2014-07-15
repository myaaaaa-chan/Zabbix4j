package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class DRuleIsWritableTest extends ZabbixApiTestBase {
    public DRuleIsWritableTest() {
        super();
    }

    @Test
    public void testIsWritable() throws Exception {
        DummyDiscoveryRule dummyDiscoveryRule = new DummyDiscoveryRule(zabbixApi);
        Integer targetId = dummyDiscoveryRule.create();

        try {
            DRuleIsWritableRequest request = new DRuleIsWritableRequest();
            request.addDRuleId(targetId);

            DRuleIsWritableResponse response = zabbixApi.discoveryRule().isWritable(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyDiscoveryRule.delete(targetId);
        }

    }
}
