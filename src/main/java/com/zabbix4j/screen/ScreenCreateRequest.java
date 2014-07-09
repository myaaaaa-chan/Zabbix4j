package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.screenitem.ScreenItemObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenCreateRequest() {
        setMethod("screen.create");
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

    public class Params extends ScreenObject {
        private List<ScreenItemObject> screenitems;

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
