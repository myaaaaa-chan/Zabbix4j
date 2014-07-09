package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.screenitem.ScreenItemObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public ScreenGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ScreenObject {
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
