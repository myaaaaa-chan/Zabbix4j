package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MaintenanceUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MaintenanceUpdateRequest() {
        setMethod("maintenance.update");
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

    public class Params extends MaintenanceObject {

        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<TimePeriodObject> timeperiods;

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(groupids, id);
        }

        public void addTimePeriod(TimePeriodObject obj) {
            timeperiods = ZbxListUtils.add(timeperiods, obj);
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
         * Gets timeperiods.
         *
         * @return Value of timeperiods.
         */
        public List<TimePeriodObject> getTimeperiods() {
            return timeperiods;
        }

        /**
         * Sets new timeperiods.
         *
         * @param timeperiods New value of timeperiods.
         */
        public void setTimeperiods(List<TimePeriodObject> timeperiods) {
            this.timeperiods = timeperiods;
        }
    }
}
