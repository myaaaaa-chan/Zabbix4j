package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;

import java.util.List;

/**
 * Request paramter for action.exists
 *
 * @author yajima 2014
 */
@Data
public class ActionExistsRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ActionExistsRequest() {
        setMethod("action.exists");
    }

    @Data
    public class Params {
        private List<Integer> actionid;
        private List<String> name;
        private String node;
        private List<Integer> nodeids;

        public Params() {
            super();
        }

        public void addActionId(Integer id) {
            actionid = ZbxListUtils.add(actionid, id);
        }

        public void addActionName(String n) {
            name = ZbxListUtils.add(this.name, n);
        }

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
