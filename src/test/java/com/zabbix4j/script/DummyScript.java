package com.zabbix4j.script;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyScript extends ZabbixApiTestDummyMethodBase {
    public DummyScript(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        ScriptCreateRequest request = new ScriptCreateRequest();

        ScriptObject obj = new ScriptObject();
        obj.setName("test.script.create." + new Date().getTime());
        obj.setCommand("reboot server 1");
        obj.setHost_access(ScriptObject.HOST_PERMISSION.WRITE.value);
        obj.setConfirmation("Are you sure you would like to reboot the server?");
        request.addScriptObject(obj);

        ScriptCreateResponse response = zabbixApi.script().create(request);

        Integer actualId = response.getResult().getScriptids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        ScriptDeleteRequest request = new ScriptDeleteRequest();
        request.addScriptId(targetId);

        ScriptDeleteResponse response = zabbixApi.script().delete(request);
    }
}
