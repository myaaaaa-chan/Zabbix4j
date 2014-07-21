package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.graph.GraphItem;

import java.util.Date;

/**
 * @author suguru yajima 2014
 */
public class DummyGraphPrototype extends ZabbixApiTestDummyMethodBase {
    public DummyGraphPrototype(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        final Integer itemId = 22948;
        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.createParam();
        params.setName("test Graphprototype create." + new Date().getTime());
        GraphItem gitem = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid(itemId);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);

        Integer id = response.getResult().getGraphids().get(0);

        return id;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(targetId);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
    }
}
