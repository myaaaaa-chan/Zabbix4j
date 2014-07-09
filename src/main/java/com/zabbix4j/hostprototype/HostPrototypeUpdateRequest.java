package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostPrototypeUpdateRequest() {
        setMethod("hostprototype.update");
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

    public class Params extends HostPrototypeObject {

        private List<GroupLinkObject> groupLinks;
        private List<GroupPrototypeObject> groupPrototypes;
        private HostPrototypeInventoryObject inventory;
        private List<Integer> templates;

        public void addGroupLink(GroupLinkObject obj) {
            groupLinks = ZbxListUtils.add(groupLinks, obj);
        }

        public void addGroupPrototype(GroupPrototypeObject obj) {
            groupPrototypes = ZbxListUtils.add(groupPrototypes, obj);
        }

        public void addTemplate(Integer id) {
            templates = ZbxListUtils.add(templates, id);
        }

        /**
         * Gets inventory.
         *
         * @return Value of inventory.
         */
        public HostPrototypeInventoryObject getInventory() {
            return inventory;
        }

        /**
         * Sets new inventory.
         *
         * @param inventory New value of inventory.
         */
        public void setInventory(HostPrototypeInventoryObject inventory) {
            this.inventory = inventory;
        }

        /**
         * Gets groupLinks.
         *
         * @return Value of groupLinks.
         */
        public List<GroupLinkObject> getGroupLinks() {
            return groupLinks;
        }

        /**
         * Sets new groupLinks.
         *
         * @param groupLinks New value of groupLinks.
         */
        public void setGroupLinks(List<GroupLinkObject> groupLinks) {
            this.groupLinks = groupLinks;
        }

        /**
         * Gets groupPrototypes.
         *
         * @return Value of groupPrototypes.
         */
        public List<GroupPrototypeObject> getGroupPrototypes() {
            return groupPrototypes;
        }

        /**
         * Sets new groupPrototypes.
         *
         * @param groupPrototypes New value of groupPrototypes.
         */
        public void setGroupPrototypes(List<GroupPrototypeObject> groupPrototypes) {
            this.groupPrototypes = groupPrototypes;
        }

        /**
         * Gets templates.
         *
         * @return Value of templates.
         */
        public List<Integer> getTemplates() {
            return templates;
        }

        /**
         * Sets new templates.
         *
         * @param templates New value of templates.
         */
        public void setTemplates(List<Integer> templates) {
            this.templates = templates;
        }
    }
}
