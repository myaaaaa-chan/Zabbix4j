package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for hostgroup.massremove
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupMassremoveRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostgroupMassremoveRequest() {
        setMethod("hostgroup.massremove");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> templateids;

        public Params() {
            super();
        }

        public void addHostGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }
    }
}
