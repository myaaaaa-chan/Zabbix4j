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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/04/27.
 */
public class HostgroupGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostgroupGetRequest() {
        setMethod("hostgroup.get");
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
        private List<Integer> hostids;
        private List<Integer> maintenanceids;
        private List<Integer> templateids;
        private List<Integer> triggerids;
        private Boolean monitored_hosts;
        private Boolean not_proxy_hosts;
        private Boolean real_hosts;
        private Boolean templated_hosts;
        private Boolean with_applications;
        private Boolean with_graphs;
        private Boolean with_hosts_and_templates;
        private Boolean with_httptests;
        private Boolean with_items;
        private Boolean with_monitored_httptests;
        private Boolean with_monitored_items;
        private Boolean with_monitored_triggers;
        private Boolean with_simple_graph_items;
        private Boolean with_triggers;
        private String selectDiscoveryRule;
        /**
         * Return the host group discovery object in the groupDiscovery property.
         * <p/>
         * The host group discovery object links a discovered host group to a host group prototype and has the following properties:
         * groupid - (string) ID of the discovered host group;
         * lastcheck - (timestamp) time when the host group was last discovered;
         * name - (string) name of the host goup prototype;
         * parent_group_prototypeid - (string) ID of the host group prototype from which the host group has been created;
         * ts_delete - (timestamp) time when a host group that is no longer discovered will be deleted.
         */
        private String selectGroupDiscovery;
        private String selectHosts;
        private String selectTemplates;
        private Filter filter;

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addMaintenanceId(Integer id) {
            maintenanceids = ZbxListUtils.add(maintenanceids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public String getSelectTemplates() {
            return selectTemplates;
        }

        public void setSelectTemplates(String selectTemplates) {
            this.selectTemplates = selectTemplates;
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

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getMaintenanceids() {
            return maintenanceids;
        }

        public void setMaintenanceids(List<Integer> maintenanceids) {
            this.maintenanceids = maintenanceids;
        }

        public List<Integer> getTemplateids() {
            return templateids;
        }

        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public Boolean getMonitored_hosts() {
            return monitored_hosts;
        }

        public void setMonitored_hosts(Boolean monitored_hosts) {
            this.monitored_hosts = monitored_hosts;
        }

        public Boolean getNot_proxy_hosts() {
            return not_proxy_hosts;
        }

        public void setNot_proxy_hosts(Boolean not_proxy_hosts) {
            this.not_proxy_hosts = not_proxy_hosts;
        }

        public Boolean getReal_hosts() {
            return real_hosts;
        }

        public void setReal_hosts(Boolean real_hosts) {
            this.real_hosts = real_hosts;
        }

        public Boolean getTemplated_hosts() {
            return templated_hosts;
        }

        public void setTemplated_hosts(Boolean templated_hosts) {
            this.templated_hosts = templated_hosts;
        }

        public Boolean getWith_applications() {
            return with_applications;
        }

        public void setWith_applications(Boolean with_applications) {
            this.with_applications = with_applications;
        }

        public Boolean getWith_graphs() {
            return with_graphs;
        }

        public void setWith_graphs(Boolean with_graphs) {
            this.with_graphs = with_graphs;
        }

        public Boolean getWith_hosts_and_templates() {
            return with_hosts_and_templates;
        }

        public void setWith_hosts_and_templates(Boolean with_hosts_and_templates) {
            this.with_hosts_and_templates = with_hosts_and_templates;
        }

        public Boolean getWith_httptests() {
            return with_httptests;
        }

        public void setWith_httptests(Boolean with_httptests) {
            this.with_httptests = with_httptests;
        }

        public Boolean getWith_items() {
            return with_items;
        }

        public void setWith_items(Boolean with_items) {
            this.with_items = with_items;
        }

        public Boolean getWith_monitored_httptests() {
            return with_monitored_httptests;
        }

        public void setWith_monitored_httptests(Boolean with_monitored_httptests) {
            this.with_monitored_httptests = with_monitored_httptests;
        }

        public Boolean getWith_monitored_items() {
            return with_monitored_items;
        }

        public void setWith_monitored_items(Boolean with_monitored_items) {
            this.with_monitored_items = with_monitored_items;
        }

        public Boolean getWith_monitored_triggers() {
            return with_monitored_triggers;
        }

        public void setWith_monitored_triggers(Boolean with_monitored_triggers) {
            this.with_monitored_triggers = with_monitored_triggers;
        }

        public Boolean getWith_simple_graph_items() {
            return with_simple_graph_items;
        }

        public void setWith_simple_graph_items(Boolean with_simple_graph_items) {
            this.with_simple_graph_items = with_simple_graph_items;
        }

        public Boolean getWith_triggers() {
            return with_triggers;
        }

        public void setWith_triggers(Boolean with_triggers) {
            this.with_triggers = with_triggers;
        }

        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }

        public String getSelectGroupDiscovery() {
            return selectGroupDiscovery;
        }

        public void setSelectGroupDiscovery(String selectGroupDiscovery) {
            this.selectGroupDiscovery = selectGroupDiscovery;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public Filter getFilter() {
            return filter;
        }

        public void setFilter(Filter filter) {
            this.filter = filter;
        }

        public Filter newFilter() {
            return new Filter();

        }
    }


    public class Filter {
        private List<String> name;

        public List<String> getName() {
            return name;
        }

        public void setName(List<String> name) {
            this.name = name;
        }

        public void addName(String name) {
            this.name = ZbxListUtils.add(this.name, name);

        }
    }

}
