package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeCreateTest extends ZabbixApiTestBase {

    public GraphPrototypeCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype create test");
        GraphItem gitem = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid(23730);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getGraphids().get(0);
        assertNotNull(id);
    }

    private void deleteResult(Integer id) throws ZabbixApiException {

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(id);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
    }


}
