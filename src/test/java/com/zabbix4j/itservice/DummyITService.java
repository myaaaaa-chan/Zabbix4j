package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyITService extends ZabbixApiTestDummyMethodBase {

    public DummyITService(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {

        ITServiceCreateRequest request = new ITServiceCreateRequest();
        ITServiceCreateRequest.Params params = request.getParams();
        params.setName("test.itservice.create." + new Date().getTime());
        params.setAlgorithm(ITServiceObject.ALGORITHM.LEAST_ONE_CHILD_PROBLEM.value);
        params.setShowsla(ITServiceObject.SLA.CALCULATE.value);
        params.setGoodsla(99.99f);
        params.setSortorder(1);

        ITServiceCreateResponse response = zabbixApi.itservice().create(request);

        Integer actualId = response.getResult().getServiceids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        ITServiceDeleteRequest request = new ITServiceDeleteRequest();
        request.addServiceId(targetId);

        ITServiceDeleteResponse response = zabbixApi.itservice().delete(request);
    }
}
