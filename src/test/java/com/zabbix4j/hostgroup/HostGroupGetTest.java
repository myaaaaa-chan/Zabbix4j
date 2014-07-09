package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class HostGroupGetTest extends ZabbixApiTestBase {

    public HostGroupGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        HostgroupGetRequest request = new HostgroupGetRequest();
        HostgroupGetRequest.Params params = request.getParams();
        params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
        params.addHostId(10105);

        HostgroupGetResponse response = zabbixApi.hostgroup().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
