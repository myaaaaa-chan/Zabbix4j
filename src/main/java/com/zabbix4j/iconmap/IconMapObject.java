package com.zabbix4j.iconmap;

/**
 * @author Suguru Yajima
 */
public class IconMapObject {

    private Integer iconmapid;
    private Integer default_iconid;
    private String name;

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

    /**
     * Gets default_iconid.
     *
     * @return Value of default_iconid.
     */
    public Integer getDefault_iconid() {
        return default_iconid;
    }

    /**
     * Sets new default_iconid.
     *
     * @param default_iconid New value of default_iconid.
     */
    public void setDefault_iconid(Integer default_iconid) {
        this.default_iconid = default_iconid;
    }
}
