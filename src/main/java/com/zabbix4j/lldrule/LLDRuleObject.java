package com.zabbix4j.lldrule;

/**
 * The low-level discovery rule object
 *
 * @see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/discoveryrule/object">LLD rule object</a>
 * <p/>
 * Created by Suguru Yajima on 2014/06/05.
 */
public class LLDRuleObject {

    private Integer itemid;
    private Integer delay;
    private Integer hostid;
    private Integer interfaceid;
    private String key_;
    private String name;
    private Integer type;
    private Integer authtype = SSH_AUTH_TYPE.PASSWORD.value;
    /**
     * @see <a href="https://www.zabbix.com/documentation/2.2/manual/appendix/time_period">Setting time periods</a>
     */
    private String delay_flex;
    private String description;
    private String error;
    private String filter;
    private String ipmi_sensor;
    private Integer lifetime;
    private String params;
    private String password;
    private String port;
    private String privatekey;
    private String publickey;
    private String snmp_community;
    private String snmp_oid;
    private String snmpv3_authpassphrase;
    private Integer snmpv3_authprotocol = SNMP_V3_AUTH_PROTOCOL.MD5.value;
    private String snmpv3_contextname;
    private String snmpv3_privpassphrase;
    private Integer snmpv3_privprotocol = SNMP_V3_PRIVACY_PROTOCOL.DES.value;
    private Integer snmpv3_securitylevel;
    private String snmpv3_securityname;
    private Integer state;
    private Integer status;
    private Integer templateid;
    private String trapper_hosts;
    private String username;

    public LLDRuleObject() {

    }

    /**
     * Gets snmpv3_securitylevel.
     *
     * @return Value of snmpv3_securitylevel.
     */
    public Integer getSnmpv3_securitylevel() {
        return snmpv3_securitylevel;
    }

