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

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
public class HostPrototypeObject {

    private Integer hostid;
    private String host;
    private String name;
    private Integer status;
    private Integer templateid;

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets hostid.
     *
     * @return Value of hostid.
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * Sets new hostid.
     *
     * @param hostid New value of hostid.
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    /**
     * Gets templateid.
     *
     * @return Value of templateid.
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new templateid.
     *
     * @param templateid New value of templateid.
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }
}
