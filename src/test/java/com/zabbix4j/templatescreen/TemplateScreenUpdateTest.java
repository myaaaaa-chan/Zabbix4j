package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenUpdateTest extends ZabbixApiTestBase {
    public TemplateScreenUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyTemplateScreen dummyTemplateScreen = new DummyTemplateScreen(zabbixApi);
        Integer targetId = dummyTemplateScreen.create();

        try {
            TemplateScreenUpdateRequest request = new TemplateScreenUpdateRequest();
            TemplateScreenUpdateRequest.Params params = request.getParams();
            params.setScreenid(targetId);
            params.setName("test.tempaltescreen.update");

            TemplateScreenUpdateResponse response = zabbixApi.templateScreen().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actialId = response.getResult().getScreenids().get(0);
            assertThat(actialId, Is.is(targetId));

        } finally {
            dummyTemplateScreen.delete(targetId);
        }

    }
}
