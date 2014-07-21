package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.item.ItemObject;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/06/03.
 */
public class GraphPrototypeGetTest extends ZabbixApiTestBase {

    public GraphPrototypeGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer tagetId = dummyGraphPrototype.create();

        try {
            GraphPrototypeGetRequest request = new GraphPrototypeGetRequest();
            GraphPrototypeGetRequest.Params params = request.getParams();
            params.addGraphId(tagetId);
            params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGraphItems(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectTemplates(ZabbixApiParamter.QUERY.extend.name());

            GraphPrototypeGetResponse response = zabbixApi.graphPrototype().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            GraphPrototypeGetResponse.Result result = response.getResult().get(0);
            assertThat(tagetId, Is.is(result.getGraphid()));
            List<ItemObject> items = result.getItems();
            assertNotNull(items);
            assertNotNull(result.getGitems());
            assertNotNull(result.getGroups());
            assertNotNull(result.getHosts());
        } finally {
            dummyGraphPrototype.delete(tagetId);
        }
    }

}
