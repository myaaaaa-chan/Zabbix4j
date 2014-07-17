package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphGetTest extends ZabbixApiTestBase {

    public GraphGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyGraph dummyGraph = new DummyGraph(zabbixApi);
        Integer targetId = dummyGraph.create();

        try {
            GraphGetRequest request = new GraphGetRequest();
            GraphGetRequest.Params params = request.getParams();
            params.addGraphId(targetId);
            params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGraphItems(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());

            GraphGetResponse response = zabbixApi.graph().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            GraphObject graphObject = response.getResult().get(0);
            assertNotNull(graphObject);
            assertNotNull(graphObject.getFlags());
            assertNotNull(graphObject.getGraphid());
            assertNotNull(graphObject.getHeight());
            assertNotNull(graphObject.getGraphid());
            assertNotNull(graphObject.getGraphtype());
            assertNotNull(graphObject.getName());
        } finally {
            dummyGraph.delete(targetId);
        }
    }
}
