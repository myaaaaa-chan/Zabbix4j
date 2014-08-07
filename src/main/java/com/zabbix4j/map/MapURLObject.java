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

/**
 * @author Suguru Yajima
 */
public class MapURLObject {

    private Integer sysmapurlid;
    private String name;
    private String url;
    private Integer elementtype;
    private Integer sysmapid;

    /**
     * Gets sysmapurlid.
     *
     * @return Value of sysmapurlid.
     */
    public Integer getSysmapurlid() {
        return sysmapurlid;
    }

    /**
     * Sets new sysmapurlid.
     *
     * @param sysmapurlid New value of sysmapurlid.
     */
    public void setSysmapurlid(Integer sysmapurlid) {
        this.sysmapurlid = sysmapurlid;
    }

    /**
     * Gets elementtype.
     *
     * @return Value of elementtype.
     */
    public Integer getElementtype() {
        return elementtype;
    }

    /**
     * Sets new elementtype.
     *
     * @param elementtype New value of elementtype.
     */
    public void setElementtype(Integer elementtype) {
        this.elementtype = elementtype;
    }

    /**
     * Gets sysmapid.
     *
     * @return Value of sysmapid.
     */
    public Integer getSysmapid() {
        return sysmapid;
    }

    /**
     * Sets new sysmapid.
     *
     * @param sysmapid New value of sysmapid.
     */
    public void setSysmapid(Integer sysmapid) {
        this.sysmapid = sysmapid;
    }

    /**
     * Gets url.
     *
     * @return Value of url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets new url.
     *
     * @param url New value of url.
     */
    public void setUrl(String url) {
        this.url = url;
    }

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
}
