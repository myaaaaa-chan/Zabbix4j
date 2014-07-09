package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ScriptCreateTest extends ZabbixApiTestBase {
    public ScriptCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        ScriptCreateRequest request = new ScriptCreateRequest();

        ScriptObject obj = new ScriptObject();
        obj.setName("test.script.create." + new Date().getTime());
        obj.setCommand("reboot server 1");
        obj.setHost_access(ScriptObject.HOST_PERMISSION.WRITE.value);
        obj.setConfirmation("Are you sure you would like to reboot the server?");
        request.addScriptObject(obj);

        ScriptCreateResponse response = zabbixApi.script().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getScriptids().get(0);
        assertNotNull(actualId);
    }
}
