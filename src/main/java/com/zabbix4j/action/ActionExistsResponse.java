package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;

/**
 * Response paramter for action.exists
 *
 * @author yajima 2014
 */
@Data
public class ActionExistsResponse extends ZabbixApiResponse {
    private Boolean result;

    public ActionExistsResponse() {
        super();
    }
}
