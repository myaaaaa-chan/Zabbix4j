package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/15.
 */
public class UserGroupDeleteTest extends ZabbixApiTestBase {

    public UserGroupDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer expectedId = createDummyGroup();

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(expectedId);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);

        assertNotNull(response);

        Integer actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(expectedId, actualId);
    }

    private Integer createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup delete test");
        params.addUserId(1);

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        Integer groupId = response.getResult().getUsrgrpids().get(0);

        return groupId;
    }
}
