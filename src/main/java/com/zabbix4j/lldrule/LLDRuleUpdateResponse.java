package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class LLDRuleUpdateResponse extends ZabbixApiResponse {

    private Result result;

    public LLDRuleUpdateResponse() {
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

        private List<Integer> itemids;

        /**
         * Gets itemids.
         *
         * @return Value of itemids.
         */
        public List<Integer> getItemids() {
            return itemids;
        }

        /**
         * Sets new itemids.
         *
         * @param itemids New value of itemids.
         */
        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }
    }
}
