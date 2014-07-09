package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyProxy extends ZabbixApiTestDummyMethodBase {
    public DummyProxy(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        final Integer hostId = 10147;

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        params.addHostId(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);

        Integer actualId = response.getResult().getProxyids().get(0);

        return actualId;
    }

    public Integer createWithoutHost() throws ZabbixApiException {
        final Integer hostId = 10147;

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        //params.addHostId(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);

        Integer actualId = response.getResult().getProxyids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        ProxyDeleteRequest request = new ProxyDeleteRequest();
        request.addProxyId(targetId);

        ProxyDeleteResponse response = zabbixApi.proxy().delete(request);
    }
}
