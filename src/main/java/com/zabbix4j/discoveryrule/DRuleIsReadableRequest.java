package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request parameter for drule.isreadable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DRuleIsReadableRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public DRuleIsReadableRequest() {
        setMethod("drule.isreadable");
    }

    public void addDruleId(Integer id) {
        params.add(id);
    }
}
