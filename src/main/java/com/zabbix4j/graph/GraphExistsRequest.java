package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graph.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphExistsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public GraphExistsRequest() {
        setMethod("graph.exists");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<String> host;
        private List<Integer> hostids;
        private List<String> name;
        private String node;
        private List<Integer> nodeids;

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
