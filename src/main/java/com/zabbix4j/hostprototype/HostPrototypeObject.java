package com.zabbix4j.hostprototype;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
public class HostPrototypeObject {

    private Integer hostid;
    private String host;
    private String name;
    private Integer status;
    private Integer templateid;

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
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets host.
     *
     * @return Value of host.
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets new host.
     *
     * @param host New value of host.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Gets hostid.
     *
     * @return Value of hostid.
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * Sets new hostid.
     *
     * @param hostid New value of hostid.
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

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
}
