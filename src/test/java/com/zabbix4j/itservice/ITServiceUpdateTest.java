package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ITServiceUpdateTest extends ZabbixApiTestBase {

    public ITServiceUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        DummyITService dummy = new DummyITService(zabbixApi);
        Integer targetId = dummy.create();

        try {
            ITServiceUpdateRequest request = new ITServiceUpdateRequest();
            ITServiceUpdateRequest.Params params = request.getParams();
            params.setServiceid(targetId);
            params.setName("updated");
            params.setAlgorithm(ITServiceObject.ALGORITHM.ALL_CHILDREN_PROBLEM.value);
            params.setShowsla(ITServiceObject.SLA.DO_NOT_CALCULATE.value);
            params.setGoodsla(50.00f);
            params.setSortorder(2);

            ITServiceUpdateResponse response = zabbixApi.itservice().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getServiceids().get(0);
            assertThat(targetId, is(actualId));
        } finally {
            dummy.delete(targetId);
        }
    }
}
