package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response parameter for drule.exists
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DRuleExistResponse extends ZabbixApiResponse {
    private Boolean result;

    public DRuleExistResponse() {
        super();
    }
}
