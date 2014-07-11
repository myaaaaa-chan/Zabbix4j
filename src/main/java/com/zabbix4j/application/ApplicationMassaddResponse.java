package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for application.massadd
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApplicationMassaddResponse extends ZabbixApiResponse {
    private Result result;

    public ApplicationMassaddResponse() {
        super();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result {
        private List<Integer> applicationids;
    }
}
