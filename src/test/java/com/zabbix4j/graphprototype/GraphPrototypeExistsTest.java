package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class GraphPrototypeExistsTest extends ZabbixApiTestBase {
    public GraphPrototypeExistsTest() {
        super();
    }

    @Test
    public void testExists1() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer targetId = dummyGraphPrototype.create();

        try {
            GraphPrototypeExistsRequest request = new GraphPrototypeExistsRequest();
            GraphPrototypeExistsRequest.Params params = request.getParams();
            params.addName(dummyGraphPrototype.name);

            GraphPrototypeExistsResponse response = zabbixApi.graphPrototype().exists(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyGraphPrototype.delete(targetId);
        }

    }

    @Test
    public void testExists2() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer targetId = dummyGraphPrototype.create();

        try {
            GraphPrototypeExistsRequest request = new GraphPrototypeExistsRequest();
            GraphPrototypeExistsRequest.Params params = request.getParams();
            params.addName("test test test");

            GraphPrototypeExistsResponse response = zabbixApi.graphPrototype().exists(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.FALSE));
        } finally {
            dummyGraphPrototype.delete(targetId);
        }

    }
}
