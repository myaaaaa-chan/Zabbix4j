package com.zabbix4j.itemprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemPrototypeGetRequest() {
        setMethod("itemprototype.get");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {

        private List<Integer> discoveryids;
        private List<Integer> graphids;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private List<Integer> templateids;
        private List<Integer> triggerids;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private String selectApplications;
        private String selectDiscoveryRule;
        private String selectGraphs;
        private String selectHosts;
        private String selectTriggers;

        public void addDiscoveryId(Integer id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        /**
         * Gets graphids.
         *
         * @return Value of graphids.
         */
        public List<Integer> getGraphids() {
            return graphids;
        }

        /**
         * Sets new graphids.
         *
         * @param graphids New value of graphids.
         */
        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        /**
         * Gets selectGraphs.
         *
         * @return Value of selectGraphs.
         */
        public String getSelectGraphs() {
            return selectGraphs;
        }

        /**
         * Sets new selectGraphs.
         *
         * @param selectGraphs New value of selectGraphs.
         */
        public void setSelectGraphs(String selectGraphs) {
            this.selectGraphs = selectGraphs;
        }

        /**
         * Gets templated.
         *
         * @return Value of templated.
         */
        public Boolean getTemplated() {
            return templated;
        }

        /**
         * Sets new templated.
         *
         * @param templated New value of templated.
         */
        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

        /**
         * Gets selectHosts.
         *
         * @return Value of selectHosts.
         */
        public String getSelectHosts() {
            return selectHosts;
        }

        /**
         * Sets new selectHosts.
         *
         * @param selectHosts New value of selectHosts.
         */
        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        /**
         * Gets monitored.
         *
         * @return Value of monitored.
         */
        public Boolean getMonitored() {
            return monitored;
        }

        /**
         * Sets new monitored.
         *
         * @param monitored New value of monitored.
         */
        public void setMonitored(Boolean monitored) {
            this.monitored = monitored;
        }

        /**
         * Gets triggerids.
         *
         * @return Value of triggerids.
         */
        public List<Integer> getTriggerids() {
            return triggerids;
        }

        /**
         * Sets new triggerids.
         *
         * @param triggerids New value of triggerids.
         */
        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        /**
         * Gets itemids.
         *
         * @return Value of itemids.
         */
        public List<Integer> getItemids() {
            return itemids;
        }

        /**
         * Sets new itemids.
         *
         * @param itemids New value of itemids.
         */
        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        /**
         * Gets selectDiscoveryRule.
         *
         * @return Value of selectDiscoveryRule.
         */
        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        /**
         * Sets new selectDiscoveryRule.
         *
         * @param selectDiscoveryRule New value of selectDiscoveryRule.
         */
        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }

        /**
         * Gets inherited.
         *
         * @return Value of inherited.
         */
        public Boolean getInherited() {
            return inherited;
        }

        /**
         * Sets new inherited.
         *
         * @param inherited New value of inherited.
         */
        public void setInherited(Boolean inherited) {
            this.inherited = inherited;
        }

        /**
         * Gets selectTriggers.
         *
         * @return Value of selectTriggers.
         */
        public String getSelectTriggers() {
            return selectTriggers;
        }

        /**
         * Sets new selectTriggers.
         *
         * @param selectTriggers New value of selectTriggers.
         */
        public void setSelectTriggers(String selectTriggers) {
            this.selectTriggers = selectTriggers;
        }

        /**
         * Gets selectApplications.
         *
         * @return Value of selectApplications.
         */
        public String getSelectApplications() {
            return selectApplications;
        }

        /**
         * Sets new selectApplications.
         *
         * @param selectApplications New value of selectApplications.
         */
        public void setSelectApplications(String selectApplications) {
            this.selectApplications = selectApplications;
        }

        /**
         * Gets discoveryids.
         *
         * @return Value of discoveryids.
         */
        public List<Integer> getDiscoveryids() {
            return discoveryids;
        }

        /**
         * Sets new discoveryids.
         *
         * @param discoveryids New value of discoveryids.
         */
        public void setDiscoveryids(List<Integer> discoveryids) {
            this.discoveryids = discoveryids;
        }

        /**
         * Gets hostids.
         *
         * @return Value of hostids.
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new hostids.
         *
         * @param hostids New value of hostids.
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        /**
         * Gets templateids.
         *
         * @return Value of templateids.
         */
        public List<Integer> getTemplateids() {
            return templateids;
        }

        /**
         * Sets new templateids.
         *
         * @param templateids New value of templateids.
         */
        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }
    }
}
