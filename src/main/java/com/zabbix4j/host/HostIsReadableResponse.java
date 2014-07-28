package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response paramter for host.isreadable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostIsReadableResponse extends ZabbixApiResponse {
    private Boolean result;

    public HostIsReadableResponse() {
        super();
    }
}
