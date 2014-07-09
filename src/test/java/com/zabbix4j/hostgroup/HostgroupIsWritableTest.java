package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by Suguru Yajima on 2014/04/30.
 */
public class HostgroupIsWritableTest extends ZabbixApiTestBase {

    public HostgroupIsWritableTest() {
        super();
    }

    @Test
    public void testIsWritable1() throws Exception {

        try {
            Integer targetId = getHostGroup();

            HostgroupIsWritableRequest request = new HostgroupIsWritableRequest();
            request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetId})));

            HostgroupIsWritableResponse response = zabbixApi.hostgroup().isWritable(request);

            assertNotNull(response);
            assertTrue(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    private Integer getHostGroup() throws ZabbixApiException {

        HostgroupGetRequest request = new HostgroupGetRequest();
        HostgroupGetRequest.Params params = request.getParams();
        params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());

        HostgroupGetResponse getResponse = zabbixApi.hostgroup().get(request);
        int targetGroupId = getResponse.getResult().get(0).getGroupid();

        return targetGroupId;
    }

    @Test
    public void testIsWritable2() throws Exception {

        try {
            HostgroupGetRequest getRequest = new HostgroupGetRequest();
            ArrayList<String> name = new ArrayList<String>();
            name.add("test_readable_writable_hostgroup");
            getRequest.getParams().getFilter().setName(name);

            HostgroupGetResponse getResponse = zabbixApi.hostgroup().get(getRequest);
            int targetGroupId = getResponse.getResult().get(0).getGroupid();

            // login as guest
            login("guest", "");

            HostgroupIsWritableRequest request = new HostgroupIsWritableRequest();
            request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupId})));

            HostgroupIsWritableResponse response = zabbixApi.hostgroup().isWritable(request);

            assertNotNull(response);
            assertFalse(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }


}
