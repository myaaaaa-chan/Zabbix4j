package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;

/**
 * @author Suguru Yajima
 */
public class ZabbixApiTestDummyIconMap extends ZabbixApiTestDummyMethodBase {

    public ZabbixApiTestDummyIconMap(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        IconMapCreateRequest request = new IconMapCreateRequest();
        IconMapCreateRequest.Params params = request.getParams();
        params.setName("Icon map Test");
        params.setDefault_iconid(2);

        IconMappingObject obj = new IconMappingObject();
        obj.setInventory_link(1);
        obj.setExpression("server");
        obj.setIconid(3);

        params.addMapping(obj);

        IconMapCreateResponse response = zabbixApi.iconMap().create(request);

        return response.getResult().getIconmapids().get(0);
    }
}
