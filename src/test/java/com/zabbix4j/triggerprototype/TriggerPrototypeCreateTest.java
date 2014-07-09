package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeCreateTest extends ZabbixApiTestBase {
    public TriggerPrototypeCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        TriggerPrototypeCreateRequest request = new TriggerPrototypeCreateRequest();

        TriggerPrototypeObject obj = new TriggerPrototypeObject();
        obj.setDescription("Free disk space is less than 20% on volume {#FSNAME} " + new Date().getTime());
        obj.setExpression("{Zabbix server:vfs.fs.size[{#FSNAME},pfree].last(0)}<20");
        request.addTriggerPrototypeObject(obj);

        TriggerPrototypeCreateResponse response = zabbixApi.triggerPrototype().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getTriggerids().get(0);
        assertNotNull(actualId);
    }
}
