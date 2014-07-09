package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyTriggerPrototype extends ZabbixApiTestDummyMethodBase {
    public DummyTriggerPrototype(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        TriggerPrototypeCreateRequest request = new TriggerPrototypeCreateRequest();

        TriggerPrototypeObject obj = new TriggerPrototypeObject();
        obj.setDescription("test Free disk space is less than 20% on volume {#FSNAME} " + new Date().getTime());
        obj.setExpression("{Zabbix server:vfs.fs.size[{#FSNAME},pfree].last(0)}<20");
        request.addTriggerPrototypeObject(obj);

        TriggerPrototypeCreateResponse response = zabbixApi.triggerPrototype().create(request);

        Integer actualId = response.getResult().getTriggerids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        TriggerPrototypeDeleteRequest request = new TriggerPrototypeDeleteRequest();
        request.addTirggerPrototypeId(targetId);

        TriggerPrototypeDeleteResponse response = zabbixApi.triggerPrototype().delete(request);
    }
}
