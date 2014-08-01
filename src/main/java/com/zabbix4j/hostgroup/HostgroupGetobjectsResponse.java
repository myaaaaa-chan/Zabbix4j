package com.zabbix4j.hostgroup;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for hostgroup.getobjects
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostgroupGetobjectsResponse extends ZabbixApiResponse {
    private List<HostgroupObject> result;

    public HostgroupGetobjectsResponse() {
        super();
    }
}
