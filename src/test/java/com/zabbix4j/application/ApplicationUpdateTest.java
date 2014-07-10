package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/23.
 */
public class ApplicationUpdateTest extends ZabbixApiTestBase {

    public ApplicationUpdateTest() {
        super();
    }

    @Test
    public void testUpdte() throws Exception {
        DummyApplication dummyApplication = new DummyApplication(zabbixApi);
        Integer expected = dummyApplication.create();

        try {
            ApplicationUpdateRequest request = new ApplicationUpdateRequest();
            ApplicationUpdateRequest.Params params = request.getParams();
            params.setApplicationid(expected);
            params.setName("Applicaton updated");

            ApplicationUpdateResponse response = zabbixApi.application().update(request);
            assertNotNull(response);

            Integer actual = response.getResult().getApplicationids().get(0);

            assertEquals(expected, actual);
        } finally {
            dummyApplication.delete(expected);
        }
    }
}
