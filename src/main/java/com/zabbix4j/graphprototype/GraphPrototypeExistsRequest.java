package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graphprototype.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeExistsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public GraphPrototypeExistsRequest() {
        setMethod("graphprototype.exists");
    }

    public class Params {
        private List<String> host;
        private List<Integer> hostids;
        private List<String> name;
        private List<Integer> nodeids;
        private String node;

        public Params() {
            super();
        }

        public void addHost(String h) {
            host = ZbxListUtils.add(host, h);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addName(String n) {
            name = ZbxListUtils.add(name, n);
        }

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
