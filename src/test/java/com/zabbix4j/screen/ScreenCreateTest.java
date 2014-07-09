package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ScreenCreateTest extends ZabbixApiTestBase {

    public ScreenCreateTest() {
        super();
    }


    @Test
    public void testCreate() throws Exception {
        ScreenCreateRequest request = new ScreenCreateRequest();
        ScreenCreateRequest.Params params = request.getParams();
        params.setName("test.screen.create." + new Date().getTime());
        params.setHsize(3);
        params.setVsize(2);

        ScreenCreateResponse response = zabbixApi.screen().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getScreenids().get(0);
        assertNotNull(actualId);
    }
}
