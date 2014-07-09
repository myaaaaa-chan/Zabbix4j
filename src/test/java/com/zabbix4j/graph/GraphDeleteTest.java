package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphDeleteTest extends ZabbixApiTestBase {

    public GraphDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer targetId = createDummyGraph();

        GraphDeleteRequest request = new GraphDeleteRequest();
        request.getParams().add(targetId);

        GraphDeleteResponse response = zabbixApi.graph().delete(request);
        assertNotNull(response);

        assertEquals(targetId, response.getResult().getGraphids().get(0));
    }

    private Integer createDummyGraph() throws ZabbixApiException {

        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.getParams();
        params.setName("Graph Update Test");

        GraphItem gitem = new GraphItem();
        gitem.setItemid(23661);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);

        return response.getResult().getGraphids().get(0);
    }
}
