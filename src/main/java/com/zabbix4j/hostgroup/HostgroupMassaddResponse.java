package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response pramter for hostgroup.massadd
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupMassaddResponse extends ZabbixApiResponse {
    private Result result;

    public HostgroupMassaddResponse() {
        super();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result {
        private List<Integer> groupids;

        public Result() {
            super();
        }
    }
}
