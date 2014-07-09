package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public GraphPrototypeCreateRequest() {
        setMethod("graphprototype.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GraphPrototypeObject {
        private List<GraphItem> gitems;

        public Params() {
            super();
        }

        public List<GraphItem> getGitems() {
            return gitems;
        }

        public void setGitems(List<GraphItem> gitems) {
            this.gitems = gitems;
        }

        public void addGraphItem(GraphItem gitem) {
            gitems = ZbxListUtils.add(gitems, gitem);

        }
    }
}
