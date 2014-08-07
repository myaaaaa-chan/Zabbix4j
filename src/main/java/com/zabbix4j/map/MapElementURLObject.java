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
public class MapElementURLObject {

    private Integer sysmapelementurlid;
    private String name;
    private String url;
    private Integer selementid;

    /**
     * Gets sysmapelementurlid.
     *
     * @return Value of sysmapelementurlid.
     */
    public Integer getSysmapelementurlid() {
        return sysmapelementurlid;
    }

    /**
     * Sets new sysmapelementurlid.
     *
     * @param sysmapelementurlid New value of sysmapelementurlid.
     */
    public void setSysmapelementurlid(Integer sysmapelementurlid) {
        this.sysmapelementurlid = sysmapelementurlid;
    }

    /**
     * Gets selementid.
     *
     * @return Value of selementid.
     */
    public Integer getSelementid() {
        return selementid;
    }

    /**
     * Sets new selementid.
     *
     * @param selementid New value of selementid.
     */
    public void setSelementid(Integer selementid) {
        this.selementid = selementid;
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
