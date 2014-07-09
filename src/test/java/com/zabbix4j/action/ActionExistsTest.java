package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author yajima 2014
 */
public class ActionExistsTest extends ZabbixApiTestBase {
    public ActionExistsTest() {
        super();
    }

    @Test
    public void testExists() throws Exception {
        final Integer actionid = 25;

        ActionExistsRequest request = new ActionExistsRequest();
        ActionExistsRequest.Params params = request.getParams();
        params.addActionId(actionid);

        ActionExistsResponse response = zabbixApi.action().exists(request);
        assertNotNull(response);

        Boolean result = response.getResult();
        assertFalse(result);
    }
}
