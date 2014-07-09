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

package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiRequest;

/**
 * Created by Suguru Yajima on 2014/05/07.
 */
public class ItemCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemCreateRequest() {
        setMethod("item.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends ItemObject {

        public Params() {
            super();
        }
    }

    /*
    public class Params {
        private String name;
        private String key_;
        private Integer hostid;
        private Integer value_type;
        private Integer interfaceid;
        private List<Integer> applications;
        private Integer delay;

        public Params() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKey_() {
            return key_;
        }

        public void setKey_(String key_) {
            this.key_ = key_;
        }

        public Integer getHostid() {
            return hostid;
        }

        public void setHostid(Integer hostid) {
            this.hostid = hostid;
        }

        public Integer getValue_type() {
            return value_type;
        }

        public void setValue_type(Integer value_type) {
            this.value_type = value_type;
        }

        public Integer getInterfaceid() {
            return interfaceid;
        }

        public void setInterfaceid(Integer interfaceid) {
            this.interfaceid = interfaceid;
        }

        public List<Integer> getApplications() {
            return applications;
        }

        public void setApplications(List<Integer> applications) {
            this.applications = applications;
        }

        public Integer getDelay() {
            return delay;
        }

        public void setDelay(Integer delay) {
            this.delay = delay;
        }
    }
    */
}
