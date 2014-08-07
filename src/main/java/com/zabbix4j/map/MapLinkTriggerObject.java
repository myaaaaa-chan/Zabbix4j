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
public class MapLinkTriggerObject {

    private Integer linktriggerid;
    private Integer triggerid;
    private String color;
    private Integer drawtype;
    private Integer linkid;

    /**
     * Gets drawtype.
     *
     * @return Value of drawtype.
     */
    public Integer getDrawtype() {
        return drawtype;
    }

    /**
     * Sets new drawtype.
     *
     * @param drawtype New value of drawtype.
     */
    public void setDrawtype(Integer drawtype) {
        this.drawtype = drawtype;
    }

    /**
     * Gets linkid.
     *
     * @return Value of linkid.
     */
    public Integer getLinkid() {
        return linkid;
    }

    /**
     * Sets new linkid.
     *
     * @param linkid New value of linkid.
     */
    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    /**
     * Gets linktriggerid.
     *
     * @return Value of linktriggerid.
     */
    public Integer getLinktriggerid() {
        return linktriggerid;
    }

    /**
     * Sets new linktriggerid.
     *
     * @param linktriggerid New value of linktriggerid.
     */
    public void setLinktriggerid(Integer linktriggerid) {
        this.linktriggerid = linktriggerid;
    }

    /**
     * Gets color.
     *
     * @return Value of color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets new color.
     *
     * @param color New value of color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets triggerid.
     *
     * @return Value of triggerid.
     */
    public Integer getTriggerid() {
        return triggerid;
    }

    /**
     * Sets new triggerid.
     *
     * @param triggerid New value of triggerid.
     */
    public void setTriggerid(Integer triggerid) {
        this.triggerid = triggerid;
    }

    public static enum INDICATOR_DRAW_STYLE {
        LINE(0), BOLD_LINE(2), DOTTED_LINE(3), DASHED_LINE(4);
        public int value;

        private INDICATOR_DRAW_STYLE(int value) {
            this.value = value;
        }
    }
}
