package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScreenItemUpdateTest extends ZabbixApiTestBase {

    public ScreenItemUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyScreenItem dummyScreenItem = new DummyScreenItem(zabbixApi);
        Integer targetId = dummyScreenItem.create();

        try {
            ScreenItemUpdateRequest request = new ScreenItemUpdateRequest();
            ScreenItemObject obj = new ScreenItemObject();
            obj.setScreenitemid(targetId);
            obj.setWidth(500);
            obj.setHeight(500);
            request.addScreenItem(obj);

            ScreenItemUpdateResponse response = zabbixApi.screenItem().update(request);
            assertNotNull(response);

            Integer actualId = response.getResult().getScreenitemids().get(0);
            assertThat(actualId, is(targetId));
        } finally {
            dummyScreenItem.delete(targetId);
        }

    }
}
