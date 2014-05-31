/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package jp.myaaaaa.zabbix4j.action;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

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

        ActionCreateRequest request = new ActionCreateRequest();
        ActionCreateRequest.Params params = request.getParams();
        params.setName("action create test1");
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
