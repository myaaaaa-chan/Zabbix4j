package com.zabbix4j.lldrule;

import com.zabbix4j.host.HostObject;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * The low-level discovery rule object
 *
 * @see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/discoveryrule/object">LLD rule object</a>
 * <p/>
 * Created by Suguru Yajima on 2014/06/05.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LLDRuleObject {

    private Integer itemid;
    private Integer delay;
    private List<HostObject> hosts;
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
        super();
    }

    public void addHost(HostObject obj) {
        hosts = ZbxListUtils.add(hosts, obj);
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
