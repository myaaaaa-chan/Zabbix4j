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

package com.zabbix4j.hostinteface;

import com.zabbix4j.ZabbixApiParamter;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostInterfaceObject {

    private Integer interfaceid;
    private String dns = "";
    private Integer hostid;
    private String ip;
    private Integer main = 1;
    private Integer port = ZabbixApiParamter.ZABBIX_CLIENT_DEFAULT_PORT;
    private Integer type = ZabbixApiParamter.HOST_INTERFACE_TYPE.AGENT.value;
    private Integer useip = ZabbixApiParamter.HOST_AGENT_ACCESS_INTERFACE.IP_ADDRESS.value;

    public HostInterfaceObject() {
    }

    public Integer getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(Integer interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public Integer getHostid() {
        return hostid;
    }

    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getMain() {
        return main;
    }

    public void setMain(Integer main) {
        this.main = main;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUseip() {
        return useip;
    }

    public void setUseip(Integer useip) {
        this.useip = useip;
    }

}
