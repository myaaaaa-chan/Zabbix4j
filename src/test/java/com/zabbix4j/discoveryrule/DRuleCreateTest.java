package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/26.
 */
public class DRuleCreateTest extends ZabbixApiTestBase {

    public DRuleCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

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
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getDruleids().get(0);
        assertNotNull(actualId);
    }
}
