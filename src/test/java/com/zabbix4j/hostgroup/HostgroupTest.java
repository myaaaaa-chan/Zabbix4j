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

package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/04/26.
 */
public class HostgroupTest extends ZabbixApiTestBase {

    private HostgroupCreateResponse hostgroupCreateResponse;

    public HostgroupTest() {
        super();
    }

    @Test
    public void testGet1() {

        try {
            HostgroupGetRequest request = new HostgroupGetRequest();
            HostgroupGetResponse response = zabbixApi.hostgroup().get(request);

            assertNotNull(response);

            String groupName = response.getResult().get(0).getName();
            assertEquals("Templates", groupName);

        } catch (ZabbixApiException e) {
            fail();
        }
    }

    @Test
    public void testExist1() {

        HostgroupExistRequest request = new HostgroupExistRequest();
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Templates"}));
        request.getParams().setName(names);

        try {
            HostgroupExistResponse response = zabbixApi.hostgroup().exist(request);

            assertNotNull(response);

            assertTrue(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testExist2() {

        HostgroupExistRequest request = new HostgroupExistRequest();
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"xxxxx"}));
        request.getParams().setName(names);

        try {
            HostgroupExistResponse response = zabbixApi.hostgroup().exist(request);

            assertNotNull(response);

            assertFalse(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testHostgroup() {

        testCreate1();

        testUpdate1();

        testDelete1();
    }

    public void testCreate1() {

        String name = "test_hostgroup_create1";
        HostgroupCreateRequest request = new HostgroupCreateRequest();
        request.getParams().setName(name);

        try {
            hostgroupCreateResponse = zabbixApi.hostgroup().create(request);

            assertNotNull(hostgroupCreateResponse);

            assertNotNull(hostgroupCreateResponse.getResult().getGroupids());

            assertTrue(0 < hostgroupCreateResponse.getResult().getGroupids().size());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    public void testUpdate1() {

        int targetGroupid = this.hostgroupCreateResponse.getResult().getGroupids().get(0);
        String name = "test_hostgroup_update1";
        HostgroupUpdateRequest request = new HostgroupUpdateRequest();
        request.getParams().setName(name);
        request.getParams().setGroupid(targetGroupid);

        try {
            HostgroupUpdateResponse response = zabbixApi.hostgroup().update(request);

            assertNotNull(response);

            assertNotNull(response.getResult().getGroupids());

            int groupId = response.getResult().getGroupids().get(0);
            assertEquals(targetGroupid, groupId);
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    public void testDelete1() {

        int targetGroupid = this.hostgroupCreateResponse.getResult().getGroupids().get(0);

        HostgroupDeleteRequest request = new HostgroupDeleteRequest();
        request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupid})));

        try {
            HostgroupDeleteResponse response = zabbixApi.hostgroup().delete(request);

            assertNotNull(response);

            assertNotNull(response.getResult().getGroupids());
            int groupId = response.getResult().getGroupids().get(0);

            assertEquals(targetGroupid, groupId);
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIsReable1() {

        int targetGroupid = 12;
        HostgroupIsReadableRequest request = new HostgroupIsReadableRequest();
        request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupid})));

        try {
            HostgroupIsReadableResponse response = zabbixApi.hostgroup().isReable(request);

            assertNotNull(response);

            assertTrue(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIsReable2() {

        // login as guest user
        login("guest", "");

        int targetGroupid = 12;
        HostgroupIsReadableRequest request = new HostgroupIsReadableRequest();
        request.setParams(new ArrayList<Integer>(Arrays.asList(new Integer[]{targetGroupid})));

        try {
            HostgroupIsReadableResponse response = zabbixApi.hostgroup().isReable(request);

            assertNotNull(response);

            assertFalse(response.isResult());
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }
}
