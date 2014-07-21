package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeDeleteTest extends ZabbixApiTestBase {

    public GraphPrototypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer targetId = dummyGraphPrototype.create();

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(targetId);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getGraphids().get(0);
        assertThat(targetId, Is.is(actualId));
    }
}
