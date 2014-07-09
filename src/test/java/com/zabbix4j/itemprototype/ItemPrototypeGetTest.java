package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeGetTest extends ZabbixApiTestBase {

    public ItemPrototypeGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        DummyItemPrototype dummyItemPrototype = new DummyItemPrototype(zabbixApi);
        Integer targetId = dummyItemPrototype.createItemPrototype();

        try {
            ItemPrototypeGetRequest request = new ItemPrototypeGetRequest();
            ItemPrototypeGetRequest.Params params = request.getParams();
            params.addItemId(targetId);
            params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGraphs(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectApplications(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectTriggers(ZabbixApiParamter.QUERY.extend.name());

            ItemPrototypeGetResponse response = zabbixApi.itemPrototype().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().get(0).getItemid();
            assertThat(targetId, is(actualId));
        } finally {
            dummyItemPrototype.delete(targetId);
        }
    }
}
