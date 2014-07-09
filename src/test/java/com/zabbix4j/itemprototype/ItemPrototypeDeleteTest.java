package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeDeleteTest extends ZabbixApiTestBase {

    public ItemPrototypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {

        DummyItemPrototype dummyItemPrototype = new DummyItemPrototype(zabbixApi);
        Integer targetId = dummyItemPrototype.createItemPrototype();

        ItemPrototypeDeleteRequest request = new ItemPrototypeDeleteRequest();
        request.addItemPrototypeId(targetId);

        ItemPrototypeDeleteResponse response = zabbixApi.itemPrototype().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getPrototypeids().get(0);
        assertThat(targetId, is(actualId));
    }
}
