package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

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

        Integer expected = createDummy();

        ApplicationUpdateRequest request = new ApplicationUpdateRequest();
        ApplicationUpdateRequest.Params params = request.getParams();
        params.setApplicationid(expected);
        params.setName("Applicaton updated");

        ApplicationUpdateResponse response = zabbixApi.application().update(request);
        assertNotNull(response);

        Integer actual = response.getResult().getApplicationids().get(0);

        delete(actual);

        assertEquals(expected, actual);
    }

    private Integer createDummy() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application before update");
        params.setHostid(10113);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }

    private void delete(Integer id) throws ZabbixApiException {

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(id);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
