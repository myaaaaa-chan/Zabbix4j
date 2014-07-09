package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiRequest;

/**
 * @author Suguru Yajima
 */
public class LLDRuleUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public LLDRuleUpdateRequest() {
        setMethod("discoveryrule.update");
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
