package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupDeleteTest extends ZabbixApiTestBase {
    public HostgroupDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId = dummyHostgroup.create();

        HostgroupDeleteRequest request = new HostgroupDeleteRequest();
        request.addHostgroupId(targetId);

        HostgroupDeleteResponse response = zabbixApi.hostgroup().delete(request);
        assertNotNull(response);


        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getGroupids().get(0);
        assertThat(actualId, Is.is(targetId));
    }
}
