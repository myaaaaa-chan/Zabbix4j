/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
