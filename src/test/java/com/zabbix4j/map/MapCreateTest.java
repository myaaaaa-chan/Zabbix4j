package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class MapCreateTest extends ZabbixApiTestBase {

    public MapCreateTest() {
        super();
    }

    @Test
    public void testCreateSimpleMap() throws Exception {
        MapCreateRequest request = new MapCreateRequest();
        MapCreateRequest.Params params = request.getParams();

        params.setName("test.map.create." + new Date().getTime());
        params.setWidth(600);
        params.setHeight(600);

        MapCreateResponse response = zabbixApi.map().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getSysmapids().get(0);
        assertNotNull(actualId);
    }

    @Test
    public void testCreateHostMap() throws Exception {

        MapCreateRequest request = new MapCreateRequest();
        MapCreateRequest.Params params = request.getParams();

        params.setName("test.map.create." + new Date().getTime());
        params.setWidth(600);
        params.setHeight(600);

        MapElementObject obj = new MapElementObject();
        obj.setElementid(10146);
        obj.setSelementid(1);
        obj.setElementtype(MapElementObject.ELEMENT_TYPE.HOST.value);
        obj.setIconid_off(2);
        params.addMapElement(obj);

        MapCreateResponse response = zabbixApi.map().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getSysmapids().get(0);
        assertNotNull(actualId);
    }
}
