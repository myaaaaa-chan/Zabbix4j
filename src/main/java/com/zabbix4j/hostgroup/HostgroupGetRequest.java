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
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for hostgroup.get
 *
 * @author Suguru Yajima on 2014/04/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostgroupGetRequest() {
        setMethod("hostgroup.get");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
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
    }

}
