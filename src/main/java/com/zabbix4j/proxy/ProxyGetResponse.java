package com.zabbix4j.proxy;

import com.google.gson.annotations.SerializedName;
import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ProxyGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public ProxyGetResponse() {
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

    public class Result extends ProxyObject {

        @SerializedName("interface")
        private ProxyInterfaceObject proxyInterface;

        /**
         * Gets proxyInterface.
         *
         * @return Value of proxyInterface.
         */
        public ProxyInterfaceObject getProxyInterface() {
            return proxyInterface;
        }

        /**
         * Sets new proxyInterface.
         *
         * @param proxyInterface New value of proxyInterface.
         */
        public void setProxyInterface(ProxyInterfaceObject proxyInterface) {
            this.proxyInterface = proxyInterface;
        }
    }
}
