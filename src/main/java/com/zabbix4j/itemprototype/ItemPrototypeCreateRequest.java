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

package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemPrototypeCreateRequest() {
        setMethod("itemprototype.create");
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

    public class Params extends ItemPrototypeObject {

        private Integer ruleid;
        private List<Integer> applications;

        public void addApplication(Integer id) {
            applications = ZbxListUtils.add(applications, id);
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
         * Gets applications.
         *
         * @return Value of applications.
         */
        public List<Integer> getApplications() {
            return applications;
        }

        /**
         * Sets new applications.
         *
         * @param applications New value of applications.
         */
        public void setApplications(List<Integer> applications) {
            this.applications = applications;
        }
    }
}
