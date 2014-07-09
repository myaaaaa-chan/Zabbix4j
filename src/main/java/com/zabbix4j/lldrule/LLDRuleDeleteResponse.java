package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class LLDRuleDeleteResponse extends ZabbixApiResponse {

    private Result result;

    public LLDRuleDeleteResponse() {
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

        private List<Integer> ruleids;

        /**
         * Gets ruleids.
         *
         * @return Value of ruleids.
         */
        public List<Integer> getRuleids() {
            return ruleids;
        }

        /**
         * Sets new ruleids.
         *
         * @param ruleids New value of ruleids.
         */
        public void setRuleids(List<Integer> ruleids) {
            this.ruleids = ruleids;
        }
    }
}
