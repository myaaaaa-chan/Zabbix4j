package com.zabbix4j.itservice;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ITServiceGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ITServiceGetRequest() {
        setMethod("service.get");
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

        private List<Integer> serviceids;
        private List<Integer> parentids;
        private List<Integer> childids;
        private String selectParent;
        private String selectDependencies;
        private String selectParentDependencies;
        private String selectTimes;
        private String selectAlarms;
        private String selectTrigger;

        public void addSerivceId(Integer id) {
            serviceids = ZbxListUtils.add(serviceids, id);
        }

        public void addParentId(Integer id) {
            parentids = ZbxListUtils.add(parentids, id);
        }

        public void addChildId(Integer id) {
            childids = ZbxListUtils.add(childids, id);
        }

        /**
         * Gets serviceids.
         *
         * @return Value of serviceids.
         */
        public List<Integer> getServiceids() {
            return serviceids;
        }

        /**
         * Sets new serviceids.
         *
         * @param serviceids New value of serviceids.
         */
        public void setServiceids(List<Integer> serviceids) {
            this.serviceids = serviceids;
        }

        /**
         * Gets selectDependencies.
         *
         * @return Value of selectDependencies.
         */
        public String getSelectDependencies() {
            return selectDependencies;
        }

        /**
         * Sets new selectDependencies.
         *
         * @param selectDependencies New value of selectDependencies.
         */
        public void setSelectDependencies(String selectDependencies) {
            this.selectDependencies = selectDependencies;
        }

        /**
         * Gets selectAlarms.
         *
         * @return Value of selectAlarms.
         */
        public String getSelectAlarms() {
            return selectAlarms;
        }

        /**
         * Sets new selectAlarms.
         *
         * @param selectAlarms New value of selectAlarms.
         */
        public void setSelectAlarms(String selectAlarms) {
            this.selectAlarms = selectAlarms;
        }

        /**
         * Gets childids.
         *
         * @return Value of childids.
         */
        public List<Integer> getChildids() {
            return childids;
        }

        /**
         * Sets new childids.
         *
         * @param childids New value of childids.
         */
        public void setChildids(List<Integer> childids) {
            this.childids = childids;
        }

        /**
         * Gets parentids.
         *
         * @return Value of parentids.
         */
        public List<Integer> getParentids() {
            return parentids;
        }

        /**
         * Sets new parentids.
         *
         * @param parentids New value of parentids.
         */
        public void setParentids(List<Integer> parentids) {
            this.parentids = parentids;
        }

        /**
         * Gets selectParentDependencies.
         *
         * @return Value of selectParentDependencies.
         */
        public String getSelectParentDependencies() {
            return selectParentDependencies;
        }

        /**
         * Sets new selectParentDependencies.
         *
         * @param selectParentDependencies New value of selectParentDependencies.
         */
        public void setSelectParentDependencies(String selectParentDependencies) {
            this.selectParentDependencies = selectParentDependencies;
        }

        /**
         * Gets selectParent.
         *
         * @return Value of selectParent.
         */
        public String getSelectParent() {
            return selectParent;
        }

        /**
         * Sets new selectParent.
         *
         * @param selectParent New value of selectParent.
         */
        public void setSelectParent(String selectParent) {
            this.selectParent = selectParent;
        }

        /**
         * Gets selectTimes.
         *
         * @return Value of selectTimes.
         */
        public String getSelectTimes() {
            return selectTimes;
        }

        /**
         * Sets new selectTimes.
         *
         * @param selectTimes New value of selectTimes.
         */
        public void setSelectTimes(String selectTimes) {
            this.selectTimes = selectTimes;
        }

        /**
         * Gets selectTrigger.
         *
         * @return Value of selectTrigger.
         */
        public String getSelectTrigger() {
            return selectTrigger;
        }

        /**
         * Sets new selectTrigger.
         *
         * @param selectTrigger New value of selectTrigger.
         */
        public void setSelectTrigger(String selectTrigger) {
            this.selectTrigger = selectTrigger;
        }
    }
}
