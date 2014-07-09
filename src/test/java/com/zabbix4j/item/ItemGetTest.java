package com.zabbix4j.item;

import com.google.gson.Gson;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class ItemGetTest extends ZabbixApiTestBase {

    public ItemGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer itemId = 23667;

        ItemGetRequest request = new ItemGetRequest();
        ItemGetRequest.Params params = request.getParams();
        params.addItemId(itemId);

        ItemGetResponse response = zabbixApi.item().get(request);

        Gson gson = getGson();
        logger.debug(gson.toJson(response));

        assertNotNull(response);

        ItemGetResponse.Result result = response.getResult().get(0);
        assertNotNull(result);

        assertEquals(itemId, result.getItemid());
    }
}
