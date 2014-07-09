package com.zabbix4j.hostprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostPrototypeGetRequest() {
        setMethod("hostprototype.get");
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

        private List<Integer> hostids;
        private List<Integer> discoveryids;
        private Boolean inherited;
        private String selectDiscoveryRule;
        private String selectGroupLinks;
        private String selectGroupPrototypes;
        private List<String> selectInventory;
        private String selectParentHost;
        private String selectTemplates;

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
         * Gets selectTemplates.
         *
         * @return Value of selectTemplates.
         */
        public String getSelectTemplates() {
            return selectTemplates;
        }

        /**
         * Sets new selectTemplates.
         *
         * @param selectTemplates New value of selectTemplates.
         */
        public void setSelectTemplates(String selectTemplates) {
            this.selectTemplates = selectTemplates;
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
         * Gets selectGroupLinks.
         *
         * @return Value of selectGroupLinks.
         */
        public String getSelectGroupLinks() {
            return selectGroupLinks;
        }

        /**
         * Sets new selectGroupLinks.
         *
         * @param selectGroupLinks New value of selectGroupLinks.
         */
        public void setSelectGroupLinks(String selectGroupLinks) {
            this.selectGroupLinks = selectGroupLinks;
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
         * Gets selectGroupPrototypes.
         *
         * @return Value of selectGroupPrototypes.
         */
        public String getSelectGroupPrototypes() {
            return selectGroupPrototypes;
        }

        /**
         * Sets new selectGroupPrototypes.
         *
         * @param selectGroupPrototypes New value of selectGroupPrototypes.
         */
        public void setSelectGroupPrototypes(String selectGroupPrototypes) {
            this.selectGroupPrototypes = selectGroupPrototypes;
        }

        /**
         * Gets selectParentHost.
         *
         * @return Value of selectParentHost.
         */
        public String getSelectParentHost() {
            return selectParentHost;
        }

        /**
         * Sets new selectParentHost.
         *
         * @param selectParentHost New value of selectParentHost.
         */
        public void setSelectParentHost(String selectParentHost) {
            this.selectParentHost = selectParentHost;
        }

        /**
         * Gets selectInventory.
         *
         * @return Value of selectInventory.
         */
        public List<String> getSelectInventory() {
            return selectInventory;
        }

        /**
         * Sets new selectInventory.
         *
         * @param selectInventory New value of selectInventory.
         */
        public void setSelectInventory(List<String> selectInventory) {
            this.selectInventory = selectInventory;
        }
    }
}
