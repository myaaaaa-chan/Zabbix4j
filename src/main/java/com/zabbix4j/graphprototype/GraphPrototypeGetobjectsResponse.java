package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for graphprototype.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeGetobjectsResponse extends ZabbixApiResponse {
    private List<GraphPrototypeObject> result;

    public GraphPrototypeGetobjectsResponse() {
        super();
    }
}
