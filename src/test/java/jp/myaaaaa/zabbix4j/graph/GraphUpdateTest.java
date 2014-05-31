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

package jp.myaaaaa.zabbix4j.graph;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphUpdateTest extends ZabbixApiTestBase {

    public GraphUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer targetId = createDummyGraph();

        GraphUpdateRequest request = new GraphUpdateRequest();
        GraphUpdateRequest.Params params = request.getParams();
        params.setName("Graph Updated Test Success");
        params.setGraphid(targetId);

        GraphUpdateResponse response = zabbixApi.graph().update(request);
        assertNotNull(request);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getGraphids().get(0);

        assertEquals(targetId, actualId);
    }

    private Integer createDummyGraph () throws ZabbixApiException {

        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.getParams();
        params.setName("Graph Update Test");

        GraphItem gitem = new GraphItem();
        gitem.setItemid(23661);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);

        return response.getResult().getGraphids().get(0);
    }
 }
