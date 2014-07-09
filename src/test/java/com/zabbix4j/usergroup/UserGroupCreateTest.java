package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/14.
 */
public class UserGroupCreateTest extends ZabbixApiTestBase {
    public UserGroupCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup create test");
        params.addUserId(1);

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        assertNotNull(response);

        Integer groupId = response.getResult().getUsrgrpids().get(0);
        assertNotNull(groupId);
    }
}
