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

package com.zabbix4j.proxy;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ProxyGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ProxyGetRequest() {
        setMethod("proxy.get");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {

        private List<Integer> proxyids;
        private String selectHosts;
        private String selectInterface;

        public void addProxyId(Integer id) {
            proxyids = ZbxListUtils.add(proxyids, id);
        }

        /**
         * Gets selectInterface.
         *
         * @return Value of selectInterface.
         */
        public String getSelectInterface() {
            return selectInterface;
        }

        /**
         * Sets new selectInterface.
         *
         * @param selectInterface New value of selectInterface.
         */
        public void setSelectInterface(String selectInterface) {
            this.selectInterface = selectInterface;
        }

        /**
         * Gets selectHosts.
         *
         * @return Value of selectHosts.
         */
        public String getSelectHosts() {
            return selectHosts;
        }

        /**
         * Sets new selectHosts.
         *
         * @param selectHosts New value of selectHosts.
         */
        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        /**
         * Gets proxyids.
         *
         * @return Value of proxyids.
         */
        public List<Integer> getProxyids() {
            return proxyids;
        }

        /**
         * Sets new proxyids.
         *
         * @param proxyids New value of proxyids.
         */
        public void setProxyids(List<Integer> proxyids) {
            this.proxyids = proxyids;
        }
    }
}
