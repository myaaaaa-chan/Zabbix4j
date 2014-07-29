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
 * Request paramter for host.massupdate
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostMassupdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostMassupdateRequest() {
        setMethod("host.massupdate");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends HostObject {
        private List<HostObject> hosts;
        private List<HostgroupObject> groups;
        private List<HostInterfaceObject> interfaces;
        private HostInventoryObject inventory;
        private Integer inventory_mode;
        private List<Macro> macros;
        private List<TemplateObject> templates;
        private List<TemplateObject> templates_clear;

        public void addHostId(Integer id) {
            HostObject obj = new HostObject();
            obj.setHostid(id);
            hosts = ZbxListUtils.add(hosts, obj);
        }

        public void addHostGroup(Integer id) {
            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(id);
            groups = ZbxListUtils.add(groups, obj);
        }

        public void addHostInterface(HostInterfaceObject obj) {
            interfaces = ZbxListUtils.add(interfaces, obj);
        }

        public void addMacro(Macro m) {
            macros = ZbxListUtils.add(macros, m);
        }

        public void addTemplate(Integer id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templates = ZbxListUtils.add(templates, obj);
        }

        public void addClearTemplate(Integer id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templates_clear = ZbxListUtils.add(templates_clear, obj);
        }
    }
}
