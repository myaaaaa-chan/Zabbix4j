package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class DruleExistTest extends ZabbixApiTestBase {
    public DruleExistTest() {
        super();
    }

    @Test
    public void testExist() throws Exception {
        DummyDiscoveryRule dummyDiscoveryRule = new DummyDiscoveryRule(zabbixApi);
        Integer targetId = dummyDiscoveryRule.create();

        try {
            DRuleExistRequest request = new DRuleExistRequest();
            DRuleExistRequest.Params params = request.getParams();
            params.addDruleId(targetId);

            DRuleExistResponse response = zabbixApi.discoveryRule().exist(request);
            assertNotNull(response);

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyDiscoveryRule.delete(targetId);
        }

    }
}
