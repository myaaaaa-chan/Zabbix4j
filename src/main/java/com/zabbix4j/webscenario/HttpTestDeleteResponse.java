package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HttpTestDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public HttpTestDeleteResponse() {
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
        private List<Integer> httptestids;

        /**
         * Gets httptestids.
         *
         * @return Value of httptestids.
         */
        public List<Integer> getHttptestids() {
            return httptestids;
        }

        /**
         * Sets new httptestids.
         *
         * @param httptestids New value of httptestids.
         */
        public void setHttptestids(List<Integer> httptestids) {
            this.httptestids = httptestids;
        }
    }
}
