package com.zabbix4j.lldrule;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class LLDRuleGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public LLDRuleGetRequest() {
        setMethod("discoveryrule.get");
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
        private List<Integer> itemids;
        private List<Integer> hostids;
        private List<Integer> interfaceids;
        private List<Integer> templateids;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private String selectHosts;
        private String selectGraphs;
        private String selectHostPrototypes;
        private String selectItems;
        private String selectTriggers;

        public Params() {
            super();
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addInterfaceId(Integer id) {
            interfaceids = ZbxListUtils.add(interfaceids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
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
         * Gets selectHostPrototypes.
         *
         * @return Value of selectHostPrototypes.
         */
        public String getSelectHostPrototypes() {
            return selectHostPrototypes;
        }

        /**
         * Sets new selectHostPrototypes.
         *
         * @param selectHostPrototypes New value of selectHostPrototypes.
         */
        public void setSelectHostPrototypes(String selectHostPrototypes) {
            this.selectHostPrototypes = selectHostPrototypes;
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
         * Gets interfaceids.
         *
         * @return Value of interfaceids.
         */
        public List<Integer> getInterfaceids() {
            return interfaceids;
        }

        /**
         * Sets new interfaceids.
         *
         * @param interfaceids New value of interfaceids.
         */
        public void setInterfaceids(List<Integer> interfaceids) {
            this.interfaceids = interfaceids;
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
    }
}
