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

package jp.myaaaaa.zabbix4j.hostgroup;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by Suguru Yajima on 2014/04/30.
 */
public class HostgroupIsWritableTest extends ZabbixApiTestBase {

    public HostgroupIsWritableTest() {
        super();
    }

    @Test
    public void testIsWritable1() throws Exception {

        try {
            HostgroupGetRequest getRequest = new HostgroupGetRequest();
            ArrayList<String> name = new ArrayList<String>();
            name.add("test_readable_writable_hostgroup");
            getRequest.getParams().getFilter().setName(name);

            HostgroupGetResponse getResponse = zabbixApi.hostgroup().get(getRequest);
            int targetGroupId = getResponse.getResult().get(0).getGroupid();

            HostgroupIsWritableRequest request = new HostgroupIsWritableRequest();
            request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupId})));

            HostgroupIsWritableResponse response = zabbixApi.hostgroup().isWritable(request);

            assertNotNull(response);
            assertTrue(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIsWritable2() throws Exception {

        try {
            HostgroupGetRequest getRequest = new HostgroupGetRequest();
            ArrayList<String> name = new ArrayList<String>();
            name.add("test_readable_writable_hostgroup");
            getRequest.getParams().getFilter().setName(name);

            HostgroupGetResponse getResponse = zabbixApi.hostgroup().get(getRequest);
            int targetGroupId = getResponse.getResult().get(0).getGroupid();

            // login as guest
            login("guest", "");

            HostgroupIsWritableRequest request = new HostgroupIsWritableRequest();
            request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupId})));

            HostgroupIsWritableResponse response = zabbixApi.hostgroup().isWritable(request);

            assertNotNull(response);
            assertFalse(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }


}
