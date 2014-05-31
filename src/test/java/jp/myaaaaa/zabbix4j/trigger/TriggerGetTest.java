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

package jp.myaaaaa.zabbix4j.trigger;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

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

    private Integer createDummyTrigger () throws ZabbixApiException {

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
