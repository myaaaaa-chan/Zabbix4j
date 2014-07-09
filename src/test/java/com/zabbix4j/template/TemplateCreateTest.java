package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TemplateCreateTest extends ZabbixApiTestBase {
    public TemplateCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        final Integer groupId = 25;
        final Integer hostId = 10084;

        TemplateCreateRequest request = new TemplateCreateRequest();
        TemplateCreateRequest.Params params = request.getParams();
        params.setHost("test.template.create." + new Date().getTime());
        params.addGroupId(groupId);
        params.addHostId(hostId);

        TemplateCreateResponse response = zabbixApi.template().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer acutalId = response.getResult().getTemplateids().get(0);
        assertNotNull(acutalId);
    }
}
