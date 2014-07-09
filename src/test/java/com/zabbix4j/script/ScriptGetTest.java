package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScriptGetTest extends ZabbixApiTestBase {
    public ScriptGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {

        final Integer targetId = 7;

        ScriptGetRequest request = new ScriptGetRequest();
        ScriptGetRequest.Params params = request.getParams();
        params.addScriptId(targetId);
        params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());

        ScriptGetResponse response = zabbixApi.script().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        ScriptGetResponse.Result result = response.getResult().get(0);
        assertThat(result.getScriptid(), Is.is(targetId));

        assertThat(result.getDescription(), Is.is("test.script.get"));
    }
}
