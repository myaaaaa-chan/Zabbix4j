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

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

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

    private Integer createDummyGroup () throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup get test");
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
