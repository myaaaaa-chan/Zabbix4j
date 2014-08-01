package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paraner for hostgroup.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupGetobjectsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostgroupGetobjectsRequest() {
        setMethod("hostgroup.getobjects");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<Integer> groupid;
        private List<String> name;
        private String node;
        private List<Integer> nodeids;

        public void addGroupId(Integer id) {
            groupid = ZbxListUtils.add(groupid, id);
        }

        public void addName(String n) {
            name = ZbxListUtils.add(name, n);
        }

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
