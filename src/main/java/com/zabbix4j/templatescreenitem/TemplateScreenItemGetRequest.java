package com.zabbix4j.templatescreenitem;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenItemGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenItemGetRequest() {
        setMethod("templatescreenitem.get");
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

    public class Params extends GetRequestCommonParams {

        private List<Integer> screenids;
        private List<Integer> screenitemids;
        private List<Integer> hostids;

        /**
         * Gets hostids.
         *
         * @return Value of hostids.
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new hostids.
         *
         * @param hostids New value of hostids.
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        /**
         * Gets screenids.
         *
         * @return Value of screenids.
         */
        public List<Integer> getScreenids() {
            return screenids;
        }

        /**
         * Sets new screenids.
         *
         * @param screenids New value of screenids.
         */
        public void setScreenids(List<Integer> screenids) {
            this.screenids = screenids;
        }

        /**
         * Gets screenitemids.
         *
         * @return Value of screenitemids.
         */
        public List<Integer> getScreenitemids() {
            return screenitemids;
        }

        /**
         * Sets new screenitemids.
         *
         * @param screenitemids New value of screenitemids.
         */
        public void setScreenitemids(List<Integer> screenitemids) {
            this.screenitemids = screenitemids;
        }
    }
}
