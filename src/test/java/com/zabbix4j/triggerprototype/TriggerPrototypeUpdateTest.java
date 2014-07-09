package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeUpdateTest extends ZabbixApiTestBase {
    public TriggerPrototypeUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyTriggerPrototype dummyTriggerPrototype = new DummyTriggerPrototype(zabbixApi);
        Integer targetId = dummyTriggerPrototype.create();

        try {
            TriggerPrototypeUpdateRequest request = new TriggerPrototypeUpdateRequest();

            TriggerPrototypeObject obj = new TriggerPrototypeObject();
            obj.setTriggerid(targetId);
            obj.setStatus(TriggerPrototypeObject.STATUS.DISABLED.value);
            obj.setDescription("hogehogehoge");
            request.addTriggerPrototypeObject(obj);

            TriggerPrototypeUpdateResponse response = zabbixApi.triggerPrototype().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getTriggerids().get(0);
            assertThat(actualId, Is.is(targetId));
        } finally {
            dummyTriggerPrototype.delete(targetId);
        }
    }
}
