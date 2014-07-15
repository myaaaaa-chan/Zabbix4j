package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.util.Date;

/**
 * @author suguru yajima 2014
 */
public class DummyDiscoveryRule extends ZabbixApiTestDummyMethodBase {
    public DummyDiscoveryRule(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException {
        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.createParams();
        params.setIprange("127.0.0.1");
        params.setName("test discoveryrule." + new Date().getTime());

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10050);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleCreateResponse response = zabbixApi.discoveryRule().create(request);
        Integer actualId = response.getResult().getDruleids().get(0);
        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {
        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleId(targetId);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
    }
}
