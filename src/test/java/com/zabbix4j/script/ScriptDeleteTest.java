package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScriptDeleteTest extends ZabbixApiTestBase {
    public ScriptDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyScript dummyScript = new DummyScript(zabbixApi);
        Integer targetId = dummyScript.create();

        ScriptDeleteRequest request = new ScriptDeleteRequest();
        request.addScriptId(targetId);

        ScriptDeleteResponse response = zabbixApi.script().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getScriptids().get(0);
        assertThat(actualId, is(targetId));
    }
}
