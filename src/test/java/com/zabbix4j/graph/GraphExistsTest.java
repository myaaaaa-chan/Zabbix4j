package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class GraphExistsTest extends ZabbixApiTestBase {
    public GraphExistsTest() {
        super();
    }

    @Test
    public void testExists() throws Exception {

        GraphExistsRequest request = new GraphExistsRequest();
        GraphExistsRequest.Params params = request.getParams();
        params.addName("test");

        GraphExistsResponse response = zabbixApi.graph().exists(request);
        assertNotNull(response);

        assertThat(response.getResult(), Is.is(Boolean.FALSE));
    }
}
