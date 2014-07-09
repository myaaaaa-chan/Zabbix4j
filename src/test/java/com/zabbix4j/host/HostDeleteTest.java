package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    private int createDummyHost() throws Exception {

        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        List<Integer> templates = new ArrayList<Integer>();
        templates.add(10093);
        params.setTemplates(templates);

        params.addGroupId(12);

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
