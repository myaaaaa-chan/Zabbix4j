package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionUpdateTest extends ZabbixApiTestBase {

    public ActionUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer expectedId = createDummyAction();

        ActionUpdateRequest request = new ActionUpdateRequest();
        ActionUpdateRequest.Params params = request.getParams();
        params.setActionid(expectedId);
        params.setName("Action Updated");

        ActionUpdateResponse response = zabbixApi.action().update(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getActionids().get(0);

        deleteDummy(actualId);

        assertEquals(expectedId, actualId);
    }

    private Integer createDummyAction() throws ZabbixApiException {

        ActionCreateRequest request = new ActionCreateRequest();
        ActionCreateRequest.Params params = request.createParam();
        params.setName("action update test1");
        params.setEventsource(0);
        params.setEvaltype(0);
        params.setStatus(0);
        params.setEsc_period(120);
        params.setDef_shortdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
        params.setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}\r\nLast value: {ITEM.LASTVALUE}\r\n\r\n{TRIGGER.URL}");

        ActionCondition ac = new ActionCondition();
        ac.setConditiontype(ActionCondition.CONDITION_TYPE_TRIGGER.HOST.value);
        ac.setOperator(ActionCondition.CONDITION_OPERATOR.EQUAL.value);
        ac.setValue("10109");
        params.addActionConditon(ac);

        ActionOperation ao = new ActionOperation();
        ao.setOperationtype(0);
        ao.setEsc_period(0);
        ao.setEsc_step_from(1);
        ao.setEsc_step_to(2);
        ao.setEvaltype(0);

        OperationMessageGroup omg = new OperationMessageGroup();
        omg.setUsrgrpid(13);
        ao.addOpmessageGrp(omg);

        OperationMessage om = new OperationMessage();
        om.setDefault_msg(1);
        om.setMediatypeid(1);
        ao.setOpmessage(om);

        params.addActionOperation(ao);

        ActionCreateResponse response = zabbixApi.action().create(request);

        return response.getResult().getActionids().get(0);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.getParams().add(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
