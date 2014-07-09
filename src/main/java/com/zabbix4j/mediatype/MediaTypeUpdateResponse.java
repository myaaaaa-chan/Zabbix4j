package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MediaTypeUpdateResponse extends ZabbixApiResponse {

    private Result result;

    public MediaTypeUpdateResponse() {
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

        private List<Integer> mediatypeids;

        /**
         * Gets mediatypeids.
         *
         * @return Value of mediatypeids.
         */
        public List<Integer> getMediatypeids() {
            return mediatypeids;
        }

        /**
         * Sets new mediatypeids.
         *
         * @param mediatypeids New value of mediatypeids.
         */
        public void setMediatypeids(List<Integer> mediatypeids) {
            this.mediatypeids = mediatypeids;
        }
    }
}
