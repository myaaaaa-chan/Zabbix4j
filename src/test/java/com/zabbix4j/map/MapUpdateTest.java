package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MapUpdateTest extends ZabbixApiTestBase {

    public MapUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyMap dummyMap = new DummyMap(zabbixApi);
        Integer targetId = dummyMap.create();


        try {
            MapUpdateRequest request = new MapUpdateRequest();
            MapUpdateRequest.Params params = request.getParams();
            params.setSysmapid(targetId);
            params.setWidth(800);
            params.setHeight(800);

            MapUpdateResponse response = zabbixApi.map().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getSysmapids().get(0);
            assertThat(actualId, is(targetId));

        } finally {
            dummyMap.delete(targetId);
        }
    }
}
