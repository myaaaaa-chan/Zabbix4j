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

package jp.myaaaaa.zabbix4j.application;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ApplicationGetTest extends ZabbixApiTestBase {

    public ApplicationGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(createDummy());
        ids.add(createDummy2());

        Integer hostId = 10113;
        ApplicationGetRequest request = new ApplicationGetRequest();
        ApplicationGetRequest.Params params = request.getParams();
        params.addHostId(hostId);

        ApplicationGetResponse response = zabbixApi.application().get(request);
        assertNotNull(response);

        deleteDummy(ids.get(0));
        deleteDummy(ids.get(1));

        List<ApplicationGetResponse.Result> resultList = response.getResult();
        for (int i = 0; i < resultList.size(); i++) {
            ApplicationGetResponse.Result result = resultList.get(i);

            assertNotNull(result);
            assertEquals(hostId, result.getHostid());
        }
    }

    private Integer createDummy() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application get test");
        params.setHostid(10113);

        ApplicationCreateResponse response = zabbixApi.application().create(request);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }

    private Integer createDummy2() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application get test2");
        params.setHostid(10113);

        ApplicationCreateResponse response = zabbixApi.application().create(request);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {
        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(id);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
