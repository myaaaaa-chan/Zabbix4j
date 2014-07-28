package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for host.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostGetobjectsRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostGetobjectsRequest() {
        setMethod("host.getobjects");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends HostObject {
        private String node;
        private List<Integer> nodeids;

        public void addNodeId(Integer id) {
            nodeids = ZbxListUtils.add(nodeids, id);
        }
    }
}
