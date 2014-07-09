package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
public class GraphCreateTest extends ZabbixApiTestBase {

    public GraphCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.getParams();
        params.setName("Graph Create Test");

        GraphItem gitem = new GraphItem();
        gitem.setItemid(23661);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
