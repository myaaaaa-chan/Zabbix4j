package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/26.
 */
public class DRuleDeleteTest extends ZabbixApiTestBase {

    public DRuleDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {
        DummyDiscoveryRule dummyDiscoveryRule = new DummyDiscoveryRule(zabbixApi);
        Integer druleId = dummyDiscoveryRule.create();

        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleId(druleId);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer acutalId = response.getResult().getDruleids().get(0);

        assertEquals(druleId, acutalId);
    }
}
