package com.zabbix4j.trigger;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/10.
 */
public class TriggerCreateTest extends ZabbixApiTestBase {
    public TriggerCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        TriggerCreateRequest request = new TriggerCreateRequest();
        TriggerCreateRequest.Params params = request.getParams();
        params.setComments("trigger create comment");
        params.setDescription("triggger create description");
        params.setExpression("{test host created1:agent.ping.last()}=1");

        TriggerCreateResponse response = zabbixApi.trigger().create(request);

        assertNotNull(response);
        Integer triggerId = response.getResult().getTriggerids().get(0);
        assertNotNull(triggerId);

        deleteTestTrigger(triggerId);
    }

    private void deleteTestTrigger(Integer triggerid) throws ZabbixApiException {

        TriggerDeleteRequest request = new TriggerDeleteRequest();
        request.getParams().add(triggerid);

        TriggerDeleteResponse response = zabbixApi.trigger().delete(request);
    }
}
