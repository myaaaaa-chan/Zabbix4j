package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenDeleteTest extends ZabbixApiTestBase {

    public TemplateScreenDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyTemplateScreen dummyTemplateScreen = new DummyTemplateScreen(zabbixApi);
        Integer targetID = dummyTemplateScreen.create();

        TemplateScreenDeleteRequest request = new TemplateScreenDeleteRequest();
        request.addTemplateScreenId(targetID);

        TemplateScreenDeleteResponse response = zabbixApi.templateScreen().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actuald = response.getResult().getScreenids().get(0);

        assertThat(actuald, Is.is(targetID));
    }
}
