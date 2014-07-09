package com.zabbix4j.screen;

/**
 * @author Suguru Yajima
 */
public class ScreenObject {

    private Integer screenid;
    private String name;
    private Integer hsize;
    private Integer vsize;

    /**
     * Gets screenid.
     *
     * @return Value of screenid.
     */
    public Integer getScreenid() {
        return screenid;
    }

    /**
     * Sets new screenid.
     *
     * @param screenid New value of screenid.
     */
    public void setScreenid(Integer screenid) {
        this.screenid = screenid;
    }

    /**
     * Gets vsize.
     *
     * @return Value of vsize.
     */
    public Integer getVsize() {
        return vsize;
    }

    /**
     * Sets new vsize.
     *
     * @param vsize New value of vsize.
     */
    public void setVsize(Integer vsize) {
        this.vsize = vsize;
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

    /**
     * Gets hsize.
     *
     * @return Value of hsize.
     */
    public Integer getHsize() {
        return hsize;
    }

    /**
     * Sets new hsize.
     *
     * @param hsize New value of hsize.
     */
    public void setHsize(Integer hsize) {
        this.hsize = hsize;
    }
}
