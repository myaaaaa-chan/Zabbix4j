package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graphprototype.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeGetobjectsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public GraphPrototypeGetobjectsRequest() {
        setMethod("graphprototype.getobjects");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GraphPrototypeObject {
        private String node;
        private List<Integer> nodeids;

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
