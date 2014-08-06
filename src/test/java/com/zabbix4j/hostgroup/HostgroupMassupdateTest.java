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
public class HostgroupMassupdateTest extends ZabbixApiTestBase {
    public HostgroupMassupdateTest() {
        super();
    }

    @Test
    public void testMassupdate1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer target1 = dummyHostgroup.create();
        Integer target2 = dummyHostgroup.create();

        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer host1 = dummyHost.createHost();

        try {
            HostgroupMassupdateRequest request = new HostgroupMassupdateRequest();
            HostgroupMassupdateRequest.Params params = request.getParams();
            params.addHostGroupId(target1);
            params.addHostGroupId(target2);
            params.addHostId(host1);

            HostgroupMassupdateResponse response = zabbixApi.hostgroup().massupdate(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult().getGroupids().get(0), Is.is(target1));
            assertThat(response.getResult().getGroupids().get(1), Is.is(target2));

        } finally {
            dummyHost.deleteHost(host1);

            dummyHostgroup.delete(target1);
            dummyHostgroup.delete(target2);
        }

    }
}
