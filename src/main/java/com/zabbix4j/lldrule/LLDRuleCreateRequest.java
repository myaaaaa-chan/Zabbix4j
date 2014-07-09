package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiRequest;

/**
 * Created by Suguru Yajima on 2014/06/06.
 */
public class LLDRuleCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public LLDRuleCreateRequest() {
        setMethod("discoveryrule.create");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends LLDRuleObject {

    }
}
