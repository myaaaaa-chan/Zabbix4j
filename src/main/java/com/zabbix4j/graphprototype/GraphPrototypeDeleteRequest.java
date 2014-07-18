package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graphprototype.delete
 * @author Suguru Yajima on 2014/06/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeDeleteRequest extends ZabbixApiRequest {

    private List<Integer> params;

    public GraphPrototypeDeleteRequest() {
        setMethod("graphprototype.delete");
    }

    public void addParam(Integer graphPrototypeId) {
        params = ZbxListUtils.add(params, graphPrototypeId);
    }
}
