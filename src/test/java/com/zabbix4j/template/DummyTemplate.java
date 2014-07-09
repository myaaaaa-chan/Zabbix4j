package com.zabbix4j.template;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyTemplate extends ZabbixApiTestDummyMethodBase {
    public DummyTemplate(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {

        final Integer groupId = 25;
        final Integer hostId = 10084;

        TemplateCreateRequest request = new TemplateCreateRequest();
        TemplateCreateRequest.Params params = request.getParams();
        params.setHost("test.template.create." + new Date().getTime());
        params.addGroupId(groupId);
        params.addHostId(hostId);

        TemplateCreateResponse response = zabbixApi.template().create(request);

        Integer acutalId = response.getResult().getTemplateids().get(0);

        return acutalId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        TemplateDeleteRequest request = new TemplateDeleteRequest();
        request.addTemplateId(targetId);

        TemplateDeleteResponse response = zabbixApi.template().delete(request);

    }
}
