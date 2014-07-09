package com.zabbix4j.templatescreen;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenGetRequest() {
        setMethod("templatescreen.get");
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

        private List<Integer> hostids;
        private List<Integer> screenids;
        private List<Integer> screenitemids;
        private List<Integer> templateids;
        private Boolean noInheritance;
        private String selectScreenItems;

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addScreenId(Integer id) {
            screenids = ZbxListUtils.add(screenids, id);
        }

        public void addScreenItemId(Integer id) {
            screenitemids = ZbxListUtils.add(screenitemids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

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
         * Gets templateids.
         *
         * @return Value of templateids.
         */
        public List<Integer> getTemplateids() {
            return templateids;
        }

        /**
         * Sets new templateids.
         *
         * @param templateids New value of templateids.
         */
        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
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
         * Gets noInheritance.
         *
         * @return Value of noInheritance.
         */
        public Boolean getNoInheritance() {
            return noInheritance;
        }

        /**
         * Sets new noInheritance.
         *
         * @param noInheritance New value of noInheritance.
         */
        public void setNoInheritance(Boolean noInheritance) {
            this.noInheritance = noInheritance;
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
