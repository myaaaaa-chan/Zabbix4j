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

package com.zabbix4j.graph;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public GraphGetRequest() {
        setMethod("graph.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {

        private List<Integer> graphids;
        private List<Integer> groupids;
        private List<Integer> templateids;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private Boolean templated;
        private Boolean inherited;
        private Boolean expandName;
        private String selectGroups;
        private String selectTemplates;
        private String selectHosts;
        private String selectItems;
        private String selectGraphItems;
        private String selectDiscoveryRule;

        public Params() {
            super();
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addGropuId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addtempateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        public List<Integer> getGroupids() {
            return groupids;
        }

        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        public List<Integer> getTemplateids() {
            return templateids;
        }

        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getItemids() {
            return itemids;
        }

        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

        public Boolean getInherited() {
            return inherited;
        }

        public void setInherited(Boolean inherited) {
            this.inherited = inherited;
        }

        public Boolean getExpandName() {
            return expandName;
        }

        public void setExpandName(Boolean expandName) {
            this.expandName = expandName;
        }

        public String getSelectGroups() {
            return selectGroups;
        }

        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }

        public String getSelectTemplates() {
            return selectTemplates;
        }

        public void setSelectTemplates(String selectTemplates) {
            this.selectTemplates = selectTemplates;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectItems() {
            return selectItems;
        }

        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
        }

        public String getSelectGraphItems() {
            return selectGraphItems;
        }

        public void setSelectGraphItems(String selectGraphItems) {
            this.selectGraphItems = selectGraphItems;
        }

        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }
    }
}
