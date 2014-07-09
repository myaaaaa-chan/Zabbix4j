package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public GraphPrototypeDeleteResponse() {
        super();
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private List<Integer> graphids;

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }
    }
}
