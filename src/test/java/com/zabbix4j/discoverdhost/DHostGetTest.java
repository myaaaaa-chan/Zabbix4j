package com.zabbix4j.discoverdhost;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.discoveredhost.DHostGetRequest;
import com.zabbix4j.discoveredhost.DHostGetResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DHostGetTest extends ZabbixApiTestBase {

    public DHostGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        final Integer hostId = 10084;
        DHostGetRequest request = new DHostGetRequest();
        DHostGetRequest.Params params = request.getParams();
        params.addDHostId(hostId);

        DHostGetResponse response = zabbixApi.discoverdHost().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
