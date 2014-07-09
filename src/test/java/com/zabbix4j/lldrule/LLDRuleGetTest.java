package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Suguru Yajima
 */
public class LLDRuleGetTest extends ZabbixApiTestBase {

    public LLDRuleGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        ZabbixApiTestDummyLLDRule dummyLLDRule = new ZabbixApiTestDummyLLDRule(zabbixApi);
        Integer targetId = dummyLLDRule.createLLDRule();
        try {
            LLDRuleGetRequest request = new LLDRuleGetRequest();
            LLDRuleGetRequest.Params params = request.getParams();

            params.addItemId(targetId);
            params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHostPrototypes(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGraphs(ZabbixApiParamter.QUERY.extend.name());

            LLDRuleGetResponse response = zabbixApi.lldRule().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));
        } finally {
            dummyLLDRule.deleteLLDRule(targetId);
        }
    }
}
