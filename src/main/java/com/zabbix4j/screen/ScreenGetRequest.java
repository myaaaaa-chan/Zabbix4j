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
