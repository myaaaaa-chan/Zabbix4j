package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeUpdateTest extends ZabbixApiTestBase {

    public GraphPrototypeUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {
        DummyGraphPrototype dummyGraphPrototype = new DummyGraphPrototype(zabbixApi);
        Integer expectedId = dummyGraphPrototype.create();

        try {
            GraphPrototypeUpdateRequest request = new GraphPrototypeUpdateRequest();
            GraphPrototypeUpdateRequest.Params params = request.createParam();
            params.setGraphid(expectedId);
            params.setName("Grpahprototype update success");
            params.setWidth(100);
            params.setHeight(800);

            GraphPrototypeUpdateResponse response = zabbixApi.graphPrototype().update(request);
            assertNotNull(response);
            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getGraphids().get(0);
            assertThat(expectedId, is(expectedId));
        } finally {
            dummyGraphPrototype.delete(expectedId);
        }
    }
}
