package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author suguru yajima 2014
 */
public class DummyHostgroup extends ZabbixApiTestDummyMethodBase {
    public DummyHostgroup(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        HostgroupCreateRequest request = new HostgroupCreateRequest();
        HostgroupCreateRequest.Params params = request.createParam();
        params.setName("test hostgroup.create." + new Date().getTime());

        HostgroupCreateResponse response = zabbixApi.hostgroup().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getGroupids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        HostgroupDeleteRequest request = new HostgroupDeleteRequest();
        request.addHostgroupId(targetId);

        HostgroupDeleteResponse response = zabbixApi.hostgroup().delete(request);
    }
}
