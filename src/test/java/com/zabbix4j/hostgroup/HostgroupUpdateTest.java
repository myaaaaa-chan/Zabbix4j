package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.Host;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupUpdateTest extends ZabbixApiTestBase {
    public HostgroupUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId  = dummyHostgroup.create();

        try {
            HostgroupUpdateRequest request = new HostgroupUpdateRequest();

            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(targetId);
            obj.setName("test hostgroup.update" + new Date().getTime());
            request.addHostgroup(obj);

            HostgroupUpdateResponse response = zabbixApi.hostgroup().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getGroupids().get(0);
            assertThat(actualId, Is.is(targetId));
        } finally {
            dummyHostgroup.delete(targetId);
        }
    }
}
