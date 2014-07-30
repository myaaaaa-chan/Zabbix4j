package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author suguru yajima 2014
 */
public class HostgroupCreateTest extends ZabbixApiTestBase {
    public HostgroupCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        HostgroupCreateRequest request = new HostgroupCreateRequest();
        HostgroupCreateRequest.Params params = request.createParam();
        params.setName("test hostgroup.create." + new Date().getTime());

        HostgroupCreateResponse response = zabbixApi.hostgroup().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getGroupids().get(0);
        assertNotNull(actualId);
    }
}
