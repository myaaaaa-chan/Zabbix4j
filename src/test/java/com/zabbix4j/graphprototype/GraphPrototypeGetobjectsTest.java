package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class GraphPrototypeGetobjectsTest extends ZabbixApiTestBase {
    public GraphPrototypeGetobjectsTest() {
        super();
    }


    @Test
    public void testGetObjects() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer targetId = dummyGraphPrototype.create();

        try {
            GraphPrototypeGetobjectsRequest request = new GraphPrototypeGetobjectsRequest();
            GraphPrototypeGetobjectsRequest.Params params = request.getParams();

            params.setGraphid(targetId);

            GraphPrototypeGetobjectsResponse response = zabbixApi.graphPrototype().getobjects(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            GraphPrototypeObject obj = response.getResult().get(0);
            assertThat(obj.getGraphid(), Is.is(targetId));
        } finally {
            dummyGraphPrototype.delete(targetId);
        }

    }
}
