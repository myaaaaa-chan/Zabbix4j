package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.DummyHost;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupMassremoveTest extends ZabbixApiTestBase {
    public HostgroupMassremoveTest() {
        super();
    }

    @Test
    public void testMassremove1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        DummyHost dummyHost = new DummyHost(zabbixApi);

        Integer target1 = dummyHostgroup.create();
        Integer target2 = dummyHostgroup.create();
        Integer host1 = null;
        Integer host2 = null;

        try {
            host1 = dummyHost.createHost();
            host2 = dummyHost.createHost();

            HostgroupMassaddRequest request = new HostgroupMassaddRequest();
            HostgroupMassaddRequest.Params params = request.getParams();
            params.addHostGroupId(target1);
            params.addHostGroupId(target2);
            params.addHostId(host1);
            params.addHostId(host2);

            HostgroupMassaddResponse response = zabbixApi.hostgroup().massadd(request);

            HostgroupMassremoveRequest request1 = new HostgroupMassremoveRequest();
            HostgroupMassremoveRequest.Params params1 = request1.getParams();
            params1.addHostGroupId(target1);
            params1.addHostGroupId(target2);
            params1.addHostId(host1);
            params1.addHostId(host2);

            HostgroupMassremoveResponse response1 = zabbixApi.hostgroup().massremove(request1);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response1.getResult().getGroupids().get(0), Is.is(target1));
            assertThat(response1.getResult().getGroupids().get(1), Is.is(target2));
        } finally {
            dummyHost.deleteHost(host1);
            dummyHost.deleteHost(host2);

            dummyHostgroup.delete(target1);
            dummyHostgroup.delete(target2);
        }

    }
}
