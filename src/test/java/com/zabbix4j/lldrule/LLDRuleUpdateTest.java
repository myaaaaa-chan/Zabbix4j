package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class LLDRuleUpdateTest extends ZabbixApiTestBase {

    private Integer hostId;

    public LLDRuleUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {
        Integer targetId = null;
        try {
            targetId = new ZabbixApiTestDummyLLDRule(zabbixApi).createLLDRule();

            LLDRuleUpdateRequest request = new LLDRuleUpdateRequest();
            LLDRuleUpdateRequest.Params params = request.getParams();

            params.setItemid(targetId);
            params.setName("LLD Rule Update");
            params.setKey_("key_udate");

            LLDRuleUpdateResponse response = zabbixApi.lldRule().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getItemids().get(0);
            assertThat(targetId, Is.is(actualId));
        } finally {
            new ZabbixApiTestDummyLLDRule(zabbixApi).deleteLLDRule(targetId);
        }
    }
}
