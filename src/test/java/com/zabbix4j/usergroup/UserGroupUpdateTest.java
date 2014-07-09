package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/15.
 */
public class UserGroupUpdateTest extends ZabbixApiTestBase {
    public UserGroupUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer id = createDummyGroup();

        UserGroupUpdateRequest request = new UserGroupUpdateRequest();
        UserGroupUpdateRequest.Params params = request.getParams();
        params.setUsrgrpid(id);
        params.setName("usergroup update success");
        params.setDebug_mode(ZabbixApiParamter.DEBUG_MODE.ENABLE.value);
        params.setGui_access(ZabbixApiParamter.GUI_ACCESS.DISABLE_ACCESS_FRONTEND.value);

        UserGroupUpdateResponse response = zabbixApi.usergroup().update(request);
        assertNotNull(response);

        deleteDummmyGroup(id);

        Integer actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(id, actualId);
    }

    private Integer createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup update test");
        params.addUserId(1);

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        Integer groupId = response.getResult().getUsrgrpids().get(0);

        return groupId;
    }

    private void deleteDummmyGroup(Integer id) throws ZabbixApiException {

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(id);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);
    }
}
