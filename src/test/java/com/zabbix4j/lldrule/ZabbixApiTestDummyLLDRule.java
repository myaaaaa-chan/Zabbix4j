package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.hostinteface.HostInterfaceGetRequest;
import com.zabbix4j.hostinteface.HostInterfaceGetResponse;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ZabbixApiTestDummyLLDRule extends ZabbixApiTestDummyMethodBase {


    private Integer hostId = 10141;

    public ZabbixApiTestDummyLLDRule(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer createLLDRule() throws ZabbixApiException {
        Integer targetHostId = null;

        Integer interfaceId = getHostInterface(hostId);

        LLDRuleCreateRequest request = new LLDRuleCreateRequest();
        LLDRuleCreateRequest.Params params = request.getParams();
        params.setDelay(30);
        params.setHostid(hostId);
        params.setInterfaceid(interfaceId);
        params.setKey_("test");
        params.setName("LLD create");
        params.setType(LLDRuleObject.LLD_RULE_TYPE.SIMPLE_CHECK.value);

        LLDRuleCreateResponse response = zabbixApi.lldRule().create(request);
        assertNotNull(response);


        Integer lldRuleId = response.getResult().getItemids().get(0);
        return lldRuleId;
    }

    public Integer getHostInterface(Integer id) throws ZabbixApiException {

        HostInterfaceGetRequest request = new HostInterfaceGetRequest();
        HostInterfaceGetRequest.Params params = request.getParams();
        ArrayList<Integer> hostids = new ArrayList<Integer>();
        hostids.add(id);
        params.setHostids(hostids);

        HostInterfaceGetResponse response = zabbixApi.hostInterface().get(request);

        return response.getResult().get(0).getInterfaceid();
    }

    public void deleteLLDRule(Integer id) throws ZabbixApiException {

        LLDRuleDeleteRequest request = new LLDRuleDeleteRequest();
        request.addruleId(id);

        LLDRuleDeleteResponse response = zabbixApi.lldRule().delete(request);
    }
}
