package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ITServiceDeleteResponse extends ZabbixApiResponse {

    private Result result;

    public ITServiceDeleteResponse() {
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

        private List<Integer> serviceids;


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
    }
}
