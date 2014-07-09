package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class DRuleGetTest extends ZabbixApiTestBase {

    public DRuleGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer targetId = createDummy();

        DRuleGetRequest request = new DRuleGetRequest();
        DRuleGetRequest.Params params = request.getParams();
        params.addDRuleId(targetId);

        DRuleGetResponse response = zabbixApi.discoveryRule().get(request);
        assertNotNull(response);

        deleteDummy(targetId);

        DiscoveryRuleObject ruleObject = response.getResult().get(0);
        assertNotNull(ruleObject);

        assertEquals("dicovery get test at localhost", ruleObject.getName());
        assertEquals("127.0.0.1", ruleObject.getIprange());
    }

    private Integer createDummy() throws ZabbixApiException {

        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.getParams();
        params.setIprange("127.0.0.1");
        params.setName("dicovery get test at localhost");

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10050);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleCreateResponse response = zabbixApi.discoveryRule().create(request);

        return response.getResult().getDruleids().get(0);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleId(id);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
    }
}
