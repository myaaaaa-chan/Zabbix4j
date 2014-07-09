package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeDeleteRequest extends ZabbixApiRequest {

    private List<Integer> params;

    public GraphPrototypeDeleteRequest() {
        setMethod("graphprototype.delete");
    }

    public List<Integer> getParams() {
        return params;
    }

    public void setParams(List<Integer> params) {
        this.params = params;
    }

    public void addParam(Integer graphPrototypeId) {
        params = ZbxListUtils.add(params, graphPrototypeId);
    }
}
