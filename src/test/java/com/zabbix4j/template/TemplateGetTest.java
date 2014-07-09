package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class TemplateGetTest extends ZabbixApiTestBase {
    public TemplateGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyTemplate dummyTemplate = new DummyTemplate(zabbixApi);
        Integer targetId = dummyTemplate.create();

        try {
            TemplateGetRequest request = new TemplateGetRequest();
            TemplateGetRequest.Params params = request.getParams();
            params.addTemplateId(targetId);

            TemplateGetResponse response = zabbixApi.template().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            TemplateGetResponse.Result result = response.getResult().get(0);
            assertThat(result.getTemplateid(), Is.is(targetId));
        } finally {
            dummyTemplate.delete(targetId);
        }
    }
}
