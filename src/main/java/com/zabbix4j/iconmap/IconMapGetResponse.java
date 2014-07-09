package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class IconMapGetResponse extends ZabbixApiResponse {

    public IconMapGetResponse() {
        super();
    }

    private List<Result> result;

    public class Result extends IconMapObject {

        private List<IconMappingObject> mappings;

        /**
         * Gets mappings.
         *
         * @return Value of mappings.
         */
        public List<IconMappingObject> getMappings() {
            return mappings;
        }

        /**
         * Sets new mappings.
         *
         * @param mappings New value of mappings.
         */
        public void setMappings(List<IconMappingObject> mappings) {
            this.mappings = mappings;
        }
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
}
