package com.zabbix4j.discoveredservice;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DServiceExistTest extends ZabbixApiTestBase {

    public DServiceExistTest() {
        super();
    }

    @Test
    public void testExist1() throws Exception {
        DServiceExistRequest request = new DServiceExistRequest();
        DServiceExistRequest.Params params = request.getParams();
        params.setNode("hogehoge");

        DServiceExistResponse response = zabbixApi.discoveredService().exist(request);
        assertNotNull(response);
        assertFalse(response.getResult());

        logger.debug(getGson().toJson(response));
    }
}
