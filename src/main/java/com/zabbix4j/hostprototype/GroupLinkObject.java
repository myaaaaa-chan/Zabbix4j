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
