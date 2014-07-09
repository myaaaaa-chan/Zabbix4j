package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TriggerProrotypeDeleteTest extends ZabbixApiTestBase {
    public TriggerProrotypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyTriggerPrototype dummyTriggerPrototype = new DummyTriggerPrototype(zabbixApi);
        Integer targetId = dummyTriggerPrototype.create();

        TriggerPrototypeDeleteRequest request = new TriggerPrototypeDeleteRequest();
        request.addTirggerPrototypeId(targetId);

        TriggerPrototypeDeleteResponse response = zabbixApi.triggerPrototype().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getTriggerids().get(0);

        assertThat(actualId, Is.is(targetId));
    }
}
