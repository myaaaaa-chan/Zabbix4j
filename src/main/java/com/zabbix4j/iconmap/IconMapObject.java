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

package com.zabbix4j.iconmap;

/**
 * @author Suguru Yajima
 */
public class IconMapObject {

    private Integer iconmapid;
    private Integer default_iconid;
    private String name;

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
     * Gets iconmapid.
     *
     * @return Value of iconmapid.
     */
    public Integer getIconmapid() {
        return iconmapid;
    }

    /**
     * Sets new iconmapid.
     *
     * @param iconmapid New value of iconmapid.
     */
    public void setIconmapid(Integer iconmapid) {
        this.iconmapid = iconmapid;
    }

    /**
     * Gets default_iconid.
     *
     * @return Value of default_iconid.
     */
    public Integer getDefault_iconid() {
        return default_iconid;
    }

    /**
     * Sets new default_iconid.
     *
     * @param default_iconid New value of default_iconid.
     */
    public void setDefault_iconid(Integer default_iconid) {
        this.default_iconid = default_iconid;
    }
}
