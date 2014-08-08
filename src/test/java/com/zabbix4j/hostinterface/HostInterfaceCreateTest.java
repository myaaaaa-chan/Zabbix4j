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
import com.zabbix4j.host.DummyHost;
import com.zabbix4j.hostinteface.HostInterfaceCreateRequest;
import com.zabbix4j.hostinteface.HostInterfaceCreateResponse;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author suguru yajima 2014
 */
public class HostInterfaceCreateTest extends ZabbixApiTestBase {
    public HostInterfaceCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer hostId = dummyHost.createHost();

        try {
            HostInterfaceCreateRequest request = new HostInterfaceCreateRequest();
            HostInterfaceObject obj = request.createParam();
            obj.setDns("test." + new Date().getTime() + "hostinteface.create");
            obj.setHostid(hostId);
            obj.setIp("192.168.100.100");
            obj.setMain(HostInterfaceObject.MAIN.NOT_DEFAULT.value);
            obj.setPort(10050);
            obj.setType(HostInterfaceObject.TYPE.AGENT.value);
            obj.setUseip(HostInterfaceObject.USE_IP.USE_HOST_IP.value);

            HostInterfaceCreateResponse response = zabbixApi.hostInterface().create(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getInterfaceids().get(0);
            assertNotNull(actualId);

        } finally {
            dummyHost.deleteHost(hostId);
        }
    }
}
