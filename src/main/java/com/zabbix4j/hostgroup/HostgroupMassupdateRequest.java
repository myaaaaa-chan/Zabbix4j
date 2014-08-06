package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for hostgroup.massupdate
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupMassupdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostgroupMassupdateRequest() {
        setMethod("hostgroup.massupdate");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        private List<TemplateObject> templates;

        public Params() {
            super();
        }

        public void addHostGroupId(Integer id) {
            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(id);
            groups = ZbxListUtils.add(groups, obj);
        }

        public void addHostId(Integer id) {
            HostObject obj = new HostObject();
            obj.setHostid(id);
            hosts = ZbxListUtils.add(hosts, obj);
        }

        public void addTemplateId(Integer id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templates = ZbxListUtils.add(templates, obj);
        }
    }
}
