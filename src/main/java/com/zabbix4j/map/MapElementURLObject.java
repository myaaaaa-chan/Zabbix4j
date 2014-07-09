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
