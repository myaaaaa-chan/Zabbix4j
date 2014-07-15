package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class DRuleGetTest extends ZabbixApiTestBase {

    public DRuleGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        DummyDiscoveryRule dummyDiscoveryRule = new DummyDiscoveryRule(zabbixApi);
        Integer targetId = dummyDiscoveryRule.create();

        try {
            DRuleGetRequest request = new DRuleGetRequest();
            DRuleGetRequest.Params params = request.getParams();
            params.addDRuleId(targetId);

            DRuleGetResponse response = zabbixApi.discoveryRule().get(request);
            assertNotNull(response);

            DiscoveryRuleObject ruleObject = response.getResult().get(0);
            assertNotNull(ruleObject);

            assertNotNull(ruleObject.getName());
            assertEquals("127.0.0.1", ruleObject.getIprange());
        } finally {
            dummyDiscoveryRule.delete(targetId);
        }
    }
}
