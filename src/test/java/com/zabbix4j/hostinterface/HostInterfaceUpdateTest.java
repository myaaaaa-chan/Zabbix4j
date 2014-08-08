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

package com.zabbix4j.hostinterface;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.hostinteface.HostInterfaceUpdateRequest;
import com.zabbix4j.hostinteface.HostInterfaceUpdateResponse;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author suguru yajima 2014
 */
public class HostInterfaceUpdateTest extends ZabbixApiTestBase {
    public HostInterfaceUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {
        DummyHostinterface dummyHostinterface = new DummyHostinterface(zabbixApi);
        Integer targetId = dummyHostinterface.create();

        try {
            HostInterfaceUpdateRequest request = new HostInterfaceUpdateRequest();

            HostInterfaceObject obj = new HostInterfaceObject();
            obj.setInterfaceid(targetId);
            obj.setPort(12121);
            request.addHostInterface(obj);

            HostInterfaceUpdateResponse response = zabbixApi.hostInterface().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            assertThat(response.getResult().getInterfaceids().get(0), Is.is(targetId));

        } finally {
            dummyHostinterface.delete(targetId);
        }

    }
}
