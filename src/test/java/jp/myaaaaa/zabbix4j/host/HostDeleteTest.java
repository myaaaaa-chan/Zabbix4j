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
import jp.myaaaaa.zabbix4j.hostinteface.HostInterfaceObject;
import jp.myaaaaa.zabbix4j.usermacro.Macro;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostDeleteTest extends ZabbixApiTestBase {

    public HostDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        int hostId = createDummyHost();

        HostDeleteRequest request = new HostDeleteRequest();
        request.addParams(hostId);

        HostDeleteResponse response = zabbixApi.host().delete(request);

        assertNotNull(response);
        int deletedId = response.getResult().getHostids().get(0);
        assertEquals(hostId, deletedId);
    }

    private int createDummyHost () throws Exception {

            HostCreateRequest request = new HostCreateRequest();
            HostCreateRequest.Params params = request.getParams();

            List<Integer> templates = new ArrayList<Integer>();
            templates.add(10093);
            params.setTemplates(templates);

            params.setGroup(12);

            List<Macro> macros = new ArrayList<Macro>();
            Macro macro1 = new Macro();
            macro1.setMacro("{$MACRO1}");
            macro1.setValue("value1");
            macros.add(macro1);
            params.setMacros(macros);

            List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
            HostInterfaceObject hostInterface = new HostInterfaceObject();
            hostInterface.setIp("192.168.255.200");
            interfaces.add(hostInterface);
            params.setInterfaces(interfaces);

            params.setHost("test dummy host created1");
            params.setName("test dummy host created1 name");

            HostCreateResponse response = zabbixApi.host().create(request);

            assertNotNull(response);
            assertNotNull(response.getResult().getHostids());
            int hostId = response.getResult().getHostids().get(0);
            assertTrue(0 < hostId);

            return hostId;

    }
}
