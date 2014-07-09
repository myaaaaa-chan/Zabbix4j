package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostCreateTest extends ZabbixApiTestBase {

    public HostCreateTest() {
        super();
    }

    @Test
    public void testCreate1() {
        final Integer groupId = 25;
        final Integer templateId = 10093;

        try {
            HostCreateRequest request = new HostCreateRequest();
            HostCreateRequest.Params params = request.getParams();

            params.addTemplateId(templateId);
            params.addGroupId(groupId);

            List<Macro> macros = new ArrayList<Macro>();
            Macro macro1 = new Macro();
            macro1.setMacro("{$MACRO1}");
            macro1.setValue("value1");
            macros.add(macro1);
            params.setMacros(macros);

            HostInterfaceObject hostInterface = new HostInterfaceObject();
            hostInterface.setIp("192.168.255.255");
            params.addHostInterfaceObject(hostInterface);

            params.setHost("test host created1." + new Date().getTime());
            params.setName("test host created1 name" + new Date().getTime());

            HostCreateResponse response = zabbixApi.host().create(request);
            assertNotNull(response);

            assertNotNull(response.getResult().getHostids());
            int hostId = response.getResult().getHostids().get(0);
            assertTrue(0 < hostId);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
