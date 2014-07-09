package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ITServiceGetTest extends ZabbixApiTestBase {

    public ITServiceGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {

        // thsi service has parent and child serivce
        final Integer serviceId = 6;

        ITServiceGetRequest request = new ITServiceGetRequest();
        ITServiceGetRequest.Params params = request.getParams();
        params.addSerivceId(serviceId);

        params.setSelectAlarms(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectDependencies(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectParent(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectParentDependencies(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectTimes(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectTrigger(ZabbixApiParamter.QUERY.extend.name());


        ITServiceGetResponse response = zabbixApi.itservice().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        ITServiceGetResponse.Result result = response.getResult().get(0);
        Integer actualId = result.getServiceid();

        assertThat(serviceId, is(actualId));
    }
}
