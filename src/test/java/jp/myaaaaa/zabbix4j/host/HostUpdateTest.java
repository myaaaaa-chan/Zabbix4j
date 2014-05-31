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

package jp.myaaaaa.zabbix4j.host;

import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import jp.myaaaaa.zabbix4j.usermacro.Macro;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostUpdateTest extends ZabbixApiTestBase {

    public HostUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        int targetHostId = 10108;
        try {
            HostUpdateRequest request = new HostUpdateRequest();
            HostUpdateRequest.Params params = request.getParams();

            params.setHostid(targetHostId);
            params.setHost("192.168.100.100");
            params.setName("test host update1");

            params.setGroup(2);

            params.setUnLinkTemplate(10093);

            ArrayList<Integer> templates = new ArrayList<Integer>();
            templates.add(10093);
            params.setTemplates(templates);

            Macro macro = new Macro();
            macro.setMacro("{$MACRO2}");
            macro.setValue("VALUE2");
            params.setMacro(macro);

            HostUpdateResponse response = zabbixApi.host().update(request);

            assertNotNull(response);
            int actualId = response.getResult().getHostids().get(0);
            assertEquals(targetHostId, actualId);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
