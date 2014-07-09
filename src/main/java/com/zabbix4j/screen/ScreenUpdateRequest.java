package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenUpdateRequest() {
        setMethod("screen.update");
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
        private List<Integer> screenitems;

        /**
         * Gets screenitems.
         *
         * @return Value of screenitems.
         */
        public List<Integer> getScreenitems() {
            return screenitems;
        }

        /**
         * Sets new screenitems.
         *
         * @param screenitems New value of screenitems.
         */
        public void setScreenitems(List<Integer> screenitems) {
            this.screenitems = screenitems;
        }
    }
}
