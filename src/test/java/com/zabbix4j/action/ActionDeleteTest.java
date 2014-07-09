package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionDeleteTest extends ZabbixApiTestBase {

    public ActionDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyAction dummyAction = new DummyAction(zabbixApi);
        Integer expectedId = dummyAction.create();

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.getParams().add(expectedId);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getActionids().get(0);
        assertThat(actualId, Is.is(expectedId));
    }

}
