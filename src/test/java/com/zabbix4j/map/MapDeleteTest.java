package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MapDeleteTest extends ZabbixApiTestBase {

    public MapDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyMap dummyMap = new DummyMap(zabbixApi);
        Integer targetId = dummyMap.create();

        MapDeleteRequest request = new MapDeleteRequest();
        request.addMapId(targetId);

        MapDeleteResponse response = zabbixApi.map().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getSysmapids().get(0);
        assertThat(actualId, is(targetId));
    }
}
