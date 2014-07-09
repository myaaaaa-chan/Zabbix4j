package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.DummyHost;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeCreateTest extends ZabbixApiTestBase {

    public ItemPrototypeCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        Integer hostId = 10145;

        // lld id = 23797
        //applicationid = 564
        Integer hostInterfaceId = new DummyHost(zabbixApi).getHostInterface(hostId);

        ItemPrototypeCreateRequest request = new ItemPrototypeCreateRequest();
        ItemPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Free disk space on $1");
        params.setRuleid(23797);
        params.addApplication(564);
        params.setDelay(60);
        params.setHostid(hostId);

        params.setKey_("vfs.fs.size[{#FSNAME},free]");
        params.setType(ItemPrototypeObject.ITEM_TYPE.SIMPLE_CHECK.value);
        params.setValue_type(ItemPrototypeObject.VALUE_TYPE.NUMERIC_UNSIGNED.value);

        params.setInterfaceid(hostInterfaceId);

        ItemPrototypeCreateResponse response = zabbixApi.itemPrototype().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getItemids().get(0);
        assertNotNull(actualId);
    }
}
