package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ScreenGetTest extends ZabbixApiTestBase {
    public ScreenGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyScreen dummyScreen = new DummyScreen(zabbixApi);
        Integer targetId = dummyScreen.create();

        try {
            ScreenGetRequest request = new ScreenGetRequest();
            ScreenGetRequest.Params params = request.getParams();
            params.addScreenId(targetId);
            params.setSelectScreenItems(ZabbixApiParamter.QUERY.extend.name());

            ScreenGetResponse response = zabbixApi.screen().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            ScreenGetResponse.Result result = response.getResult().get(0);
            assertNotNull(result);
        } finally {
            dummyScreen.delete(targetId);
        }
    }
}
