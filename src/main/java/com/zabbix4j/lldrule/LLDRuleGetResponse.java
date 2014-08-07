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

package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostprototype.HostPrototypeObject;
import com.zabbix4j.item.ItemObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class LLDRuleGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public LLDRuleGetResponse() {
        super();
    }

    public class Result extends LLDRuleObject {

        private List<HostObject> hosts;
        private List<ItemObject> items;
        private List<GraphObject> graphs;
        private List<HostPrototypeObject> hostPrototypes;

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
         * Gets items.
         *
         * @return Value of items.
         */
        public List<ItemObject> getItems() {
            return items;
        }

        /**
         * Sets new items.
         *
         * @param items New value of items.
         */
        public void setItems(List<ItemObject> items) {
            this.items = items;
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
         * Gets hostPrototypes.
         *
         * @return Value of hostPrototypes.
         */
        public List<HostPrototypeObject> getHostPrototypes() {
            return hostPrototypes;
        }

        /**
         * Sets new hostPrototypes.
         *
         * @param hostPrototypes New value of hostPrototypes.
         */
        public void setHostPrototypes(List<HostPrototypeObject> hostPrototypes) {
            this.hostPrototypes = hostPrototypes;
        }
    }
}
