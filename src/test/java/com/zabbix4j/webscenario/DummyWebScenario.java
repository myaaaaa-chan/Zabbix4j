package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyWebScenario extends ZabbixApiTestDummyMethodBase {
    public DummyWebScenario(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        final Integer hostId = 10084;

        HttpTestCreateRequest request = new HttpTestCreateRequest();
        HttpTestCreateRequest.Params params = request.getParams();

        params.setName("httptest.create." + new Date().getTime());
        params.setHostid(hostId);

        ScenarioStepObject obj = new ScenarioStepObject();
        obj.setName("Homepage");
        obj.setUrl("http://mycompany.com");
        obj.setStatus_codes("200");
        obj.setNo(1);
        params.addScenarioStepObject(obj);

        HttpTestCreateResponse response = zabbixApi.webscenario().create(request);

        Integer actualId = response.getResult().getHttptestids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        HttpTestDeleteRequest request = new HttpTestDeleteRequest();
        request.addHttpTestId(targetId);

        HttpTestDeleteResponse response = zabbixApi.webscenario().delete(request);
    }
}
