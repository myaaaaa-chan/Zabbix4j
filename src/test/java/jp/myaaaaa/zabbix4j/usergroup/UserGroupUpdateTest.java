/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package jp.myaaaaa.zabbix4j.usergroup;

import jp.myaaaaa.zabbix4j.ZabbixApi;
import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiParamter;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

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

        UserGroupUpdateResponse response  = zabbixApi.usergroup().update(request);
        assertNotNull(response);

        deleteDummmyGroup(id);

        Integer actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(id, actualId);
    }

    private Integer createDummyGroup () throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup update test");
        params.addUserId(1);

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        Integer groupId = response.getResult().getUsrgrpids().get(0);

        return groupId;
    }

    private void deleteDummmyGroup (Integer id) throws ZabbixApiException {

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(id);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);
    }
}
