package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class IconMapGetTest extends ZabbixApiTestBase {
    public IconMapGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        IconMapGetRequest request = new IconMapGetRequest();
        IconMapGetRequest.Params params = request.getParams();
        params.addIconMapId(1);

        params.setSelectMappings(ZabbixApiParamter.QUERY.extend.name());

        IconMapGetResponse response = zabbixApi.iconMap().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
