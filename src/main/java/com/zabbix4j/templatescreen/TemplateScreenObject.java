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

package com.zabbix4j.templatescreen;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenObject {

    private Integer screenid;
    private String name;
    private Integer templateid;
    private Integer hsize;
    private Integer vsize;

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
     * Gets vsize.
     *
     * @return Value of vsize.
     */
    public Integer getVsize() {
        return vsize;
    }

    /**
     * Sets new vsize.
     *
     * @param vsize New value of vsize.
     */
    public void setVsize(Integer vsize) {
        this.vsize = vsize;
    }

    /**
     * Gets screenid.
     *
     * @return Value of screenid.
     */
    public Integer getScreenid() {
        return screenid;
    }

    /**
     * Sets new screenid.
     *
     * @param screenid New value of screenid.
     */
    public void setScreenid(Integer screenid) {
        this.screenid = screenid;
    }

    /**
     * Gets hsize.
     *
     * @return Value of hsize.
     */
    public Integer getHsize() {
        return hsize;
    }

    /**
     * Sets new hsize.
     *
     * @param hsize New value of hsize.
     */
    public void setHsize(Integer hsize) {
        this.hsize = hsize;
    }
}
