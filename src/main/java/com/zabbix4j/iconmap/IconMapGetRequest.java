package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class IconMapGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public IconMapGetRequest() {
        setMethod("iconmap.get");
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

    public class Params {
        private List<Integer> iconmapids;
        private List<Integer> sysmapids;
        private String selectMappings;

        public void addIconMapId(Integer id) {
            iconmapids = ZbxListUtils.add(iconmapids, id);
        }

        public void addSystemId(Integer id) {
            sysmapids = ZbxListUtils.add(sysmapids, id);
        }

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

        /**
         * Gets sysmapids.
         *
         * @return Value of sysmapids.
         */
        public List<Integer> getSysmapids() {
            return sysmapids;
        }

        /**
         * Sets new sysmapids.
         *
         * @param sysmapids New value of sysmapids.
         */
        public void setSysmapids(List<Integer> sysmapids) {
            this.sysmapids = sysmapids;
        }

        /**
         * Gets selectMappings.
         *
         * @return Value of selectMappings.
         */
        public String getSelectMappings() {
            return selectMappings;
        }

        /**
         * Sets new selectMappings.
         *
         * @param selectMappings New value of selectMappings.
         */
        public void setSelectMappings(String selectMappings) {
            this.selectMappings = selectMappings;
        }
    }
}
