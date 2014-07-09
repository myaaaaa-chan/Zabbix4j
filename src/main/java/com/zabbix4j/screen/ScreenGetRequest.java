package com.zabbix4j.screen;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScreenGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenGetRequest() {
        setMethod("screen.get");
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
        private String selectScreenItems;

        public void addScreenId(Integer id) {
            screenids = ZbxListUtils.add(screenids, id);
        }

        public void addScreenItemId(Integer id) {
            screenitemids = ZbxListUtils.add(screenitemids, id);
        }

        /**
         * Gets selectScreenItems.
         *
         * @return Value of selectScreenItems.
         */
        public String getSelectScreenItems() {
            return selectScreenItems;
        }

        /**
         * Sets new selectScreenItems.
         *
         * @param selectScreenItems New value of selectScreenItems.
         */
        public void setSelectScreenItems(String selectScreenItems) {
            this.selectScreenItems = selectScreenItems;
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
    }
}
