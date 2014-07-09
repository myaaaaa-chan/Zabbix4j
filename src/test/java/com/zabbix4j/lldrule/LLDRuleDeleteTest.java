package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Suguru Yajima
 */
public class LLDRuleDeleteTest extends ZabbixApiTestBase {

    public LLDRuleDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer targetId = new ZabbixApiTestDummyLLDRule(zabbixApi).createLLDRule();

        LLDRuleDeleteRequest request = new LLDRuleDeleteRequest();
        request.addruleId(targetId);

        LLDRuleDeleteResponse response = zabbixApi.lldRule().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getRuleids().get(0);
        assertThat(targetId, Is.is(actualId));
    }
}
