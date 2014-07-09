package com.zabbix4j.triggerprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TriggerPrototypeGetRequest() {
        setMethod("triggerprototype.get");
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
        private Boolean active;
        private List<Integer> applicationids;
        private List<Integer> discoveryids;
        private List<String> functions;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> templateids;
        private List<Integer> triggerids;
        private String group;
        private String host;
        private Boolean inherited;
        private Boolean maintenance;
        private Integer min_severity;
        private String monitored;
        private Boolean templated;
        private String expandData;
        private String expandExpression;
        private String selectDiscoveryRule;
        private String selectFunctions;
        private String selectGroups;
        private String selectHosts;
        private String selectItems;

        public void addApplicationId(Integer id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public void addDiscoveryId(Integer id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
        }

        public void addFunction(String function) {
            functions = ZbxListUtils.add(functions, function);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        /**
         * Gets expandData.
         *
         * @return Value of expandData.
         */
        public String getExpandData() {
            return expandData;
        }

        /**
         * Sets new expandData.
         *
         * @param expandData New value of expandData.
         */
        public void setExpandData(String expandData) {
            this.expandData = expandData;
        }

        /**
         * Gets selectFunctions.
         *
         * @return Value of selectFunctions.
         */
        public String getSelectFunctions() {
            return selectFunctions;
        }

        /**
         * Sets new selectFunctions.
         *
         * @param selectFunctions New value of selectFunctions.
         */
        public void setSelectFunctions(String selectFunctions) {
            this.selectFunctions = selectFunctions;
        }

        /**
         * Gets monitored.
         *
         * @return Value of monitored.
         */
        public String getMonitored() {
            return monitored;
        }

        /**
         * Sets new monitored.
         *
         * @param monitored New value of monitored.
         */
        public void setMonitored(String monitored) {
            this.monitored = monitored;
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
         * Gets group.
         *
         * @return Value of group.
         */
        public String getGroup() {
            return group;
        }

        /**
         * Sets new group.
         *
         * @param group New value of group.
         */
        public void setGroup(String group) {
            this.group = group;
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
         * Gets selectItems.
         *
         * @return Value of selectItems.
         */
        public String getSelectItems() {
            return selectItems;
        }

        /**
         * Sets new selectItems.
         *
         * @param selectItems New value of selectItems.
         */
        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
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
         * Gets groupids.
         *
         * @return Value of groupids.
         */
        public List<Integer> getGroupids() {
            return groupids;
        }

        /**
         * Sets new groupids.
         *
         * @param groupids New value of groupids.
         */
        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        /**
         * Gets expandExpression.
         *
         * @return Value of expandExpression.
         */
        public String getExpandExpression() {
            return expandExpression;
        }

        /**
         * Sets new expandExpression.
         *
         * @param expandExpression New value of expandExpression.
         */
        public void setExpandExpression(String expandExpression) {
            this.expandExpression = expandExpression;
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
         * Gets functions.
         *
         * @return Value of functions.
         */
        public List<String> getFunctions() {
            return functions;
        }

        /**
         * Sets new functions.
         *
         * @param functions New value of functions.
         */
        public void setFunctions(List<String> functions) {
            this.functions = functions;
        }

        /**
         * Gets maintenance.
         *
         * @return Value of maintenance.
         */
        public Boolean getMaintenance() {
            return maintenance;
        }

        /**
         * Sets new maintenance.
         *
         * @param maintenance New value of maintenance.
         */
        public void setMaintenance(Boolean maintenance) {
            this.maintenance = maintenance;
        }

        /**
         * Gets applicationids.
         *
         * @return Value of applicationids.
         */
        public List<Integer> getApplicationids() {
            return applicationids;
        }

        /**
         * Sets new applicationids.
         *
         * @param applicationids New value of applicationids.
         */
        public void setApplicationids(List<Integer> applicationids) {
            this.applicationids = applicationids;
        }

        /**
         * Gets selectGroups.
         *
         * @return Value of selectGroups.
         */
        public String getSelectGroups() {
            return selectGroups;
        }

        /**
         * Sets new selectGroups.
         *
         * @param selectGroups New value of selectGroups.
         */
        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }

        /**
         * Gets active.
         *
         * @return Value of active.
         */
        public Boolean getActive() {
            return active;
        }

        /**
         * Sets new active.
         *
         * @param active New value of active.
         */
        public void setActive(Boolean active) {
            this.active = active;
        }

        /**
         * Gets min_severity.
         *
         * @return Value of min_severity.
         */
        public Integer getMin_severity() {
            return min_severity;
        }

        /**
         * Sets new min_severity.
         *
         * @param min_severity New value of min_severity.
         */
        public void setMin_severity(Integer min_severity) {
            this.min_severity = min_severity;
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
         * Gets host.
         *
         * @return Value of host.
         */
        public String getHost() {
            return host;
        }

        /**
         * Sets new host.
         *
         * @param host New value of host.
         */
        public void setHost(String host) {
            this.host = host;
        }
    }
}
