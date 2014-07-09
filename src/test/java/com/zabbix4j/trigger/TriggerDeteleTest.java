package com.zabbix4j.trigger;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/12.
 */
public class TriggerDeteleTest extends ZabbixApiTestBase {

    public TriggerDeteleTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer expectedId = createDummyTrigger();

        TriggerDeleteRequest request = new TriggerDeleteRequest();
        request.getParams().add(expectedId);

        TriggerDeleteResponse response = zabbixApi.trigger().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getTriggerids().get(0);

        assertEquals(expectedId, actualId);
    }

    private Integer createDummyTrigger() throws ZabbixApiException {

        TriggerCreateRequest request = new TriggerCreateRequest();
        TriggerCreateRequest.Params params = request.getParams();
        params.setComments("trigger delete comment");
        params.setDescription("triggger delete description");
        params.setExpression("{test host created1:vm.memory.size[total].last()}=0");

        TriggerCreateResponse response = zabbixApi.trigger().create(request);

        Integer triggerId = response.getResult().getTriggerids().get(0);

        return triggerId;
    }
}
