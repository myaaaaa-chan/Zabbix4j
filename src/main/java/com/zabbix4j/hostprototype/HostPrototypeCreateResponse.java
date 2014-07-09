package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/05.
 */
public class HostPrototypeCreateResponse extends ZabbixApiResponse {

    /**
     * Result of hostprototype.create method
     */
    private Result result;

    public HostPrototypeCreateResponse() {
        super();
    }

    /**
     * Gets Result of hostprototype.create method.
     *
     * @return Value of Result of hostprototype.create method.
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets new Result of hostprototype.create method.
     *
     * @param result New value of Result of hostprototype.create method.
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        /**
         * ID of created host prototype.
         */
        private List<Integer> hostids;

        /**
         * Gets ID of created host prototype..
         *
         * @return Value of ID of created host prototype..
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new ID of created host prototype..
         *
         * @param hostids New value of ID of created host prototype..
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }
    }
}
