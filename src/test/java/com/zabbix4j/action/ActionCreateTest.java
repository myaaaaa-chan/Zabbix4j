package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionCreateTest extends ZabbixApiTestBase {
    public ActionCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        final String hostId = "10084";
        final Integer userGroupId = 13;

        ActionCreateRequest request = new ActionCreateRequest();

        ActionCreateRequest.Params param = request.createParam();
        param.setName("action create test1." + new Date().getTime());
        param.setEventsource(0);
        param.setEvaltype(0);
        param.setStatus(0);
        param.setEsc_period(120);
        param.setDef_shortdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
        param.setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}\r\nLast value: {ITEM.LASTVALUE}\r\n\r\n{TRIGGER.URL}");

        ActionCondition ac = new ActionCondition();
        ac.setConditiontype(ActionCondition.CONDITION_TYPE_TRIGGER.HOST.value);
        ac.setOperator(ActionCondition.CONDITION_OPERATOR.EQUAL.value);
        ac.setValue(hostId);
        param.addActionConditon(ac);

        ActionOperation ao = new ActionOperation();
        ao.setOperationtype(0);
        ao.setEsc_period(0);
        ao.setEsc_step_from(1);
        ao.setEsc_step_to(2);
        ao.setEvaltype(0);

        OperationMessageGroup omg = new OperationMessageGroup();
        omg.setUsrgrpid(userGroupId);
        ao.addOpmessageGrp(omg);

        OperationMessage om = new OperationMessage();
        om.setDefault_msg(1);
        om.setMediatypeid(1);
        ao.setOpmessage(om);
        param.addActionOperation(ao);

        ActionCreateResponse response = zabbixApi.action().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actionId = response.getResult().getActionids().get(0);
        assertNotNull(actionId);

        deleteDummy(actionId);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.getParams().add(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
