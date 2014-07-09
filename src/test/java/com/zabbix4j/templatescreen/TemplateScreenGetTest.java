package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenGetTest extends ZabbixApiTestBase {
    public TemplateScreenGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        TemplateScreenGetRequest request = new TemplateScreenGetRequest();
        TemplateScreenGetRequest.Params params = request.getParams();
        params.setSelectScreenItems(ZabbixApiParamter.QUERY.extend.name());
        params.setNoInheritance(false);

        TemplateScreenGetResponse response =zabbixApi.templateScreen().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        TemplateScreenGetResponse.Result result = response.getResult().get(0);
        assertNotNull(response);


    }
}
