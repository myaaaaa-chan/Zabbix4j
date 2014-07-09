package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScreenItemDeleteTest extends ZabbixApiTestBase {
    public ScreenItemDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyScreenItem dummyScreenItem = new DummyScreenItem(zabbixApi);
        Integer targetId = dummyScreenItem.create();

        ScreenItemDeleteRequest request = new ScreenItemDeleteRequest();
        request.addScreenItemId(targetId);

        ScreenItemDeleteResponse response = zabbixApi.screenItem().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getScreenitemids().get(0);
        assertThat(actualId, is(targetId));
    }
}
