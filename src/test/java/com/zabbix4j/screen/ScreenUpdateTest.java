package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScreenUpdateTest extends ZabbixApiTestBase {

    public ScreenUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyScreen dummyScreen = new DummyScreen(zabbixApi);
        Integer targetId = dummyScreen.create();

        try {
            ScreenUpdateRequest request = new ScreenUpdateRequest();
            ScreenUpdateRequest.Params params = request.getParams();
            params.setScreenid(targetId);
            params.setName("test.screen.updated." + new Date().getTime());

            ScreenUpdateResponse response = zabbixApi.screen().update(request);
            assertNotNull(response);

            Integer actualId = response.getResult().getScreenids().get(0);
            assertThat(actualId, is(targetId));
        } finally {
            dummyScreen.delete(targetId);
        }

    }
}
