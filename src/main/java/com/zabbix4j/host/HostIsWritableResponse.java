package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response paramter for host.iswritable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostIsWritableResponse extends ZabbixApiResponse {
    private Boolean result;

    public HostIsWritableResponse() {
        super();
    }
}
