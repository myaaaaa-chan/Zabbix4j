package com.zabbix4j.proxy;

import com.google.gson.annotations.SerializedName;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ProxyCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ProxyCreateRequest() {
        setMethod("proxy.create");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends ProxyObject {

        private List<Host> hosts;
        @SerializedName("interface")
        private ProxyInterfaceObject proxyInterface;

        public void addHostId(Integer id) {
            Host host = new Host();
            host.setHostid(id);
            hosts = ZbxListUtils.add(hosts, host);
        }

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

        /**
         * Gets hosts.
         *
         * @return Value of hosts.
         */
        public List<Host> getHosts() {
            return hosts;
        }

        /**
         * Sets new hosts.
         *
         * @param hosts New value of hosts.
         */
        public void setHosts(List<Host> hosts) {
            this.hosts = hosts;
        }
    }

    public class Host {
        private Integer hostid;

        /**
         * Gets hostid.
         *
         * @return Value of hostid.
         */
        public Integer getHostid() {
            return hostid;
        }

        /**
         * Sets new hostid.
         *
         * @param hostid New value of hostid.
         */
        public void setHostid(Integer hostid) {
            this.hostid = hostid;
        }
    }
}
