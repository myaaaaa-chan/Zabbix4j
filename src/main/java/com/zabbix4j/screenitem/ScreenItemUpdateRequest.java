package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenItemUpdateRequest extends ZabbixApiRequest {
    private List<ScreenItemObject> params = new ArrayList<ScreenItemObject>();

    public ScreenItemUpdateRequest() {
        setMethod("screenitem.update");
    }

    public void addScreenItem(ScreenItemObject obj) {
        params.add(obj);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<ScreenItemObject> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<ScreenItemObject> params) {
        this.params = params;
    }
}
