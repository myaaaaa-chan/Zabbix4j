package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScriptUpdateRequest extends ZabbixApiRequest {
    private List<ScriptObject> params = new ArrayList<ScriptObject>();

    public ScriptUpdateRequest() {
        setMethod("script.update");
    }

    public void addScriptObjrct(ScriptObject obj) {
        params.add(obj);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<ScriptObject> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<ScriptObject> params) {
        this.params = params;
    }
}
