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

package jp.myaaaaa.zabbix4j.item;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiParamter;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/09.
 */
public class ItemDeleteTest extends ZabbixApiTestBase {

    public ItemDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer expectedItemid = createItem();
        ItemDeleteRequest request = new ItemDeleteRequest();
        ArrayList<Integer> itemids = new ArrayList<Integer>();
        itemids.add(expectedItemid);
        request.setParams(itemids);

        ItemDeleteResponse response = zabbixApi.item().delete(request);

        assertNotNull(response);

        Integer actualItemid = response.getResult().getItemids().get(0);

        assertEquals(expectedItemid, actualItemid);
    }

    private Integer createItem () throws ZabbixApiException {

        ItemCreateRequest request = new ItemCreateRequest();
        ItemCreateRequest.Params params = request.getParams();
        params.setName("Test Item for Delete");
        params.setDelay(60);
        params.setHostid(10109);
        params.setKey_("agent.ping");
        params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
        params.setType(0);
        params.setInterfaceid(6);

        ItemCreateResponse response = zabbixApi.item().create(request);

        return response.getResult().getItemids().get(0);
    }
}
