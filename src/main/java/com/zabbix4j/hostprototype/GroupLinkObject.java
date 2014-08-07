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
 * The group link object links a host prototype with a host group and has the following properties.
 * <p/>
 * Created by Suguru Yajima on 2014/06/04.
 */
public class GroupLinkObject {

    /**
     * (readonly) ID of the group link.
     */
    private Integer group_prototypeid;

    /**
     * ID of the host group.
     */
    private Integer groupid;
    /**
     * (readonly) ID of the host prototype
     */
    private Integer hostid;
    /**
     * (readonly) ID of the parent template group link.
     */
    private Integer templateid;


    /**
     * Gets readonly ID of the parent template group link..
     *
     * @return Value of readonly ID of the parent template group link..
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new readonly ID of the parent template group link..
     *
     * @param templateid New value of readonly ID of the parent template group link..
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

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
     * Gets ID of the host group..
     *
     * @return Value of ID of the host group..
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * Sets new ID of the host group..
     *
     * @param groupid New value of ID of the host group..
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * Gets readonly ID of the group link..
     *
     * @return Value of readonly ID of the group link..
     */
    public Integer getGroup_prototypeid() {
        return group_prototypeid;
    }

    /**
     * Sets new readonly ID of the group link..
     *
     * @param group_prototypeid New value of readonly ID of the group link..
     */
    public void setGroup_prototypeid(Integer group_prototypeid) {
        this.group_prototypeid = group_prototypeid;
    }
}
