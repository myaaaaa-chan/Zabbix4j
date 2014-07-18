package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request paramter for graphprototype.create
 *
 * @author Suguru Yajima on 2014/06/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeCreateRequest extends ZabbixApiRequest {

    private List<Params> params = new ArrayList<Params>();

    public GraphPrototypeCreateRequest() {
        setMethod("graphprototype.create");
    }

    public Params createParam() {
        Params param = new Params();
        params.add(param);
        return param;
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GraphPrototypeObject {
        private List<GraphItem> gitems;

        public Params() {
            super();
        }

        public void addGraphItem(GraphItem gitem) {
            gitems = ZbxListUtils.add(gitems, gitem);

        }
    }
}
