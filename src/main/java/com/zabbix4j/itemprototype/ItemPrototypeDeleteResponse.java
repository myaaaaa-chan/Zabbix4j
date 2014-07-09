package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeDeleteResponse extends ZabbixApiResponse {

    private Result result;

    public ItemPrototypeDeleteResponse() {
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
        private List<Integer> prototypeids;

        /**
         * Gets prototypeids.
         *
         * @return Value of prototypeids.
         */
        public List<Integer> getPrototypeids() {
            return prototypeids;
        }

        /**
         * Sets new prototypeids.
         *
         * @param prototypeids New value of prototypeids.
         */
        public void setPrototypeids(List<Integer> prototypeids) {
            this.prototypeids = prototypeids;
        }
    }
}
