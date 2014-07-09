package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenDeleteRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public TemplateScreenDeleteRequest() {
        setMethod("templatescreen.delete");
    }

    public void addTemplateScreenId(Integer id) {
        params.add(id);
    }
}
