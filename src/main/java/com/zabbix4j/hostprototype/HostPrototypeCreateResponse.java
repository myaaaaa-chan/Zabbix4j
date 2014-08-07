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

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/05.
 */
public class HostPrototypeCreateResponse extends ZabbixApiResponse {

    /**
     * Result of hostprototype.create method
     */
    private Result result;

    public HostPrototypeCreateResponse() {
        super();
    }

    /**
     * Gets Result of hostprototype.create method.
     *
     * @return Value of Result of hostprototype.create method.
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets new Result of hostprototype.create method.
     *
     * @param result New value of Result of hostprototype.create method.
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        /**
         * ID of created host prototype.
         */
        private List<Integer> hostids;

        /**
         * Gets ID of created host prototype..
         *
         * @return Value of ID of created host prototype..
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new ID of created host prototype..
         *
         * @param hostids New value of ID of created host prototype..
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }
    }
}
