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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.utils.ZbxListUtils;
import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class ItemGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemGetRequest() {
        setMethod("item.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> itemids;
        private List<Integer> groupids;
        private List<Integer> templateids;
        private List<Integer> hostids;
        private List<Integer> proxyids;
        private List<Integer> interfaceids;
        private List<Integer> graphids;
        private List<Integer> triggerids;
        private List<Integer> applicationids;
        private Boolean webitems;
        private Boolean inherited;
        private Boolean templated;
        private Boolean monitored;
        private String group;
        private String host;
        private String application;
        private Boolean with_triggers;

        public Params() {
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public List<Integer> getItemids() {
            return itemids;
        }

        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
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

        public List<Integer> getProxyids() {
            return proxyids;
        }

        public void setProxyids(List<Integer> proxyids) {
            this.proxyids = proxyids;
        }

        public List<Integer> getInterfaceids() {
            return interfaceids;
        }

        public void setInterfaceids(List<Integer> interfaceids) {
            this.interfaceids = interfaceids;
        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public List<Integer> getApplicationids() {
            return applicationids;
        }

        public void setApplicationids(List<Integer> applicationids) {
            this.applicationids = applicationids;
        }

        public Boolean getWebitems() {
            return webitems;
        }

        public void setWebitems(Boolean webitems) {
            this.webitems = webitems;
        }

        public Boolean getInherited() {
            return inherited;
        }

        public void setInherited(Boolean inherited) {
            this.inherited = inherited;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

        public Boolean getMonitored() {
            return monitored;
        }

        public void setMonitored(Boolean monitored) {
            this.monitored = monitored;
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

        public String getApplication() {
            return application;
        }

        public void setApplication(String application) {
            this.application = application;
        }

        public Boolean getWith_triggers() {
            return with_triggers;
        }

        public void setWith_triggers(Boolean with_triggers) {
            this.with_triggers = with_triggers;
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addProxyId(Integer id) {
            proxyids = ZbxListUtils.add(proxyids, id);
        }

        public void addInterfaceId(Integer id) {
            interfaceids = ZbxListUtils.add(interfaceids, id);
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public void addApplicationId(Integer id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }
    }
}
