package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.screenitem.ScreenItemObject;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyTemplateScreen extends ZabbixApiTestDummyMethodBase {
    private final Integer templateId = 10166;
    private final Integer resourceId = 495;

    public DummyTemplateScreen(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        TemplateScreenCreateRequest request = new TemplateScreenCreateRequest();
        TemplateScreenCreateRequest.Params params = request.getParams();
        params.setName("test.templatescreen.create." + new Date().getTime());
        params.setTemplateid(templateId);
        params.setHsize(3);
        params.setVsize(2);

        ScreenItemObject obj = new ScreenItemObject();
        obj.setResourcetype(ScreenItemObject.RESOURCE_TYPE.GRAPH.value);
        obj.setResourceid(resourceId);
        obj.setRowspan(0);
        obj.setColspan(0);
        obj.setX(0);
        obj.setY(0);
        params.addScreenItem(obj);

        TemplateScreenCreateResponse response = zabbixApi.templateScreen().create(request);

        Integer actualId = response.getResult().getScreenids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        TemplateScreenDeleteRequest request = new TemplateScreenDeleteRequest();
        request.addTemplateScreenId(targetId);

        TemplateScreenDeleteResponse response = zabbixApi.templateScreen().delete(request);
    }
}
