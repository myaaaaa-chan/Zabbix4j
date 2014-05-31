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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/23.
 */
public class ApplicationUpdateTest extends ZabbixApiTestBase {

    public ApplicationUpdateTest() {
        super();
    }

    @Test
    public void testUpdte() throws Exception {

        Integer expected = createDummy();

        ApplicationUpdateRequest request = new ApplicationUpdateRequest();
        ApplicationUpdateRequest.Params params = request.getParams();
        params.setApplicationid(expected);
        params.setName("Applicaton updated");

        ApplicationUpdateResponse response = zabbixApi.application().update(request);
        assertNotNull(response);

        Integer actual = response.getResult().getApplicationids().get(0);

        delete(actual);

        assertEquals(expected, actual);
    }

    private Integer createDummy() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application before update");
        params.setHostid(10113);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }

    private void delete(Integer id) throws ZabbixApiException {

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(id);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
