package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeCreateResponse extends ZabbixApiResponse {

    private Result result;

    public TriggerPrototypeCreateResponse() {
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
        private List<Integer> triggerids;

        /**
         * Gets triggerids.
         *
         * @return Value of triggerids.
         */
        public List<Integer> getTriggerids() {
            return triggerids;
        }

        /**
         * Sets new triggerids.
         *
         * @param triggerids New value of triggerids.
         */
        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }
    }
}
