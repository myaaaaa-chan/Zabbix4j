package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ScreenItemGetTest extends ZabbixApiTestBase {

    private final Integer scrrenId = 25;

    public ScreenItemGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        ScreenItemGetRequest request = new ScreenItemGetRequest();
        ScreenItemGetRequest.Params params = request.getParams();
        params.addScreenId(scrrenId);

        ScreenItemGetResponse response = zabbixApi.screenItem().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        int itemCount = response.getResult().size();
        assertThat(itemCount, is(3));
    }
}
