package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class DummyScreenItem extends ZabbixApiTestDummyMethodBase {
    private final Integer screenId = 24;
    private final Integer respurceId = 523;

    public DummyScreenItem(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        ScreenItemCreateRequest request = new ScreenItemCreateRequest();

        ScreenItemObject obj = new ScreenItemObject();
        obj.setScreenid(screenId);
        obj.setResourcetype(ScreenItemObject.RESOURCE_TYPE.GRAPH.value);
        obj.setResourceid(respurceId);
        obj.setRowspan(0);
        obj.setColspan(0);
        obj.setX(0);
        obj.setY(1);
        request.addScreenItem(obj);

        ScreenItemCreateResponse response = zabbixApi.screenItem().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getScreenitemids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        ScreenItemDeleteRequest request = new ScreenItemDeleteRequest();
        request.addScreenItemId(targetId);

        ScreenItemDeleteResponse response = zabbixApi.screenItem().delete(request);
    }
}
