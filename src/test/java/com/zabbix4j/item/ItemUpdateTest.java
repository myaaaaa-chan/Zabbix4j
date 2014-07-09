package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/09.
 */
public class ItemUpdateTest extends ZabbixApiTestBase {


    public ItemUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer itemid = 23674;
        ItemUpdateRequest request = new ItemUpdateRequest();
        ItemUpdateRequest.Params params = request.getParams();
        params.setItemid(itemid);
        params.setName("Test Item Updated");
        params.setHistory(7);
        params.setTrends(365);

        ItemUpdateResponse response = zabbixApi.item().update(request);

        assertNotNull(response);
        Integer actualItemId = response.getResult().getItemids().get(0);
        assertEquals(itemid, actualItemId);
    }
}