    /**
     * Sets new snmpv3_securitylevel.
     *
     * @param snmpv3_securitylevel New value of snmpv3_securitylevel.
     */
    public void setSnmpv3_securitylevel(Integer snmpv3_securitylevel) {
        this.snmpv3_securitylevel = snmpv3_securitylevel;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Gets snmpv3_contextname.
     *
     * @return Value of snmpv3_contextname.
     */
    public String getSnmpv3_contextname() {
        return snmpv3_contextname;
    }

    /**
     * Sets new snmpv3_contextname.
     *
     * @param snmpv3_contextname New value of snmpv3_contextname.
     */
    public void setSnmpv3_contextname(String snmpv3_contextname) {
        this.snmpv3_contextname = snmpv3_contextname;
    }

    /**
     * Gets @see <a href="https:www.zabbix.comdocumentation2.2manualappendixtime_period">Setting time periods<a>.
     *
     * @return Value of @see <a href="https:www.zabbix.comdocumentation2.2manualappendixtime_period">Setting time periods<a>.
     */
    public String getDelay_flex() {
        return delay_flex;
    }

    /**
     * Sets new @see <a href="https:www.zabbix.comdocumentation2.2manualappendixtime_period">Setting time periods<a>.
     *
     * @param delay_flex New value of @see <a href="https:www.zabbix.comdocumentation2.2manualappendixtime_period">Setting time periods<a>.
     */
    public void setDelay_flex(String delay_flex) {
        this.delay_flex = delay_flex;
    }

    /**
     * Gets password.
     *
     * @return Value of password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets new password.
     *
     * @param password New value of password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

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
     * Gets authtype.
     *
     * @return Value of authtype.
     */
    public Integer getAuthtype() {
        return authtype;
    }

    /**
     * Sets new authtype.
     *
     * @param authtype New value of authtype.
     */
    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    /**
     * Gets snmpv3_authprotocol.
     *
     * @return Value of snmpv3_authprotocol.
     */
    public Integer getSnmpv3_authprotocol() {
        return snmpv3_authprotocol;
    }

    /**
     * Sets new snmpv3_authprotocol.
     *
     * @param snmpv3_authprotocol New value of snmpv3_authprotocol.
     */
    public void setSnmpv3_authprotocol(Integer snmpv3_authprotocol) {
        this.snmpv3_authprotocol = snmpv3_authprotocol;
    }

    /**
     * Gets ipmi_sensor.
     *
     * @return Value of ipmi_sensor.
     */
    public String getIpmi_sensor() {
        return ipmi_sensor;
    }

    /**
     * Sets new ipmi_sensor.
     *
     * @param ipmi_sensor New value of ipmi_sensor.
     */
    public void setIpmi_sensor(String ipmi_sensor) {
        this.ipmi_sensor = ipmi_sensor;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * Gets privatekey.
     *
     * @return Value of privatekey.
     */
    public String getPrivatekey() {
        return privatekey;
    }

    /**
     * Sets new privatekey.
     *
     * @param privatekey New value of privatekey.
     */
    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    /**
     * Gets filter.
     *
     * @return Value of filter.
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets new filter.
     *
     * @param filter New value of filter.
     */
    public void setFilter(String filter) {
        this.filter = filter;
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
     * Gets snmpv3_authpassphrase.
     *
     * @return Value of snmpv3_authpassphrase.
     */
    public String getSnmpv3_authpassphrase() {
        return snmpv3_authpassphrase;
    }

    /**
     * Sets new snmpv3_authpassphrase.
     *
     * @param snmpv3_authpassphrase New value of snmpv3_authpassphrase.
     */
    public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
        this.snmpv3_authpassphrase = snmpv3_authpassphrase;
    }

    /**
     * Gets error.
     *
     * @return Value of error.
     */
    public String getError() {
        return error;
    }

    /**
     * Sets new error.
     *
     * @param error New value of error.
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Gets trapper_hosts.
     *
     * @return Value of trapper_hosts.
     */
    public String getTrapper_hosts() {
        return trapper_hosts;
    }

    /**
     * Sets new trapper_hosts.
     *
     * @param trapper_hosts New value of trapper_hosts.
     */
    public void setTrapper_hosts(String trapper_hosts) {
        this.trapper_hosts = trapper_hosts;
    }

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets new username.
     *
     * @param username New value of username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets snmpv3_privprotocol.
     *
     * @return Value of snmpv3_privprotocol.
     */
    public Integer getSnmpv3_privprotocol() {
        return snmpv3_privprotocol;
    }

    /**
     * Sets new snmpv3_privprotocol.
     *
     * @param snmpv3_privprotocol New value of snmpv3_privprotocol.
     */
    public void setSnmpv3_privprotocol(Integer snmpv3_privprotocol) {
        this.snmpv3_privprotocol = snmpv3_privprotocol;
    }

    /**
     * Gets snmpv3_securityname.
     *
     * @return Value of snmpv3_securityname.
     */
    public String getSnmpv3_securityname() {
        return snmpv3_securityname;
    }

    /**
     * Sets new snmpv3_securityname.
     *
     * @param snmpv3_securityname New value of snmpv3_securityname.
     */
    public void setSnmpv3_securityname(String snmpv3_securityname) {
        this.snmpv3_securityname = snmpv3_securityname;
    }

    /**
     * Gets snmp_community.
     *
     * @return Value of snmp_community.
     */
    public String getSnmp_community() {
        return snmp_community;
    }

    /**
     * Sets new snmp_community.
     *
     * @param snmp_community New value of snmp_community.
     */
    public void setSnmp_community(String snmp_community) {
        this.snmp_community = snmp_community;
    }

    /**
     * Gets snmp_oid.
     *
     * @return Value of snmp_oid.
     */
    public String getSnmp_oid() {
        return snmp_oid;
    }

    /**
     * Sets new snmp_oid.
     *
     * @param snmp_oid New value of snmp_oid.
     */
    public void setSnmp_oid(String snmp_oid) {
        this.snmp_oid = snmp_oid;
    }

    /**
     * Gets snmpv3_privpassphrase.
     *
     * @return Value of snmpv3_privpassphrase.
     */
    public String getSnmpv3_privpassphrase() {
        return snmpv3_privpassphrase;
    }

    /**
     * Sets new snmpv3_privpassphrase.
     *
     * @param snmpv3_privpassphrase New value of snmpv3_privpassphrase.
     */
    public void setSnmpv3_privpassphrase(String snmpv3_privpassphrase) {
        this.snmpv3_privpassphrase = snmpv3_privpassphrase;
    }

    /**
     * Gets state.
     *
     * @return Value of state.
     */
    public Integer getState() {
        return state;
    }

    /**
     * Sets new state.
     *
     * @param state New value of state.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Gets publickey.
     *
     * @return Value of publickey.
     */
    public String getPublickey() {
        return publickey;
    }

    /**
     * Sets new publickey.
     *
     * @param publickey New value of publickey.
     */
    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    /**
     * Gets delay.
     *
     * @return Value of delay.
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * Sets new delay.
     *
     * @param delay New value of delay.
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
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

    /**
     * Gets itemid.
     *
     * @return Value of itemid.
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * Sets new itemid.
     *
     * @param itemid New value of itemid.
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets port.
     *
     * @return Value of port.
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets new port.
     *
     * @param port New value of port.
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets templateid.
     *
     * @return Value of templateid.
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new templateid.
     *
     * @param templateid New value of templateid.
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    /**
     * Gets key_.
     *
     * @return Value of key_.
     */
    public String getKey_() {
        return key_;
    }

    /**
     * Sets new key_.
     *
     * @param key_ New value of key_.
     */
    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public static enum LLD_RULE_TYPE {
        ZABBIX_AGANT(0), SNMP_V1_AGENT(1), ZABBIX_TRAPPER(2), SIMPLE_CHECK(3), SNMP_V2_AGENT(4), ZABBIX_INTERNAL(5), SNMP_V3_AGENT(6), ZABBIX_AGENT_ACTIVE(7), EXTERNAL_CHECK(10), DATABASE_MONITOR(11), IPMI_AGENT(12),
        SSH_AGENT(13), TELNET_AGENT(14), JMX_AGENT(16);
        public int value;

        private LLD_RULE_TYPE(int value) {
            this.value = value;
        }
    }

    public enum SSH_AUTH_TYPE {
        PASSWORD(0), PUBLIC_KEY(1);
        public int value;

        private SSH_AUTH_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_AUTH_PROTOCOL {
        MD5(0), SHA(1);
        public int value;

        private SNMP_V3_AUTH_PROTOCOL(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_PRIVACY_PROTOCOL {
        DES(0), AES(1);
        public int value;

        private SNMP_V3_PRIVACY_PROTOCOL(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_SECURITY_LEVEL {
        NO_AUTH_NO_PRIV(0), AUTH_NO_PRIV(1), AUTH_PRIV(2);
        public int value;

        private SNMP_V3_SECURITY_LEVEL(int value) {
            this.value = value;
        }
    }

    public static enum LLD_STATE {
        NORMAL(0), NOT_SUPPORT(1);
        public int value;

        private LLD_STATE(int value) {
            this.value = value;
        }
    }

    public static enum LLD_STATUS {
        ENABLED_LLD_RULE(0), DISABLED_LLD_RULE(1);
        public int value;

        private LLD_STATUS(int value) {
            this.value = value;
        }
    }
}
