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

package jp.myaaaaa.zabbix4j.discoveryrule;

import jp.myaaaaa.zabbix4j.ZabbixApiException;
import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class DRuleGetTest extends ZabbixApiTestBase {

    public DRuleGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer targetId = createDummy();

        DRuleGetRequest request = new DRuleGetRequest();
        DRuleGetRequest.Params params = request.getParams();
        params.addDRuleId(targetId);

        DRuleGetResponse response = zabbixApi.discoveryRule().get(request);
        assertNotNull(response);

        deleteDummy(targetId);

        DiscoveryRuleObject ruleObject = response.getResult().get(0);
        assertNotNull(ruleObject);

        assertEquals("dicovery get test at localhost", ruleObject.getName());
        assertEquals("127.0.0.1", ruleObject.getIprange());
    }

    private Integer createDummy() throws ZabbixApiException {

        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.getParams();
        params.setIprange("127.0.0.1");
        params.setName("dicovery get test at localhost");

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10050);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleCreateResponse response = zabbixApi.discoveryRule().create(request);

        return response.getResult().getDruleids().get(0);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleId(id);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
    }
}
