package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.screenitem.ScreenItemObject;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenCreateRequest() {
        setMethod("templatescreen.create");
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

    public class Params extends TemplateScreenObject {

        private List<ScreenItemObject> screenitems;

        public void addScreenItem(ScreenItemObject obj) {
            screenitems = ZbxListUtils.add(screenitems, obj);
        }

        /**
         * Gets screenitems.
         *
         * @return Value of screenitems.
         */
        public List<ScreenItemObject> getScreenitems() {
            return screenitems;
        }

        /**
         * Sets new screenitems.
         *
         * @param screenitems New value of screenitems.
         */
        public void setScreenitems(List<ScreenItemObject> screenitems) {
            this.screenitems = screenitems;
        }
    }
}
