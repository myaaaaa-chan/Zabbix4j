package com.zabbix4j.item;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.hostinterface.DummyHostinterface;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author suguru yajima 2014
 */
public class DummyItem extends ZabbixApiTestDummyMethodBase {
    public DummyItem(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        final Integer hostId = 10084;

        DummyHostinterface dummyHostinterface = new DummyHostinterface(zabbixApi);
        Integer ifId = dummyHostinterface.get(hostId);

        ItemCreateRequest request = new ItemCreateRequest();
        ItemCreateRequest.Params params = request.getParams();
        params.setName("test Item." + new Date().getTime());
        params.setDelay(60);
        params.setHostid(hostId);
        params.setKey_("agent.hostname." + new Date().getTime());
        params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
        params.setType(0);
        params.setInterfaceid(ifId);

        ItemCreateResponse response = zabbixApi.item().create(request);

        return response.getResult().getItemids().get(0);
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        ItemDeleteRequest request = new ItemDeleteRequest();
        ArrayList<Integer> itemids = new ArrayList<Integer>();
        itemids.add(targetId);
        request.setParams(itemids);

        ItemDeleteResponse response = zabbixApi.item().delete(request);
    }
}
