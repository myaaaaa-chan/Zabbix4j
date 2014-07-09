package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TemplateUpdateTest extends ZabbixApiTestBase {
    public TemplateUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyTemplate dummyTemplate = new DummyTemplate(zabbixApi);
        Integer targetId = dummyTemplate.create();

        try {
            TemplateUpdateRequest request = new TemplateUpdateRequest();
            TemplateUpdateRequest.Params params = request.getParams();
            params.setTemplateid(targetId);
            params.setName("Template OS Linuxxxx");

            TemplateUpdateResponse response = zabbixApi.template().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getTemplateids().get(0);
            assertThat(actualId, Is.is(targetId));
        } finally {
            dummyTemplate.delete(targetId);
        }
    }
}
