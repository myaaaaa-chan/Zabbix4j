package com.zabbix4j.template;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public TemplateGetRequest() {
        setMethod("template.get");
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

        private List<Integer> templateids;
        private List<Integer> groupids;
        private List<Integer> parentTemplateids;
        private List<Integer> hostids;
        private List<Integer> graphids;
        private List<Integer> itemids;
        private List<Integer> triggerids;
        private Boolean with_items;
        private Boolean with_triggers;
        private Boolean with_graphs;
        private Boolean with_httptests;

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addParentTemplateId(Integer id) {
            parentTemplateids = ZbxListUtils.add(parentTemplateids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        /**
         * Gets with_httptests.
         *
         * @return Value of with_httptests.
         */
        public Boolean getWith_httptests() {
            return with_httptests;
        }

        /**
         * Sets new with_httptests.
         *
         * @param with_httptests New value of with_httptests.
         */
        public void setWith_httptests(Boolean with_httptests) {
            this.with_httptests = with_httptests;
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
         * Gets graphids.
         *
         * @return Value of graphids.
         */
        public List<Integer> getGraphids() {
            return graphids;
        }

        /**
         * Sets new graphids.
         *
         * @param graphids New value of graphids.
         */
        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        /**
         * Gets groupids.
         *
         * @return Value of groupids.
         */
        public List<Integer> getGroupids() {
            return groupids;
        }

        /**
         * Sets new groupids.
         *
         * @param groupids New value of groupids.
         */
        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        /**
         * Gets with_items.
         *
         * @return Value of with_items.
         */
        public Boolean getWith_items() {
            return with_items;
        }

        /**
         * Sets new with_items.
         *
         * @param with_items New value of with_items.
         */
        public void setWith_items(Boolean with_items) {
            this.with_items = with_items;
        }

        /**
         * Gets with_graphs.
         *
         * @return Value of with_graphs.
         */
        public Boolean getWith_graphs() {
            return with_graphs;
        }

        /**
         * Sets new with_graphs.
         *
         * @param with_graphs New value of with_graphs.
         */
        public void setWith_graphs(Boolean with_graphs) {
            this.with_graphs = with_graphs;
        }

        /**
         * Gets with_triggers.
         *
         * @return Value of with_triggers.
         */
        public Boolean getWith_triggers() {
            return with_triggers;
        }

        /**
         * Sets new with_triggers.
         *
         * @param with_triggers New value of with_triggers.
         */
        public void setWith_triggers(Boolean with_triggers) {
            this.with_triggers = with_triggers;
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
         * Gets itemids.
         *
         * @return Value of itemids.
         */
        public List<Integer> getItemids() {
            return itemids;
        }

        /**
         * Sets new itemids.
         *
         * @param itemids New value of itemids.
         */
        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        /**
         * Gets parentTemplateids.
         *
         * @return Value of parentTemplateids.
         */
        public List<Integer> getParentTemplateids() {
            return parentTemplateids;
        }

        /**
         * Sets new parentTemplateids.
         *
         * @param parentTemplateids New value of parentTemplateids.
         */
        public void setParentTemplateids(List<Integer> parentTemplateids) {
            this.parentTemplateids = parentTemplateids;
        }

        /**
         * Gets triggerids.
         *
         * @return Value of triggerids.
         */
        public List<Integer> getTriggerids() {
            return triggerids;
        }

        /**
         * Sets new triggerids.
         *
         * @param triggerids New value of triggerids.
         */
        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }
    }
}
