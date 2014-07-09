package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScriptUpdateTest extends ZabbixApiTestBase {
    public ScriptUpdateTest() {
        super();
    }


    @Test
    public void testUpdate() throws Exception {
        DummyScript dummyScript = new DummyScript(zabbixApi);
        Integer targetId = dummyScript.create();

        try {
            ScriptUpdateRequest request = new ScriptUpdateRequest();
            ScriptObject obj = new ScriptObject();
            obj.setScriptid(targetId);
            obj.setCommand("/bin/ping -c 10 {HOST.CONN} 2>&1");
            request.addScriptObjrct(obj);

            ScriptUpdateResponse response = zabbixApi.script().update(request);
            assertNotNull(response);

            Integer actualId = response.getResult().getScriptids().get(0);
            assertThat(actualId, Is.is(targetId));
        } finally {
            dummyScript.delete(targetId);
        }

    }
}
