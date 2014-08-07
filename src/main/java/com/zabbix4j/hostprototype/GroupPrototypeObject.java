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
 * The group prototype object defines a group that will be created for a discovered host and has the following properties.
 * <p/>
 * Created by Suguru Yajima on 2014/06/04.
 */
public class GroupPrototypeObject {

    /**
     * (readonly) ID of the group prototype.
     */
    private Integer group_prototypeid;

    /**
     * Name of the group prototype.
     */
    private String name;

    /**
     * (readonly) ID of the host prototype
     */
    private Integer hostid;
    /**
     * (readonly) ID of the parent template group prototype.
     */
    private Integer templateid;

    /**
     * Gets readonly ID of the host prototype.
     *
     * @return Value of readonly ID of the host prototype.
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * Sets new readonly ID of the host prototype.
     *
     * @param hostid New value of readonly ID of the host prototype.
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    /**
     * Gets Name of the group prototype..
     *
     * @return Value of Name of the group prototype..
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new Name of the group prototype..
     *
     * @param name New value of Name of the group prototype..
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets readonly ID of the group prototype..
     *
     * @return Value of readonly ID of the group prototype..
     */
    public Integer getGroup_prototypeid() {
        return group_prototypeid;
    }

    /**
     * Sets new readonly ID of the group prototype..
     *
     * @param group_prototypeid New value of readonly ID of the group prototype..
     */
    public void setGroup_prototypeid(Integer group_prototypeid) {
        this.group_prototypeid = group_prototypeid;
    }

    /**
     * Gets readonly ID of the parent template group prototype..
     *
     * @return Value of readonly ID of the parent template group prototype..
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new readonly ID of the parent template group prototype..
     *
     * @param templateid New value of readonly ID of the parent template group prototype..
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }
}
