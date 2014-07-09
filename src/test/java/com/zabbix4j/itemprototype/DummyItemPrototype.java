package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.host.DummyHost;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyItemPrototype extends ZabbixApiTestDummyMethodBase {

    public DummyItemPrototype(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer createItemPrototype() throws ZabbixApiException {

        Integer hostId = 10145;

        // lld id = 23797
        //applicationid = 564
        Integer hostInterfaceId = new DummyHost(zabbixApi).getHostInterface(hostId);

        ItemPrototypeCreateRequest request = new ItemPrototypeCreateRequest();
        ItemPrototypeCreateRequest.Params params = request.getParams();
        params.setName("test.dummy.itemprototype." + new Date().getTime());
        params.setRuleid(23797);
        params.addApplication(564);
        params.setDelay(60);
        params.setHostid(hostId);

        //params.setKey_("vfs.fs.size[{#FSNAME},free]");
        params.setKey_("hogehogehoge." + new Date().getTime());
        params.setType(ItemPrototypeObject.ITEM_TYPE.SIMPLE_CHECK.value);
        params.setValue_type(ItemPrototypeObject.VALUE_TYPE.NUMERIC_UNSIGNED.value);

        params.setInterfaceid(hostInterfaceId);

        ItemPrototypeCreateResponse response = zabbixApi.itemPrototype().create(request);

        return response.getResult().getItemids().get(0);
    }

    public void delete(Integer id) throws ZabbixApiException {

        ItemPrototypeDeleteRequest request = new ItemPrototypeDeleteRequest();
        request.addItemPrototypeId(id);

        ItemPrototypeDeleteResponse response = zabbixApi.itemPrototype().delete(request);
    }
}
