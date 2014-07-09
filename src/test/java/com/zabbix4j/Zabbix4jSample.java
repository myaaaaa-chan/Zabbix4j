package com.zabbix4j;

import com.zabbix4j.host.HostCreateRequest;
import com.zabbix4j.host.HostCreateResponse;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;

import java.util.ArrayList;
import java.util.List;

public class Zabbix4jSample {

    public static final String ZBX_URL = "http://127.0.0.1/zabbix/api_jsonrpc.php";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "zabbix";

    public static void main(String[] args) {

        try {
            // login to Zabbix
            ZabbixApi zabbixApi = new ZabbixApi(ZBX_URL);
            zabbixApi.login(USERNAME, PASSWORD);

            // request paramter
            HostCreateRequest request = new HostCreateRequest();
            HostCreateRequest.Params params = request.getParams();

            // set tempalte
            List<Integer> templates = new ArrayList<Integer>();
            templates.add(10093);
            params.setTemplates(templates);

            // attached to group
            params.addGroupId(12);

            // set macro
            List<Macro> macros = new ArrayList<Macro>();
            Macro macro1 = new Macro();
            macro1.setMacro("{$MACRO1}");
            macro1.setValue("value1");
            macros.add(macro1);
            params.setMacros(macros);

            // host interface
            List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
            HostInterfaceObject hostInterface = new HostInterfaceObject();
            hostInterface.setIp("192.168.255.255");
            interfaces.add(hostInterface);
            params.setInterfaces(interfaces);

            // host
            params.setHost("test host created1");

            // host name
            params.setName("test host created1 name");

            // send create request
            HostCreateResponse response = zabbixApi.host().create(request);

            Integer hostId = response.getResult().getHostids().get(0);
            System.out.println(hostId);

        } catch (ZabbixApiException e) {
            e.printStackTrace();
        }
    }
}
