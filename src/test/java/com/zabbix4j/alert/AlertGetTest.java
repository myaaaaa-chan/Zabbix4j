package com.zabbix4j.alert;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/21.
 */
public class AlertGetTest extends ZabbixApiTestBase {

    public AlertGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        AlertGetRequest request = new AlertGetRequest();
        AlertGetRequest.Params params = request.getParams();
        params.addHostId(10112);

        AlertGetResponse response = zabbixApi.alert().get(request);
        assertNotNull(response);
    }
}
