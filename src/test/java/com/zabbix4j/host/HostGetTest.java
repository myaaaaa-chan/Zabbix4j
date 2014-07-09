package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostGetTest extends ZabbixApiTestBase {

    public HostGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer targetHostId = 10108;
        HostGetRequest request = new HostGetRequest();
        HostGetRequest.Params params = request.getParams();

        ArrayList<Integer> hostIds = new ArrayList<Integer>();
        hostIds.add(targetHostId);
        params.setHostids(hostIds);

        params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectApplications(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectDiscoveries(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGraphs(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHostDiscovery(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHttpTests(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectInterfaces(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectInventory(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectMacros(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectParentTemplates(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectScreens(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectTriggers(ZabbixApiParamter.QUERY.extend.name());

        HostGetResponse response = zabbixApi.host().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        HostGetResponse.Result result = response.getResult().get(0);
        assertEquals(targetHostId, result.getHostid());
    }
}
