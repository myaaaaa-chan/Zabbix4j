package com.zabbix4j.graph;

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
        DummyGraph dummyGraph = new DummyGraph(zabbixApi);
        Integer targetId = dummyGraph.create();

        GraphDeleteRequest request = new GraphDeleteRequest();
        request.getParams().add(targetId);

        GraphDeleteResponse response = zabbixApi.graph().delete(request);
        assertNotNull(response);

        assertEquals(targetId, response.getResult().getGraphids().get(0));
    }

}
