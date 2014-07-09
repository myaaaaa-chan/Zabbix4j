package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ScreenItemCreateTest extends ZabbixApiTestBase {

    private final Integer screenId = 24;
    private final Integer respurceId= 523;

    public ScreenItemCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        ScreenItemCreateRequest request = new ScreenItemCreateRequest();

        ScreenItemObject obj = new ScreenItemObject();
        obj.setScreenid(screenId);
        obj.setResourcetype(ScreenItemObject.RESOURCE_TYPE.GRAPH.value);
        obj.setResourceid(respurceId);
        obj.setRowspan(0);
        obj.setColspan(0);
        obj.setX(0);
        obj.setY(0);
        request.addScreenItem(obj);

        ScreenItemCreateResponse response = zabbixApi.screenItem().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getScreenitemids().get(0);
        assertNotNull(actualId);
    }
}
