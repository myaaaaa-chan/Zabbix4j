package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request parameter for host.isreadable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostIsReadableRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public HostIsReadableRequest() {
        setMethod("host.isreadable");
    }

    public void addHostId(Integer id) {
        params.add(id);
    }
}
