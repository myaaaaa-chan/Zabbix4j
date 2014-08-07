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
public class IconMappingObject {

    private Integer iconmappingid;
    private Integer iconid;
    private String expression;
    private Integer inventory_link;
    private Integer iconmapid;
    private Integer sortorder;

    /**
     * Gets expression.
     *
     * @return Value of expression.
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets new expression.
     *
     * @param expression New value of expression.
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Gets iconid.
     *
     * @return Value of iconid.
     */
    public Integer getIconid() {
        return iconid;
    }

    /**
     * Sets new iconid.
     *
     * @param iconid New value of iconid.
     */
    public void setIconid(Integer iconid) {
        this.iconid = iconid;
    }

    /**
     * Gets iconmappingid.
     *
     * @return Value of iconmappingid.
     */
    public Integer getIconmappingid() {
        return iconmappingid;
    }

    /**
     * Sets new iconmappingid.
     *
     * @param iconmappingid New value of iconmappingid.
     */
    public void setIconmappingid(Integer iconmappingid) {
        this.iconmappingid = iconmappingid;
    }

    /**
     * Gets sortorder.
     *
     * @return Value of sortorder.
     */
    public Integer getSortorder() {
        return sortorder;
    }

    /**
     * Sets new sortorder.
     *
     * @param sortorder New value of sortorder.
     */
    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    /**
     * Gets inventory_link.
     *
     * @return Value of inventory_link.
     */
    public Integer getInventory_link() {
        return inventory_link;
    }

    /**
     * Sets new inventory_link.
     *
     * @param inventory_link New value of inventory_link.
     */
    public void setInventory_link(Integer inventory_link) {
        this.inventory_link = inventory_link;
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
}
