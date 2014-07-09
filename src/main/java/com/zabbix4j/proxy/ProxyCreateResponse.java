package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ProxyCreateResponse extends ZabbixApiResponse {

    private Result result;

    public ProxyCreateResponse() {
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

        private List<Integer> proxyids;

        /**
         * Gets proxyids.
         *
         * @return Value of proxyids.
         */
        public List<Integer> getProxyids() {
            return proxyids;
        }

        /**
         * Sets new proxyids.
         *
         * @param proxyids New value of proxyids.
         */
        public void setProxyids(List<Integer> proxyids) {
            this.proxyids = proxyids;
        }
    }
}
