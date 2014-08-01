package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupGetobjectsTest extends ZabbixApiTestBase {
    public HostgroupGetobjectsTest() {
        super();
    }

    @Test
    public void testGetobjects1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId1 = dummyHostgroup.create();
        Integer targetId2 = dummyHostgroup.create();

        try {
            HostgroupGetobjectsRequest request = new HostgroupGetobjectsRequest();
            HostgroupGetobjectsRequest.Params params = request.getParams();
            params.addGroupId(targetId1);
            params.addGroupId(targetId2);

            HostgroupGetobjectsResponse response = zabbixApi.hostgroup().getobjects(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            HostgroupObject o1 = response.getResult().get(0);
            HostgroupObject o2 = response.getResult().get(1);

            assertNotNull(o1);
            assertNotNull(o2);

            assertThat(o1.getGroupid(), Is.is(targetId1));
            assertThat(o2.getGroupid(), Is.is(targetId2));
        } finally {
            dummyHostgroup.delete(targetId1);
            dummyHostgroup.delete(targetId2);
        }
    }
}
