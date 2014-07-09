package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class IconMapCreateTest extends ZabbixApiTestBase {

    public IconMapCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        IconMapCreateRequest request = new IconMapCreateRequest();
        IconMapCreateRequest.Params params = request.getParams();
        params.setName("Type icons");
        params.setDefault_iconid(2);

        IconMappingObject obj = new IconMappingObject();
        obj.setInventory_link(1);
        obj.setExpression("server");
        obj.setIconid(3);

        params.addMapping(obj);

        IconMapCreateResponse response = zabbixApi.iconMap().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer createdId = response.getResult().getIconmapids().get(0);
        assertNotNull(createdId);
    }
}
