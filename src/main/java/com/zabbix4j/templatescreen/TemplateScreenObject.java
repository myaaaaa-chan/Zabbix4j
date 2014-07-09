package com.zabbix4j.templatescreen;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenObject {

    private Integer screenid;
    private String name;
    private Integer templateid;
    private Integer hsize;
    private Integer vsize;

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
