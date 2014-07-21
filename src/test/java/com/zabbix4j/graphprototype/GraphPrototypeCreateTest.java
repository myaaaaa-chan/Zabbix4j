package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeCreateTest extends ZabbixApiTestBase {

    public GraphPrototypeCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        final Integer itemId = 22948;
        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.createParam();
        params.setName("test Graphprototype create." + new Date().getTime());
        GraphItem gitem = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid(itemId);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getGraphids().get(0);
        assertNotNull(id);

        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        dummyGraphPrototype.delete(id);
    }
}
