package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class IconMapCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public IconMapCreateRequest() {
        setMethod("iconmap.create");
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

    public class Params extends IconMapObject {

        private List<IconMappingObject> mappings;

        public void addMapping(IconMappingObject obj) {
            mappings = ZbxListUtils.add(mappings, obj);
        }

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
}
