package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.hostgroup.HostgroupObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MaintenanceGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public MaintenanceGetResponse() {
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

    public class Result extends MaintenanceObject {

        private List<HostgroupObject> groups;
        private List<TimePeriodObject> timeperiods;

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
