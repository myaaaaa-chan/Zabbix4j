package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author suguru yajima 2014
 */
public class GraphGetObjectsTest extends ZabbixApiTestBase {
    public GraphGetObjectsTest() {
        super();
    }

    @Test
    public void testGetObjects() throws Exception {
        GraphGetObjectsRequest request = new GraphGetObjectsRequest();
        GraphGetObjectsRequest.Params params = request.getParams();

        params.setNode("Zabbix server");

        GraphGetObjectsResponse response = zabbixApi.graph().getobjects(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        GraphObject obj = response.getResult().get(0);
        assertNotNull(obj.getName());
    }
}
