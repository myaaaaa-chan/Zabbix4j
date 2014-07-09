package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class IconMapDeleteResponse extends ZabbixApiResponse {

    private Result result;

    public IconMapDeleteResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {

        private List<Integer> iconmapids;

        /**
         * Gets iconmapids.
         *
         * @return Value of iconmapids.
         */
        public List<Integer> getIconmapids() {
            return iconmapids;
        }

        /**
         * Sets new iconmapids.
         *
         * @param iconmapids New value of iconmapids.
         */
        public void setIconmapids(List<Integer> iconmapids) {
            this.iconmapids = iconmapids;
        }
    }
}
