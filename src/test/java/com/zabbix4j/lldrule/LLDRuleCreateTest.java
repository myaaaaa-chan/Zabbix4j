package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.DummyHost;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class LLDRuleCreateTest extends ZabbixApiTestBase {

    public LLDRuleCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        Integer targetHostId = null;
        try {
            DummyHost dummyHost = new DummyHost(zabbixApi);
            targetHostId = dummyHost.createHost();
            Integer interfaceId = dummyHost.getHostInterface(targetHostId);

            LLDRuleCreateRequest request = new LLDRuleCreateRequest();
            LLDRuleCreateRequest.Params params = request.getParams();
            params.setDelay(30);
            params.setHostid(targetHostId);
            params.setInterfaceid(interfaceId);
            params.setKey_("test");
            params.setName("LLD create");
            params.setType(LLDRuleObject.LLD_RULE_TYPE.SIMPLE_CHECK.value);

            LLDRuleCreateResponse response = zabbixApi.lldRule().create(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer lldRuleId = response.getResult().getItemids().get(0);
            assertNotNull(lldRuleId);

            new ZabbixApiTestDummyLLDRule(zabbixApi).deleteLLDRule(lldRuleId);
        } finally {
            new DummyHost(zabbixApi).deleteHost(targetHostId);
        }
    }
}
