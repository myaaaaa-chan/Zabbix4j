package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostExistTest extends ZabbixApiTestBase {

    public HostExistTest() {
        super();
    }

    @Test
    public void testExist1() throws Exception {

        int hostId = 10108;

        HostExistRequest request = new HostExistRequest();
        HostExistRequest.Params params = request.getParams();
        params.addHostId(hostId);

        HostExistResponse response = zabbixApi.host().exist(request);

        assertNotNull(response);
        assertTrue(response.isResult());
    }

    @Test
    public void testExist2() throws Exception {

        int hostId = 999999;

        HostExistRequest request = new HostExistRequest();
        HostExistRequest.Params params = request.getParams();
        params.addHostId(hostId);

        HostExistResponse response = zabbixApi.host().exist(request);

        assertNotNull(response);
        assertFalse(response.isResult());
    }
}
