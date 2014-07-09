package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MapGetTest extends ZabbixApiTestBase {

    public MapGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyMap dummyMap = new DummyMap(zabbixApi);
        Integer targetId = dummyMap.create();

        try {
            MapGetRequest request = new MapGetRequest();
            MapGetRequest.Params params = request.getParams();
            params.addSysMapId(targetId);
            params.setSelectIconMap(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectLinks(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectSelements(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectUrls(ZabbixApiParamter.QUERY.extend.name());

            MapGetResponse response = zabbixApi.map().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            MapGetResponse.Result result = response.getResult().get(0);
            assertThat(result.getSysmapid(), is(targetId));
        } finally {
            dummyMap.delete(targetId);
        }
    }
}
