package com.zabbix4j.discoverdhost;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.discoveredhost.DHostExistRequest;
import com.zabbix4j.discoveredhost.DHostExistResponse;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DHostExistTest extends ZabbixApiTestBase {

    public DHostExistTest() {
        super();
    }

    @Test
    public void testExist1() throws Exception {
        DHostExistRequest request = new DHostExistRequest();
        DHostExistRequest.Params params = request.getParams();
        params.addDHostId(10105);

        DHostExistResponse response = zabbixApi.discoverdHost().exist(request);
        assertNotNull(response);
        assertFalse(response.getResult());

        logger.debug(getGson().toJson(response));
    }
}
