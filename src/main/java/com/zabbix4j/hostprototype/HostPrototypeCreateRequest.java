/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
public class HostPrototypeCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostPrototypeCreateRequest() {
        setMethod("hostprototype.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends HostPrototypeObject {

        private List<GroupLinkObject> groupLinks;
        private Integer ruleid;
        private List<GroupPrototypeObject> groupPrototypes;
        private HostPrototypeInventoryObject inventory;
        private List<Integer> templates;

        public void  addGroupPrototype(GroupPrototypeObject obj) {
            groupPrototypes = ZbxListUtils.add(groupPrototypes, obj);

        }

        public void addGroupLink(GroupLinkObject obj) {
            groupLinks = ZbxListUtils.add(groupLinks, obj);
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
         * Gets ruleid.
         *
         * @return Value of ruleid.
         */
        public Integer getRuleid() {
            return ruleid;
        }

        /**
         * Sets new ruleid.
         *
         * @param ruleid New value of ruleid.
         */
        public void setRuleid(Integer ruleid) {
            this.ruleid = ruleid;
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
