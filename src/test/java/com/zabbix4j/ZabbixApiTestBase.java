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

package com.zabbix4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

/**
 * Created by Suguru Yajima on 2014/04/27.
 */
public class ZabbixApiTestBase {

    protected static Logger logger = LoggerFactory.getLogger(ZabbixApiTestBase.class);
    protected String user = "ops";
    protected String password = "Tsupport_308sdfllsa";

    protected ZabbixApi zabbixApi;

    public ZabbixApiTestBase() {
        login(user, password);
    }

    protected void login(String user, String password) {
        try {
            zabbixApi = new ZabbixApi("http://zabbix.dev.corp.flamingo-inc.com/api_jsonrpc.php");
            zabbixApi.login(user, password);
        } catch (ZabbixApiException e) {
            fail(e.getMessage());
        }
    }

    protected Gson getGson() {

        return new GsonBuilder().setPrettyPrinting().create();
    }

}
