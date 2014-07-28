package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for host.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostGetobjectsResponse extends ZabbixApiResponse {
    private List<HostObject> result;

    public HostGetobjectsResponse() {
        super();
    }
}
