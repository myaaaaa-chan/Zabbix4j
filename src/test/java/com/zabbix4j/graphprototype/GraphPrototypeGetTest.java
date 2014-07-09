package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
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

        Integer tagetId = createDummy();

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

        deleteResult(tagetId);
        logger.debug(getGson().toJson(response));

        GraphPrototypeGetResponse.Result result = response.getResult().get(0);
        assertThat(tagetId, Is.is(result.getGraphid()));
        assertThat("Graphprototype get test", Is.is(result.getName()));
        List<ItemObject> items = result.getItems();
        assertNotNull(items);
        assertNotNull(result.getGitems());
        assertNotNull(result.getGroups());
        assertNotNull(result.getHosts());
    }

    private Integer createDummy() throws ZabbixApiException {

        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype get test");
        GraphItem gitem  = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid(23730);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response  =zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getGraphids().get(0);

        return id;
    }

    private void deleteResult(Integer id) throws ZabbixApiException {

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(id);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
    }
}
