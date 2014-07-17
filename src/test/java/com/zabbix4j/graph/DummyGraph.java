package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author suguru yajima 2014
 */
public class DummyGraph extends ZabbixApiTestDummyMethodBase {
    public DummyGraph(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        final Integer itemId = 23287;

        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.createParam();
        params.setName("Graph Create Test." + new Date().getTime());

        GraphItem gitem = new GraphItem();
        gitem.setItemid(itemId);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);

        Integer id = response.getResult().getGraphids().get(0);
        return id;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        GraphDeleteRequest request = new GraphDeleteRequest();
        request.getParams().add(targetId);

        GraphDeleteResponse response = zabbixApi.graph().delete(request);
    }
}
