package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ImageUpdateResponse extends ZabbixApiResponse {

    private Result result;

    public ImageUpdateResponse() {
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
        private List<Integer> imageids;

        /**
         * Gets imageids.
         *
         * @return Value of imageids.
         */
        public List<Integer> getImageids() {
            return imageids;
        }

        /**
         * Sets new imageids.
         *
         * @param imageids New value of imageids.
         */
        public void setImageids(List<Integer> imageids) {
            this.imageids = imageids;
        }
    }
}
