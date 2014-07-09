package com.zabbix4j.templatescreenitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenItemGetTest extends ZabbixApiTestBase {
    public TemplateScreenItemGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        TemplateScreenItemGetRequest request = new TemplateScreenItemGetRequest();

        TemplateScreenItemGetResponse response = zabbixApi.templateScreenItem().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));


    }
}
