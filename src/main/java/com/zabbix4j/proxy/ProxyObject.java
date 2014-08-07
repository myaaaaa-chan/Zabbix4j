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

package com.zabbix4j.proxy;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class ProxyObject {

    private Integer proxyid;
    private String host;
    private Integer status;
    private Long lastaccess;

    public Date getLastaccessDate() {
        if (lastaccess != null && lastaccess != 0) {
            return new Date(lastaccess);
        }

        return null;
    }

    /**
     * Gets host.
     *
     * @return Value of host.
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets new host.
     *
     * @param host New value of host.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Gets lastaccess.
     *
     * @return Value of lastaccess.
     */
    public Long getLastaccess() {
        return lastaccess;
    }

    /**
     * Sets new lastaccess.
     *
     * @param lastaccess New value of lastaccess.
     */
    public void setLastaccess(Long lastaccess) {
        this.lastaccess = lastaccess;
    }

    /**
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets proxyid.
     *
     * @return Value of proxyid.
     */
    public Integer getProxyid() {
        return proxyid;
    }

    /**
     * Sets new proxyid.
     *
     * @param proxyid New value of proxyid.
     */
    public void setProxyid(Integer proxyid) {
        this.proxyid = proxyid;
    }

    public static enum STATUS {
        ACTIVE_PROXY(5), PASSIVE_PROXY(6);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }
}
