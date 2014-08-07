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

package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.application.ApplicationObject;
import com.zabbix4j.discoveryrule.DiscoveryRuleObject;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.trigger.TriggerObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public ItemPrototypeGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ItemPrototypeObject {

        private List<HostObject> hosts;
        private List<ApplicationObject> applications;
        private List<TriggerObject> triggers;
        private List<GraphObject> graphs;
        private DiscoveryRuleObject discoveryRule;

        /**
         * Gets triggers.
         *
         * @return Value of triggers.
         */
        public List<TriggerObject> getTriggers() {
            return triggers;
        }

        /**
         * Sets new triggers.
         *
         * @param triggers New value of triggers.
         */
        public void setTriggers(List<TriggerObject> triggers) {
            this.triggers = triggers;
        }

        /**
         * Gets graphs.
         *
         * @return Value of graphs.
         */
        public List<GraphObject> getGraphs() {
            return graphs;
        }

        /**
         * Sets new graphs.
         *
         * @param graphs New value of graphs.
         */
        public void setGraphs(List<GraphObject> graphs) {
            this.graphs = graphs;
        }


        /**
         * Gets hosts.
         *
         * @return Value of hosts.
         */
        public List<HostObject> getHosts() {
            return hosts;
        }

        /**
         * Sets new hosts.
         *
         * @param hosts New value of hosts.
         */
        public void setHosts(List<HostObject> hosts) {
            this.hosts = hosts;
        }

        /**
         * Gets applications.
         *
         * @return Value of applications.
         */
        public List<ApplicationObject> getApplications() {
            return applications;
        }

        /**
         * Sets new applications.
         *
         * @param applications New value of applications.
         */
        public void setApplications(List<ApplicationObject> applications) {
            this.applications = applications;
        }

        /**
         * Gets discoveryRule.
         *
         * @return Value of discoveryRule.
         */
        public DiscoveryRuleObject getDiscoveryRule() {
            return discoveryRule;
        }

        /**
         * Sets new discoveryRule.
         *
         * @param discoveryRule New value of discoveryRule.
         */
        public void setDiscoveryRule(DiscoveryRuleObject discoveryRule) {
            this.discoveryRule = discoveryRule;
        }
    }
}
