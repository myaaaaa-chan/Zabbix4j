package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/09.
 */
public class ItemDeleteTest extends ZabbixApiTestBase {

    public ItemDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer expectedItemid = createItem();
        ItemDeleteRequest request = new ItemDeleteRequest();
        ArrayList<Integer> itemids = new ArrayList<Integer>();
        itemids.add(expectedItemid);
        request.setParams(itemids);

        ItemDeleteResponse response = zabbixApi.item().delete(request);

        assertNotNull(response);

        Integer actualItemid = response.getResult().getItemids().get(0);

        assertEquals(expectedItemid, actualItemid);
    }

    private Integer createItem() throws ZabbixApiException {

        ItemCreateRequest request = new ItemCreateRequest();
        ItemCreateRequest.Params params = request.getParams();
        params.setName("Test Item for Delete");
        params.setDelay(60);
        params.setHostid(10109);
        params.setKey_("agent.ping");
        params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
        params.setType(0);
        params.setInterfaceid(6);

        ItemCreateResponse response = zabbixApi.item().create(request);

        return response.getResult().getItemids().get(0);
    }
}
