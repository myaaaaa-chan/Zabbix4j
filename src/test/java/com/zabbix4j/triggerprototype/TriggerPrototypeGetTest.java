package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeGetTest extends ZabbixApiTestBase {
    public TriggerPrototypeGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        final Integer targetId = 13545;

        TriggerPrototypeGetRequest request = new TriggerPrototypeGetRequest();
        TriggerPrototypeGetRequest.Params params = request.getParams();
        params.addTriggerId(targetId);
        params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectFunctions(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());

        TriggerPrototypeGetResponse response = zabbixApi.triggerPrototype().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));


    }
}
