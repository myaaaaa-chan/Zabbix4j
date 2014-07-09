package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MaintenanceUpdateResponse extends ZabbixApiResponse {

    private Result result;

    public MaintenanceUpdateResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private List<Integer> maintenanceids;

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
