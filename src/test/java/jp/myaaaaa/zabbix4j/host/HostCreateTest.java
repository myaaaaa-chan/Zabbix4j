package jp.myaaaaa.zabbix4j.host;

import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import jp.myaaaaa.zabbix4j.hostinteface.HostInterfaceObject;
import jp.myaaaaa.zabbix4j.usermacro.Macro;
import org.junit.Test;

import java.util.ArrayList;
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

        try {
            HostCreateRequest request = new HostCreateRequest();
            HostCreateRequest.Params params = request.getParams();

            List<Integer> templates = new ArrayList<Integer>();
            templates.add(10093);
            templates.add(10094);
            templates.add(10095);
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
            hostInterface.setIp("192.168.255.255");
            interfaces.add(hostInterface);
            params.setInterfaces(interfaces);

            params.setHost("test host created1");
            params.setName("test host created1 name");

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
