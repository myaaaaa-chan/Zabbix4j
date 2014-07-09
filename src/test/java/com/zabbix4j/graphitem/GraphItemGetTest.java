package com.zabbix4j.graphitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


/**
 * Created by Suguru Yajima on 2014/06/01.
 */
public class GraphItemGetTest extends ZabbixApiTestBase {


    public GraphItemGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        GraphItemGetRequest request = new GraphItemGetRequest();
        GraphItemGetRequest.Params params = request.getParams();

        GraphItemGetResponse response = zabbixApi.graphItem().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        GraphItemObject item = response.getResult().get(0);
        assertNotNull(item);

        assertNotNull(item.getCalc_fnc());
        assertNotNull(item.getColor());
        assertNotNull(item.getDrawtype());
        assertNotNull(item.getGitemid());
        assertNotNull(item.getGraphid());
        assertNotNull(item.getItemid());
        assertNotNull(item.getSortorder());
        assertNotNull(item.getType());
        assertNotNull(item.getYaxisside());
    }
}
