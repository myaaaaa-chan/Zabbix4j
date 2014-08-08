package com.zabbix4j.hostinterface;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.host.DummyHost;
import com.zabbix4j.hostinteface.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author suguru yajima 2014
 */
public class DummyHostinterface extends ZabbixApiTestDummyMethodBase {

    private Integer hostId = null;

    public DummyHostinterface(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        hostId = dummyHost.createHost();

        HostInterfaceCreateRequest request = new HostInterfaceCreateRequest();
        HostInterfaceObject obj = request.createParam();
        obj.setDns("test." + new Date().getTime() + "hostinteface.create");
        obj.setHostid(hostId);
        obj.setIp("192.168.100.100");
        obj.setMain(HostInterfaceObject.MAIN.NOT_DEFAULT.value);
        obj.setPort(10050);
        obj.setType(HostInterfaceObject.TYPE.AGENT.value);
        obj.setUseip(HostInterfaceObject.USE_IP.USE_HOST_IP.value);

        HostInterfaceCreateResponse response = zabbixApi.hostInterface().create(request);


        Integer actualId = response.getResult().getInterfaceids().get(0);

        return actualId;
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

    public void delete(Integer targetId) throws ZabbixApiException {

        if (targetId != null) {
            HostInterfaceDeleteRequest request = new HostInterfaceDeleteRequest();
            request.addHostInterfaceId(targetId);

            HostInterfaceDeleteResponse response = zabbixApi.hostInterface().delete(request);
        }

        if (hostId != null) {
            new DummyHost(zabbixApi).deleteHost(hostId);
        }
    }
}
