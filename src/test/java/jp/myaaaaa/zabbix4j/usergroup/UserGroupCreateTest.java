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

package jp.myaaaaa.zabbix4j.usergroup;

import jp.myaaaaa.zabbix4j.ZabbixApiParamter;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/14.
 */
public class UserGroupCreateTest extends ZabbixApiTestBase {
    public UserGroupCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup create test");
        params.addUserId(1);

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        assertNotNull(response);

        Integer groupId = response.getResult().getUsrgrpids().get(0);
        assertNotNull(groupId);
    }
}
