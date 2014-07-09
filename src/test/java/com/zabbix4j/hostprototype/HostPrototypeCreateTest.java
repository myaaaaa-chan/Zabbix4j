package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.lldrule.ZabbixApiTestDummyLLDRule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/06/05.
 */
public class HostPrototypeCreateTest extends ZabbixApiTestBase {

    private final int TEST_GROUP_ID = 20;

    public HostPrototypeCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        ZabbixApiTestDummyLLDRule dummyLLD = new ZabbixApiTestDummyLLDRule(zabbixApi);
        Integer lldRuleID = dummyLLD.createLLDRule();
        try {
            HostPrototypeCreateRequest request = new HostPrototypeCreateRequest();
            HostPrototypeCreateRequest.Params params = request.getParams();
            params.setRuleid(lldRuleID);
            GroupLinkObject linkObj = new GroupLinkObject();
            linkObj.setGroupid(TEST_GROUP_ID);
            params.addGroupLink(linkObj);

            GroupPrototypeObject typeObj = new GroupPrototypeObject();
            typeObj.setName("{#HV.NAME}");
            params.addGroupPrototype(typeObj);

            params.setHost("{#HV.NAME}");

            HostPrototypeCreateResponse response = zabbixApi.hostPrototype().create(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getHostids().get(0);
            assertNotNull(actualId);
        } finally {

            dummyLLD.deleteLLDRule(lldRuleID);
        }
    }
}
