package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class DRuleUpdateTest extends ZabbixApiTestBase {

    public DRuleUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {
        DummyDiscoveryRule dummyDiscoveryRule = new DummyDiscoveryRule(zabbixApi);
        Integer targetId = dummyDiscoveryRule.create();

        try {
            DRuleUpdateRequest request = new DRuleUpdateRequest();
            DRuleUpdateRequest.Params params = request.getParams();
            params.setDruleid(targetId);
            params.setName("update success");
            params.setIprange("192.168.0.1");

            DCheck dcheck = new DCheck();
            dcheck.setKey_("key_");
            dcheck.setPorts(10051);
            dcheck.setType(9);
            dcheck.setUniq(0);
            params.addCheck(dcheck);

            DRuleUpdateResponse response = zabbixApi.discoveryRule().update(request);
            assertNotNull(response);

            Integer actualId = response.getResult().getDruleids().get(0);

            assertEquals(targetId, actualId);
        } finally {
            dummyDiscoveryRule.delete(targetId);
        }
    }
}
