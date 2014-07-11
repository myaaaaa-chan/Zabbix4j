package com.zabbix4j.hostinterface;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.hostinteface.HostInterfaceGetRequest;
import com.zabbix4j.hostinteface.HostInterfaceGetResponse;

import java.util.ArrayList;

/**
 * @author suguru yajima 2014
 */
public class DummyHostinterface extends ZabbixApiTestDummyMethodBase {


    public DummyHostinterface(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer get(Integer hostId) throws ZabbixApiException {
        HostInterfaceGetRequest request = new HostInterfaceGetRequest();
        HostInterfaceGetRequest.Params params = request.getParams();
        ArrayList<Integer> hostids = new ArrayList<Integer>();
        hostids.add(hostId);
        params.setHostids(hostids);

        HostInterfaceGetResponse response = zabbixApi.hostInterface().get(request);

        return response.getResult().get(0).getInterfaceid();
    }
}
