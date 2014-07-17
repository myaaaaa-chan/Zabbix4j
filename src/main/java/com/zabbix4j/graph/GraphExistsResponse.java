package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response paramter for graph.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphExistsResponse extends ZabbixApiResponse {
    private Boolean result;

    public GraphExistsResponse() {
        super();
    }
}
