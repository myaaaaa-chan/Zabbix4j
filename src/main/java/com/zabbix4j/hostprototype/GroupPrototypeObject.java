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
