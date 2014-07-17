package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graph.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphGetObjectsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public GraphGetObjectsRequest() {
        setMethod("graph.getobjects");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GraphObject {
        private String node;
        private List<Integer> nodeids;

        public Params() {
            super();
        }

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
