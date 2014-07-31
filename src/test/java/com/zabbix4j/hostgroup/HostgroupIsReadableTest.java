package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostgroupIsReadableTest extends ZabbixApiTestBase {

    public HostgroupIsReadableTest() {
        super();
    }

    @Test
    public void testIsReadable1() throws Exception {
        DummyHostgroup dummyHostgroup = new DummyHostgroup(zabbixApi);
        Integer targetId = dummyHostgroup.create();

        try {
            HostgroupIsReadableRequest request = new HostgroupIsReadableRequest();
            request.addHostgroupId(targetId);

            HostgroupIsReadableResponse response = zabbixApi.hostgroup().isreadable(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult(), Is.is(Boolean.TRUE));
        } finally {
            dummyHostgroup.delete(targetId);
        }
    }


    @Test
    public void testIsReadable2() throws Exception {
        Integer targetId = 99999;


        HostgroupIsReadableRequest request = new HostgroupIsReadableRequest();
        request.addHostgroupId(targetId);

        HostgroupIsReadableResponse response = zabbixApi.hostgroup().isreadable(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        assertThat(response.getResult(), Is.is(Boolean.FALSE));


    }
}
