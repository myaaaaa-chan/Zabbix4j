package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class DRuleUpdateTest extends ZabbixApiTestBase {

    public DRuleUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer targetId = createDummy();

        DRuleUpdateRequest request = new DRuleUpdateRequest();
        DRuleUpdateRequest.Params params = request.getParams();
        params.setDruleid(targetId);
        params.setName("update success");
        params.setIprange("192.168.0.1");

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10051);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleUpdateResponse response = zabbixApi.discoveryRule().update(request);
        assertNotNull(response);

        deleteDummy(targetId);

        Integer actualId = response.getResult().getDruleids().get(0);

        assertEquals(targetId, actualId);
    }

    private Integer createDummy() throws ZabbixApiException {

        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.getParams();
        params.setIprange("127.0.0.1");
        params.setName("dicovery update test at localhost");

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
