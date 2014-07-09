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

package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiParamter;

/**
 * Created by Suguru Yajima on 2014/05/08.
 */
public class HostObject {

    private Integer hostid;
    private Integer proxy_hostid;
    private String host;
    private Integer status = ZabbixApiParamter.HOST_MONITOR_STATUS.MONITORED_HOST.value;;
    private Integer disable_until;
    private String error;
    private Integer available;
    private Integer errors_from;
    private Integer lastaccess;
    private Integer ipmi_authtype;
    private Integer ipmi_privilege;
    private String ipmi_username;
    private String ipmi_password;
    private Integer ipmi_disable_until;
    private Integer ipmi_available;
    private Integer snmp_disable_until;
    private Integer snmp_available;
    private Integer maintenanceid;
    private Integer maintenance_status;
    private Integer maintenance_type;
    private Integer maintenance_from;
    private Integer ipmi_errors_from;
    private Integer snmp_errors_from;
    private String ipmi_error;
    private String snmp_error;
    private Integer jmx_disable_until;
    private Integer jmx_available;
    private Integer jmx_errors_from;
    private String jmx_error;
    private String name;

    public HostObject() {
    }

    public Integer getHostid() {
        return hostid;
    }

    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    public Integer getProxy_hostid() {
        return proxy_hostid;
    }

    public void setProxy_hostid(Integer proxy_hostid) {
        this.proxy_hostid = proxy_hostid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDisable_until() {
        return disable_until;
    }

    public void setDisable_until(Integer disable_until) {
        this.disable_until = disable_until;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getErrors_from() {
        return errors_from;
    }

    public void setErrors_from(Integer errors_from) {
        this.errors_from = errors_from;
    }

    public Integer getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(Integer lastaccess) {
        this.lastaccess = lastaccess;
    }

    public Integer getIpmi_authtype() {
        return ipmi_authtype;
    }

    public void setIpmi_authtype(Integer ipmi_authtype) {
        this.ipmi_authtype = ipmi_authtype;
    }

    public Integer getIpmi_privilege() {
        return ipmi_privilege;
    }

    public void setIpmi_privilege(Integer ipmi_privilege) {
        this.ipmi_privilege = ipmi_privilege;
    }

    public String getIpmi_username() {
        return ipmi_username;
    }

    public void setIpmi_username(String ipmi_username) {
        this.ipmi_username = ipmi_username;
    }

    public String getIpmi_password() {
        return ipmi_password;
    }

    public void setIpmi_password(String ipmi_password) {
        this.ipmi_password = ipmi_password;
    }

    public Integer getIpmi_disable_until() {
        return ipmi_disable_until;
    }

    public void setIpmi_disable_until(Integer ipmi_disable_until) {
        this.ipmi_disable_until = ipmi_disable_until;
    }

    public Integer getIpmi_available() {
        return ipmi_available;
    }

    public void setIpmi_available(Integer ipmi_available) {
        this.ipmi_available = ipmi_available;
    }

    public Integer getSnmp_disable_until() {
        return snmp_disable_until;
    }

    public void setSnmp_disable_until(Integer snmp_disable_until) {
        this.snmp_disable_until = snmp_disable_until;
    }

    public Integer getSnmp_available() {
        return snmp_available;
    }

    public void setSnmp_available(Integer snmp_available) {
        this.snmp_available = snmp_available;
    }

    public Integer getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(Integer maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public Integer getMaintenance_status() {
        return maintenance_status;
    }

    public void setMaintenance_status(Integer maintenance_status) {
        this.maintenance_status = maintenance_status;
    }

    public Integer getMaintenance_type() {
        return maintenance_type;
    }

    public void setMaintenance_type(Integer maintenance_type) {
        this.maintenance_type = maintenance_type;
    }

    public Integer getMaintenance_from() {
        return maintenance_from;
    }

    public void setMaintenance_from(Integer maintenance_from) {
        this.maintenance_from = maintenance_from;
    }

    public Integer getIpmi_errors_from() {
        return ipmi_errors_from;
    }

    public void setIpmi_errors_from(Integer ipmi_errors_from) {
        this.ipmi_errors_from = ipmi_errors_from;
    }

    public Integer getSnmp_errors_from() {
        return snmp_errors_from;
    }

    public void setSnmp_errors_from(Integer snmp_errors_from) {
        this.snmp_errors_from = snmp_errors_from;
    }

    public String getIpmi_error() {
        return ipmi_error;
    }

    public void setIpmi_error(String ipmi_error) {
        this.ipmi_error = ipmi_error;
    }

    public String getSnmp_error() {
        return snmp_error;
    }

    public void setSnmp_error(String snmp_error) {
        this.snmp_error = snmp_error;
    }

    public Integer getJmx_disable_until() {
        return jmx_disable_until;
    }

    public void setJmx_disable_until(Integer jmx_disable_until) {
        this.jmx_disable_until = jmx_disable_until;
    }

    public Integer getJmx_available() {
        return jmx_available;
    }

    public void setJmx_available(Integer jmx_available) {
        this.jmx_available = jmx_available;
    }

    public Integer getJmx_errors_from() {
        return jmx_errors_from;
    }

    public void setJmx_errors_from(Integer jmx_errors_from) {
        this.jmx_errors_from = jmx_errors_from;
    }

    public String getJmx_error() {
        return jmx_error;
    }

    public void setJmx_error(String jmx_error) {
        this.jmx_error = jmx_error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
