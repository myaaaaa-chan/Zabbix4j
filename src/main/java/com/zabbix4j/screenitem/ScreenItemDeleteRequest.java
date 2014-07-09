package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenItemDeleteRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();


    public ScreenItemDeleteRequest() {
        setMethod("screenitem.delete");
    }

    public void addScreenItemId(Integer id) {
        params.add(id);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<Integer> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<Integer> params) {
        this.params = params;
    }
}
