package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TemplateDeleteTest extends ZabbixApiTestBase {
    public TemplateDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyTemplate dummyTemplate = new DummyTemplate(zabbixApi);
        Integer targetId = dummyTemplate.create();

        TemplateDeleteRequest request = new TemplateDeleteRequest();
        request.addTemplateId(targetId);

        TemplateDeleteResponse response = zabbixApi.template().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getTemplateids().get(0);
        assertThat(actualId, Is.is(targetId));

    }
}
