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

package com.zabbix4j.discoveredservice;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DServiceGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public DServiceGetRequest() {
        setMethod("dservice.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> dserviceids;
        private List<Integer> dhostids;
        private List<Integer> dcheckids;
        private List<Integer> druleids;
        private String selectDRules;
        private String selectDHosts;
        private String selectHosts;

        public Params() {
        }

        public void addDServiceId(Integer id) {
            dserviceids = ZbxListUtils.add(dserviceids, id);
        }

        public void addDHostId(Integer id) {
            dhostids = ZbxListUtils.add(dhostids, id);
        }

        public void addDCheckId(Integer id) {
            dcheckids = ZbxListUtils.add(dcheckids, id);
        }

        public void addDRuleId(Integer id) {
            druleids = ZbxListUtils.add(druleids, id);
        }

        public List<Integer> getDserviceids() {
            return dserviceids;
        }

        public void setDserviceids(List<Integer> dserviceids) {
            this.dserviceids = dserviceids;
        }

        public List<Integer> getDhostids() {
            return dhostids;
        }

        public void setDhostids(List<Integer> dhostids) {
            this.dhostids = dhostids;
        }

        public List<Integer> getDcheckids() {
            return dcheckids;
        }

        public void setDcheckids(List<Integer> dcheckids) {
            this.dcheckids = dcheckids;
        }

        public List<Integer> getDruleids() {
            return druleids;
        }

        public void setDruleids(List<Integer> druleids) {
            this.druleids = druleids;
        }

        public String getSelectDRules() {
            return selectDRules;
        }

        public void setSelectDRules(String selectDRules) {
            this.selectDRules = selectDRules;
        }

        public String getSelectDHosts() {
            return selectDHosts;
        }

        public void setSelectDHosts(String selectDHosts) {
            this.selectDHosts = selectDHosts;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }
    }
}
