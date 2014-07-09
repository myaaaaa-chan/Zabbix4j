package com.zabbix4j.discoveredservice;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DServiceGetTest extends ZabbixApiTestBase {

    public DServiceGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        DServiceGetRequest request = new DServiceGetRequest();
        DServiceGetRequest.Params params = request.getParams();
        params.addDHostId(10105);

        DServiceGetResponse response = zabbixApi.discoveredService().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
