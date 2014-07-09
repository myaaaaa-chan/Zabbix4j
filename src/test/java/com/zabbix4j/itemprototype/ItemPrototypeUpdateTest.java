package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeUpdateTest extends ZabbixApiTestBase {

    public ItemPrototypeUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        DummyItemPrototype dummyItemPrototype = new DummyItemPrototype(zabbixApi);
        Integer targetId = dummyItemPrototype.createItemPrototype();

        try {
            ItemPrototypeUpdateRequest request = new ItemPrototypeUpdateRequest();
            ItemPrototypeUpdateRequest.Params params = request.getParams();
            params.setItemid(targetId);
            params.setName("item update");
            params.setDelay(90);

            ItemPrototypeUpdateResponse response = zabbixApi.itemPrototype().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getItemids().get(0);
            assertThat(targetId, is(actualId));
        } finally {
            dummyItemPrototype.delete(targetId);
        }
    }
}
