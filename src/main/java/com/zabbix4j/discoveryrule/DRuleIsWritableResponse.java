package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response paramter for drule.iswritable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DRuleIsWritableResponse extends ZabbixApiResponse {
    private Boolean result;
}
