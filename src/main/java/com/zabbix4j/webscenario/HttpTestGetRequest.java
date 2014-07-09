package com.zabbix4j.webscenario;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HttpTestGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HttpTestGetRequest() {
        setMethod("httptest.get");
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
        private List<Integer> applicationids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> httptestids;
        private List<Integer> templateids;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private Boolean expandName;
        private Boolean expandStepName;
        private String selectHosts;
        private String selectSteps;

        public void addApplicationId(Integer id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addHttpTestId(Integer id) {
            httptestids = ZbxListUtils.add(httptestids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        /**
         * Gets expandStepName.
         *
         * @return Value of expandStepName.
         */
        public Boolean getExpandStepName() {
            return expandStepName;
        }

        /**
         * Sets new expandStepName.
         *
         * @param expandStepName New value of expandStepName.
         */
        public void setExpandStepName(Boolean expandStepName) {
            this.expandStepName = expandStepName;
        }

        /**
         * Gets httptestids.
         *
         * @return Value of httptestids.
         */
        public List<Integer> getHttptestids() {
            return httptestids;
        }

        /**
         * Sets new httptestids.
         *
         * @param httptestids New value of httptestids.
         */
        public void setHttptestids(List<Integer> httptestids) {
            this.httptestids = httptestids;
        }

        /**
         * Gets selectSteps.
         *
         * @return Value of selectSteps.
         */
        public String getSelectSteps() {
            return selectSteps;
        }

        /**
         * Sets new selectSteps.
         *
         * @param selectSteps New value of selectSteps.
         */
        public void setSelectSteps(String selectSteps) {
            this.selectSteps = selectSteps;
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
         * Gets expandName.
         *
         * @return Value of expandName.
         */
        public Boolean getExpandName() {
            return expandName;
        }

        /**
         * Sets new expandName.
         *
         * @param expandName New value of expandName.
         */
        public void setExpandName(Boolean expandName) {
            this.expandName = expandName;
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
