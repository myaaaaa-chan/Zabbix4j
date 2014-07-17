package com.zabbix4j.event;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
public class EventAcknowledgeTest extends ZabbixApiTestBase {

    public EventAcknowledgeTest() {
        super();
    }

    @Test
    public void testAcknowleage() throws Exception {

        EventAcknowledgeRequest request = new EventAcknowledgeRequest();
        EventAcknowledgeRequest.Params params = request.getParams();

        EventAcknowledgeResponse response = zabbixApi.event().acknowledge(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
