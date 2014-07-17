package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for graph.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphGetObjectsResponse extends ZabbixApiResponse {
    private List<GraphObject> result;

    public GraphGetObjectsResponse() {
        super();
    }
}
