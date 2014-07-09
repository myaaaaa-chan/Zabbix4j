package com.zabbix4j.maintenance;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MaintenanceGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MaintenanceGetRequest() {
        setMethod("maintenance.get");
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

        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> maintenanceids;
        private String selectGroups;
        private String selectHosts;
        private String selectTimeperiods;

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addMaintenanceId(Integer id) {
            maintenanceids = ZbxListUtils.add(maintenanceids, id);
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
         * Gets selectTimeperiods.
         *
         * @return Value of selectTimeperiods.
         */
        public String getSelectTimeperiods() {
            return selectTimeperiods;
        }

        /**
         * Sets new selectTimeperiods.
         *
         * @param selectTimeperiods New value of selectTimeperiods.
         */
        public void setSelectTimeperiods(String selectTimeperiods) {
            this.selectTimeperiods = selectTimeperiods;
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
         * Gets maintenanceids.
         *
         * @return Value of maintenanceids.
         */
        public List<Integer> getMaintenanceids() {
            return maintenanceids;
        }

        /**
         * Sets new maintenanceids.
         *
         * @param maintenanceids New value of maintenanceids.
         */
        public void setMaintenanceids(List<Integer> maintenanceids) {
            this.maintenanceids = maintenanceids;
        }
    }
}
