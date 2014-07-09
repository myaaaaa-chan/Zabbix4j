package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScreenDeleteTest extends ZabbixApiTestBase {

    public ScreenDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyScreen dummyScreen = new DummyScreen(zabbixApi);
        Integer targetId = dummyScreen.create();

        ScreenDeleteRequest request = new ScreenDeleteRequest();
        request.addScreenId(targetId);

        ScreenDeleteResponse response = zabbixApi.screen().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getScreenids().get(0);
        assertThat(actualId, is(targetId));
    }
}
