package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for host.massadd
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostMassaddResponse extends ZabbixApiResponse {
    private Result result;

    public HostMassaddResponse() {
        super();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result {
        private List<Integer> hostids;
    }
}
