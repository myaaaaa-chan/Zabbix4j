package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScriptUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public ScriptUpdateResponse() {
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

        private List<Integer> scriptids;

        /**
         * Gets scriptids.
         *
         * @return Value of scriptids.
         */
        public List<Integer> getScriptids() {
            return scriptids;
        }

        /**
         * Sets new scriptids.
         *
         * @param scriptids New value of scriptids.
         */
        public void setScriptids(List<Integer> scriptids) {
            this.scriptids = scriptids;
        }
    }
}
