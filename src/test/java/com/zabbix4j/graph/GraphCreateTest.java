package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
public class GraphCreateTest extends ZabbixApiTestBase {

    public GraphCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        final Integer itemId = 23287;

        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.createParam();
        params.setName("Graph Create Test." + new Date().getTime());

        GraphItem gitem = new GraphItem();
        gitem.setItemid(itemId);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        params = request.createParam();
        params.setName("Graph Create Test." + new Date().getTime());

        gitem = new GraphItem();
        gitem.setItemid(itemId);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        assertThat(response.getResult().getGraphids().size(), Is.is(2));
    }
}
