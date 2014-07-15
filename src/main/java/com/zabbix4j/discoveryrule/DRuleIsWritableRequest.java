package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request paramter for drule.iswritable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DRuleIsWritableRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public DRuleIsWritableRequest() {
        setMethod("drule.iswritable");
    }

    public void addDRuleId(Integer id) {
        params.add(id);
    }
}
