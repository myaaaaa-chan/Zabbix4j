package com.zabbix4j.map;

/**
 * @author Suguru Yajima
 */
public class MapURLObject {

    private Integer sysmapurlid;
    private String name;
    private String url;
    private Integer elementtype;
    private Integer sysmapid;

    /**
     * Gets sysmapurlid.
     *
     * @return Value of sysmapurlid.
     */
    public Integer getSysmapurlid() {
        return sysmapurlid;
    }

    /**
     * Sets new sysmapurlid.
     *
     * @param sysmapurlid New value of sysmapurlid.
     */
    public void setSysmapurlid(Integer sysmapurlid) {
        this.sysmapurlid = sysmapurlid;
    }

    /**
     * Gets elementtype.
     *
     * @return Value of elementtype.
     */
    public Integer getElementtype() {
        return elementtype;
    }

    /**
     * Sets new elementtype.
     *
     * @param elementtype New value of elementtype.
     */
    public void setElementtype(Integer elementtype) {
        this.elementtype = elementtype;
    }

    /**
     * Gets sysmapid.
     *
     * @return Value of sysmapid.
     */
    public Integer getSysmapid() {
        return sysmapid;
    }

    /**
     * Sets new sysmapid.
     *
     * @param sysmapid New value of sysmapid.
     */
    public void setSysmapid(Integer sysmapid) {
        this.sysmapid = sysmapid;
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
