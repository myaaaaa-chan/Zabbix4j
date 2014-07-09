package com.zabbix4j.proxy;

/**
 * @author Suguru Yajima
 */
public class ProxyInterfaceObject {

    private Integer interfaceid;
    private String dns;
    private String ip;
    private Integer port;
    private Integer useip;
    private Integer hostid;

    /**
     * Gets interfaceid.
     *
     * @return Value of interfaceid.
     */
    public Integer getInterfaceid() {
        return interfaceid;
    }

    /**
     * Sets new interfaceid.
     *
     * @param interfaceid New value of interfaceid.
     */
    public void setInterfaceid(Integer interfaceid) {
        this.interfaceid = interfaceid;
    }

    /**
     * Gets dns.
     *
     * @return Value of dns.
     */
    public String getDns() {
        return dns;
    }

    /**
     * Sets new dns.
     *
     * @param dns New value of dns.
     */
    public void setDns(String dns) {
        this.dns = dns;
    }

    /**
     * Gets port.
     *
     * @return Value of port.
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets new port.
     *
     * @param port New value of port.
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Gets useip.
     *
     * @return Value of useip.
     */
    public Integer getUseip() {
        return useip;
    }

    /**
     * Sets new useip.
     *
     * @param useip New value of useip.
     */
    public void setUseip(Integer useip) {
        this.useip = useip;
    }

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

    /**
     * Gets ip.
     *
     * @return Value of ip.
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets new ip.
     *
     * @param ip New value of ip.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    public static enum USE_IP {
        DNS_NAME(0), IP_ADDRESS(1);
        public int value;

        private USE_IP(int value) {
            this.value = value;
        }
    }
}
