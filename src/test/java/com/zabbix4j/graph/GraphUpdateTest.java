package com.zabbix4j.graph;

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
        DummyGraph dummyGraph = new DummyGraph(zabbixApi);
        Integer targetId = dummyGraph.create();

        try {
            GraphUpdateRequest request = new GraphUpdateRequest();
            GraphUpdateRequest.Params params = request.createParams();
            params.setName("Graph Updated Test Success");
            params.setGraphid(targetId);

            GraphUpdateResponse response = zabbixApi.graph().update(request);
            assertNotNull(request);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getGraphids().get(0);

            assertEquals(targetId, actualId);
        } finally {
            dummyGraph.delete(targetId);
        }
    }

}
