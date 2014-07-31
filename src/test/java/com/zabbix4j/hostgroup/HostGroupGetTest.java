package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class HostGroupGetTest extends ZabbixApiTestBase {

    public HostGroupGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId = dummyHostgroup.create();

        try {
            HostgroupGetRequest request = new HostgroupGetRequest();
            HostgroupGetRequest.Params params = request.getParams();
            params.addGroupId(targetId);
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectTemplates(ZabbixApiParamter.QUERY.extend.name());

            HostgroupGetResponse response = zabbixApi.hostgroup().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            HostgroupObject obj = response.getResult().get(0);
            assertNotNull(obj);

            assertThat(obj.getGroupid(), Is.is(targetId));
        } finally {
            dummyHostgroup.delete(targetId);
        }
    }
}
