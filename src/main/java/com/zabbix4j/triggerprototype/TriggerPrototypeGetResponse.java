package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.discoveryrule.DiscoveryRuleObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.trigger.FunctionObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public TriggerPrototypeGetResponse() {
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

    public class Result extends TriggerPrototypeObject {

        private List<FunctionObject> functions;
        private List<DiscoveryRuleObject> discoveryrules;
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        private List<ItemObject> items;

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
         * Gets discoveryrules.
         *
         * @return Value of discoveryrules.
         */
        public List<DiscoveryRuleObject> getDiscoveryrules() {
            return discoveryrules;
        }

        /**
         * Sets new discoveryrules.
         *
         * @param discoveryrules New value of discoveryrules.
         */
        public void setDiscoveryrules(List<DiscoveryRuleObject> discoveryrules) {
            this.discoveryrules = discoveryrules;
        }

        /**
         * Gets functions.
         *
         * @return Value of functions.
         */
        public List<FunctionObject> getFunctions() {
            return functions;
        }

        /**
         * Sets new functions.
         *
         * @param functions New value of functions.
         */
        public void setFunctions(List<FunctionObject> functions) {
            this.functions = functions;
        }

        /**
         * Gets groups.
         *
         * @return Value of groups.
         */
        public List<HostgroupObject> getGroups() {
            return groups;
        }

        /**
         * Sets new groups.
         *
         * @param groups New value of groups.
         */
        public void setGroups(List<HostgroupObject> groups) {
            this.groups = groups;
        }
    }
}
