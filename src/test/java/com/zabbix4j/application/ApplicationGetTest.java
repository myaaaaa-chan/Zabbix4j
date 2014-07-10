package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ApplicationGetTest extends ZabbixApiTestBase {

    public ApplicationGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyApplication dummyApplication = new DummyApplication(zabbixApi);
        Integer target1 = dummyApplication.create();
        Integer target2 = dummyApplication.create();

        try {
            ArrayList<Integer> ids = new ArrayList<Integer>();
            ids.add(target1);
            ids.add(target2);

            Integer hostId = 10113;
            ApplicationGetRequest request = new ApplicationGetRequest();
            ApplicationGetRequest.Params params = request.getParams();
            params.addHostId(hostId);

            ApplicationGetResponse response = zabbixApi.application().get(request);
            assertNotNull(response);

            List<ApplicationGetResponse.Result> resultList = response.getResult();
            for (int i = 0; i < resultList.size(); i++) {
                ApplicationGetResponse.Result result = resultList.get(i);

                assertNotNull(result);
                assertEquals(hostId, result.getHostid());
            }
        } finally {
            dummyApplication.delete(target1);
            dummyApplication.delete(target2);
        }
    }
}
