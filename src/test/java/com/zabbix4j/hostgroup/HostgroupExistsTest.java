package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupExistsTest extends ZabbixApiTestBase {

    public HostgroupExistsTest() {
        super();
    }

    @Test
    public void testExists1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId = dummyHostgroup.create();

        try {
            HostgroupExistsRequest request = new HostgroupExistsRequest();
            HostgroupExistsRequest.Params params = request.getParams();
            params.addGroupId(targetId);

            HostgroupExistsResponse response = zabbixApi.hostgroup().exist(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyHostgroup.delete(targetId);
        }
    }

    @Test
    public void testExists2() throws Exception {
        HostgroupExistsRequest request = new HostgroupExistsRequest();
        HostgroupExistsRequest.Params params = request.getParams();
        params.addGroupId(99999);

        HostgroupExistsResponse response = zabbixApi.hostgroup().exist(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        assertThat(response.getResult(), Is.is(Boolean.FALSE));
    }
}
