package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphUpdateTest extends ZabbixApiTestBase {

    public GraphUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer targetId = createDummyGraph();

        GraphUpdateRequest request = new GraphUpdateRequest();
        GraphUpdateRequest.Params params = request.getParams();
        params.setName("Graph Updated Test Success");
        params.setGraphid(targetId);

        GraphUpdateResponse response = zabbixApi.graph().update(request);
        assertNotNull(request);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getGraphids().get(0);

        assertEquals(targetId, actualId);
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
