package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class IconMapDeleteTest extends ZabbixApiTestBase {
    public IconMapDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        ZabbixApiTestDummyIconMap dummy = new ZabbixApiTestDummyIconMap(zabbixApi);
        Integer targetId = dummy.create();
        IconMapDeleteRequest request = new IconMapDeleteRequest();
        request.addIconMapId(targetId);

        IconMapDeleteResponse response = zabbixApi.iconMap().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getIconmapids().get(0);
        assertThat(targetId, Is.is(actualId));
    }
}
