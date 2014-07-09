package com.zabbix4j.templatescreenitem;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenItemGetResponse extends ZabbixApiResponse {
    private List<TemplateScreenItemObject> result;

    public TemplateScreenItemGetResponse() {
        super();
    }


    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<TemplateScreenItemObject> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<TemplateScreenItemObject> result) {
        this.result = result;
    }
}
