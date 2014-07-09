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

package com.zabbix4j.trigger;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/12.
 */
public class TriggerGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public TriggerGetRequest() {
        setMethod("trigger.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> triggerids;
        private List<Integer> groupids;
        private List<Integer> templateids;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private List<Integer> applicationids;
        private List<String> functions;
        private String group;
        private String host;
        private String expandData;
        private Boolean expandDescription;
        private Boolean expandExpression;
        private String selectGroups;
        private String selectItems;
        private String selectHosts;
        private String selectFunctions;
        private String selectDependencies;
        private String selectDiscoveryRule;
        private String selectLastEvent;
        private String filter;
        private Integer limitSelects;

        public Params() {
            super();
        }

        public void addTriggerid(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public void addGroupid(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addTemplateid(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addHostid(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemid(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addApplicationid(Integer id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public void addFunction(String func) {
            functions = ZbxListUtils.add(functions, func);
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
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

        public List<Integer> getApplicationids() {
            return applicationids;
        }

        public void setApplicationids(List<Integer> applicationids) {
            this.applicationids = applicationids;
        }

        public List<String> getFunctions() {
            return functions;
        }

        public void setFunctions(List<String> functions) {
            this.functions = functions;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getExpandData() {
            return expandData;
        }

        public void setExpandData(String expandData) {
            this.expandData = expandData;
        }

        public Boolean getExpandDescription() {
            return expandDescription;
        }

        public void setExpandDescription(Boolean expandDescription) {
            this.expandDescription = expandDescription;
        }

        public Boolean getExpandExpression() {
            return expandExpression;
        }

        public void setExpandExpression(Boolean expandExpression) {
            this.expandExpression = expandExpression;
        }

        public String getSelectGroups() {
            return selectGroups;
        }

        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }

        public String getSelectItems() {
            return selectItems;
        }

        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectFunctions() {
            return selectFunctions;
        }

        public void setSelectFunctions(String selectFunctions) {
            this.selectFunctions = selectFunctions;
        }

        public String getSelectDependencies() {
            return selectDependencies;
        }

        public void setSelectDependencies(String selectDependencies) {
            this.selectDependencies = selectDependencies;
        }

        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }

        public String getSelectLastEvent() {
            return selectLastEvent;
        }

        public void setSelectLastEvent(String selectLastEvent) {
            this.selectLastEvent = selectLastEvent;
        }

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }

        public Integer getLimitSelects() {
            return limitSelects;
        }

        public void setLimitSelects(Integer limitSelects) {
            this.limitSelects = limitSelects;
        }
    }


}
