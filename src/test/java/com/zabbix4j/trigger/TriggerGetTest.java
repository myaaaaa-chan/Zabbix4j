package com.zabbix4j.trigger;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/13.
 */
public class TriggerGetTest extends ZabbixApiTestBase {

    public TriggerGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer triggerId = createDummyTrigger();

        TriggerGetRequest request = new TriggerGetRequest();
        TriggerGetRequest.Params params = request.getParams();
        params.addTriggerid(triggerId);

        TriggerGetResponse response = zabbixApi.trigger().get(request);

        deleteDummyTrigger(triggerId);

        assertNotNull(response);

        TriggerGetResponse.Result result = response.getResult().get(0);

        logger.debug(getGson().toJson(response));

        String comment = result.getComments();

        assertEquals("trigger get comment", comment);
    }

    private Integer createDummyTrigger() throws ZabbixApiException {

        TriggerCreateRequest request = new TriggerCreateRequest();
        TriggerCreateRequest.Params params = request.getParams();
        params.setComments("trigger get comment");
        params.setDescription("triggger get description");
        params.setExpression("{test host created1:system.swap.size[,total].last()}=0");

        TriggerCreateResponse response = zabbixApi.trigger().create(request);

        return response.getResult().getTriggerids().get(0);
    }

    private void deleteDummyTrigger(Integer triggerid) throws ZabbixApiException {

        TriggerDeleteRequest request = new TriggerDeleteRequest();
        request.getParams().add(triggerid);

        TriggerDeleteResponse response = zabbixApi.trigger().delete(request);
    }
}
