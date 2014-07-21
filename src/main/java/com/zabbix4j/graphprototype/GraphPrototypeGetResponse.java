package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.lldrule.LLDRuleObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for graphprototype.get
 *
 * @author Suguru Yajima on 2014/06/03.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public GraphPrototypeGetResponse() {
        super();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result extends GraphPrototypeObject {
        private List<ItemObject> items;
        private List<GraphObject> gitems;
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        private LLDRuleObject discoveryRule;
    }
}
