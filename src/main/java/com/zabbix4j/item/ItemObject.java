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

package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiParamter;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class ItemObject {

    private Integer itemid;
    private Integer delay = ZabbixApiParamter.ITEM_DELAY_DEFAULT;
    private Integer hostid;
    private Integer interfaceid;
    private String key_;
    private String name;
    private Integer type;
    private Integer value_type;
    private Integer authtype;
    private Integer data_type;
    private String delay_flex;
    private Integer delta;
    private String description;
    private String error;
    private Integer flags;
    private Float formula;
    private Integer history;
    private Integer inventory_link;
    private String ipmi_sensor;
    private Long lastclock;
    private Integer lastns;
    private String lastvalue;
    private String logtimefmt;
    private Long mtime;
    private Integer multiplier;
    private String params;
    private String password;
    private String port;
    private String prevorgvalue;
    private String prevvalue;
    private String privatekey;
    private String publickey;
    private String snmp_community;
    private String snmp_oid;
    private String snmpv3_authpassphrase;
    private String snmpv3_privpassphrase;
    private String snmpv3_securitylevel;
    private String snmpv3_securityname;
    private Integer status;
    private String templateid;
    private String trapper_hosts;
    private Integer trends;
    private String units;
    private String username;
    private String valuemapid;
    private Integer lifetime;

    public String getValuemapid() {
        return valuemapid;
    }

    public void setValuemapid(String valuemapid) {
        this.valuemapid = valuemapid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Integer getHostid() {
        return hostid;
    }

    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    public Integer getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(Integer interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getKey_() {
        return key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getValue_type() {
        return value_type;
    }

    public void setValue_type(Integer value_type) {
        this.value_type = value_type;
    }

    public Integer getAuthtype() {
        return authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    public Integer getData_type() {
        return data_type;
    }

    public void setData_type(Integer data_type) {
        this.data_type = data_type;
    }

    public String getDelay_flex() {
        return delay_flex;
    }

    public void setDelay_flex(String delay_flex) {
        this.delay_flex = delay_flex;
    }

    public Integer getDelta() {
        return delta;
    }

    public void setDelta(Integer delta) {
        this.delta = delta;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Float getFormula() {
        return formula;
    }

    public void setFormula(Float formula) {
        this.formula = formula;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getInventory_link() {
        return inventory_link;
    }

    public void setInventory_link(Integer inventory_link) {
        this.inventory_link = inventory_link;
    }

    public String getIpmi_sensor() {
        return ipmi_sensor;
    }

    public void setIpmi_sensor(String ipmi_sensor) {
        this.ipmi_sensor = ipmi_sensor;
    }

    public Long getLastclock() {
        return lastclock;
    }

    public void setLastclock(Long lastclock) {
        this.lastclock = lastclock;
    }

    public Integer getLastns() {
        return lastns;
    }

    public void setLastns(Integer lastns) {
        this.lastns = lastns;
    }

    public String getLastvalue() {
        return lastvalue;
    }

    public void setLastvalue(String lastvalue) {
        this.lastvalue = lastvalue;
    }

    public String getLogtimefmt() {
        return logtimefmt;
    }

    public void setLogtimefmt(String logtimefmt) {
        this.logtimefmt = logtimefmt;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPrevorgvalue() {
        return prevorgvalue;
    }

    public void setPrevorgvalue(String prevorgvalue) {
        this.prevorgvalue = prevorgvalue;
    }

    public String getPrevvalue() {
        return prevvalue;
    }

    public void setPrevvalue(String prevvalue) {
        this.prevvalue = prevvalue;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public String getSnmp_community() {
        return snmp_community;
    }

    public void setSnmp_community(String snmp_community) {
        this.snmp_community = snmp_community;
    }

    public String getSnmp_oid() {
        return snmp_oid;
    }

    public void setSnmp_oid(String snmp_oid) {
        this.snmp_oid = snmp_oid;
    }

    public String getSnmpv3_authpassphrase() {
        return snmpv3_authpassphrase;
    }

    public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
        this.snmpv3_authpassphrase = snmpv3_authpassphrase;
    }

    public String getSnmpv3_privpassphrase() {
        return snmpv3_privpassphrase;
    }

    public void setSnmpv3_privpassphrase(String snmpv3_privpassphrase) {
        this.snmpv3_privpassphrase = snmpv3_privpassphrase;
    }

    public String getSnmpv3_securitylevel() {
        return snmpv3_securitylevel;
    }

    public void setSnmpv3_securitylevel(String snmpv3_securitylevel) {
        this.snmpv3_securitylevel = snmpv3_securitylevel;
    }

    public String getSnmpv3_securityname() {
        return snmpv3_securityname;
    }

    public void setSnmpv3_securityname(String snmpv3_securityname) {
        this.snmpv3_securityname = snmpv3_securityname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTrapper_hosts() {
        return trapper_hosts;
    }

    public void setTrapper_hosts(String trapper_hosts) {
        this.trapper_hosts = trapper_hosts;
    }

    public Integer getTrends() {
        return trends;
    }

    public void setTrends(Integer trends) {
        this.trends = trends;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets mtime.
     *
     * @return Value of mtime.
     */
    public Long getMtime() {
        return mtime;
    }

    /**
     * Sets new mtime.
     *
     * @param mtime New value of mtime.
     */
    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }

    /**
     * Gets lifetime.
     *
     * @return Value of lifetime.
     */
    public Integer getLifetime() {
        return lifetime;
    }

    /**
     * Sets new lifetime.
     *
     * @param lifetime New value of lifetime.
     */
    public void setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
    }
}
