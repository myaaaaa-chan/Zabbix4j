package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MediaTypeUpdateRequest extends ZabbixApiRequest {

    private List<MediaTypeObject> params = new ArrayList<MediaTypeObject>();

    public MediaTypeUpdateRequest() {
        setMethod("mediatype.update");
    }

    public void addMediaTypeObject(MediaTypeObject obj) {
        params.add(obj);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<MediaTypeObject> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<MediaTypeObject> params) {
        this.params = params;
    }
}
