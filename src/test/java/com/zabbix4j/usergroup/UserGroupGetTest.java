package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/16.
 */
public class UserGroupGetTest extends ZabbixApiTestBase {
    public UserGroupGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer expectedId = createDummyGroup();

        UserGroupGetRequest request = new UserGroupGetRequest();
        UserGroupGetRequest.Params params = request.getParams();
        params.addUsrgrpId(expectedId);

        UserGroupGetResponse resposne = zabbixApi.usergroup().get(request);
        assertNotNull(resposne);

        deleteDummmyGroup(expectedId);

        logger.debug(getGson().toJson(resposne));

        UserGroupGetResponse.Result result = resposne.getResult().get(0);

        assertEquals(expectedId, result.getUsrgrpid());
        assertEquals("usergroup get test", result.getName());
    }

    private Integer createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup get test");
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
