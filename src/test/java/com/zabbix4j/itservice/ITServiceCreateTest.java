package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ITServiceCreateTest extends ZabbixApiTestBase {


    public ITServiceCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        ITServiceCreateRequest request = new ITServiceCreateRequest();
        ITServiceCreateRequest.Params params = request.getParams();
        params.setName("test.itservice.create." + new Date().getTime());
        params.setAlgorithm(ITServiceObject.ALGORITHM.LEAST_ONE_CHILD_PROBLEM.value);
        params.setShowsla(ITServiceObject.SLA.CALCULATE.value);
        params.setGoodsla(99.99f);
        params.setSortorder(1);

        ITServiceCreateResponse response = zabbixApi.itservice().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getServiceids().get(0);
        assertNotNull(actualId);
    }
}
