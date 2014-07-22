package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response paramter for graphprototype.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeExistsResponse extends ZabbixApiResponse {
    private Boolean result;

    public GraphPrototypeExistsResponse() {
        super();
    }
}
