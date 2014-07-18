package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for graphprototype.create
 *
 * @author Suguru Yajima on 2014/06/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeCreateResponse extends ZabbixApiResponse {

    private Result result;

    public GraphPrototypeCreateResponse() {
        super();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result {
        private List<Integer> graphids;

        public Result() {
            super();
        }
    }
}
