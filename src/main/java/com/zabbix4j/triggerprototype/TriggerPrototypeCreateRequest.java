package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeCreateRequest extends ZabbixApiRequest {

    private List<TriggerPrototypeObject> params = new ArrayList<TriggerPrototypeObject>();

    public TriggerPrototypeCreateRequest() {
        setMethod("triggerprototype.create");
    }

    public void addTriggerPrototypeObject(TriggerPrototypeObject obj) {
        this.params.add(obj);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<TriggerPrototypeObject> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<TriggerPrototypeObject> params) {
        this.params = params;
    }
}
