package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for host.massadd
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostMassaddRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostMassaddRequest() {
        setMethod("host.massadd");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<HostObject> hosts;
        private List<HostgroupObject> groups;
        private List<HostInterfaceObject> interfaces;
        private List<Macro> macros;
        private List<TemplateObject> templates;

        public Params() {
        }

        public void addHostId(Integer id) {
            HostObject obj = new HostObject();
            obj.setHostid(id);
            hosts = ZbxListUtils.add(hosts, obj);
        }

        public void addHostGroupId(Integer id) {
            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(id);
            groups = ZbxListUtils.add(groups, obj);
        }

        public void addHostInterface(HostInterfaceObject obj) {
            interfaces = ZbxListUtils.add(interfaces, obj);
        }

        public void addMacro(Macro obj) {
            macros = ZbxListUtils.add(macros, obj);
        }

        public void addTemplate(TemplateObject obj) {
            templates = ZbxListUtils.add(templates, obj);
        }
    }
}
