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

package com.zabbix4j.map;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MapGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MapGetRequest() {
        setMethod("map.get");
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

        private List<Integer> sysmapids;
        private Boolean expandUrls;
        private String selectIconMap;
        private String selectLinks;
        private String selectSelements;
        private String selectUrls;

        public void addSysMapId(Integer id) {
            sysmapids = ZbxListUtils.add(sysmapids, id);
        }

        /**
         * Gets expandUrls.
         *
         * @return Value of expandUrls.
         */
        public Boolean getExpandUrls() {
            return expandUrls;
        }

        /**
         * Sets new expandUrls.
         *
         * @param expandUrls New value of expandUrls.
         */
        public void setExpandUrls(Boolean expandUrls) {
            this.expandUrls = expandUrls;
        }

        /**
         * Gets selectIconMap.
         *
         * @return Value of selectIconMap.
         */
        public String getSelectIconMap() {
            return selectIconMap;
        }

        /**
         * Sets new selectIconMap.
         *
         * @param selectIconMap New value of selectIconMap.
         */
        public void setSelectIconMap(String selectIconMap) {
            this.selectIconMap = selectIconMap;
        }

        /**
         * Gets selectLinks.
         *
         * @return Value of selectLinks.
         */
        public String getSelectLinks() {
            return selectLinks;
        }

        /**
         * Sets new selectLinks.
         *
         * @param selectLinks New value of selectLinks.
         */
        public void setSelectLinks(String selectLinks) {
            this.selectLinks = selectLinks;
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
         * Gets selectUrls.
         *
         * @return Value of selectUrls.
         */
        public String getSelectUrls() {
            return selectUrls;
        }

        /**
         * Sets new selectUrls.
         *
         * @param selectUrls New value of selectUrls.
         */
        public void setSelectUrls(String selectUrls) {
            this.selectUrls = selectUrls;
        }

        /**
         * Gets selectSelements.
         *
         * @return Value of selectSelements.
         */
        public String getSelectSelements() {
            return selectSelements;
        }

        /**
         * Sets new selectSelements.
         *
         * @param selectSelements New value of selectSelements.
         */
        public void setSelectSelements(String selectSelements) {
            this.selectSelements = selectSelements;
        }
    }
}
