package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for drule.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DRuleExistRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public DRuleExistRequest() {
        setMethod("drule.exists");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<Integer> druleids;
        private List<String> name;
        private String node;
        private List<Integer> nodeids;

        public Params() {
            super();
        }

        public void addDruleId(Integer id) {
            druleids = ZbxListUtils.add(druleids, id);
        }

        public void addName(String n) {
            name = ZbxListUtils.add(name, n);
        }

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
