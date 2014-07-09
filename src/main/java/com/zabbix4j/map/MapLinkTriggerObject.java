package com.zabbix4j.map;

/**
 * @author Suguru Yajima
 */
public class MapLinkTriggerObject {

    private Integer linktriggerid;
    private Integer triggerid;
    private String color;
    private Integer drawtype;
    private Integer linkid;

    /**
     * Gets drawtype.
     *
     * @return Value of drawtype.
     */
    public Integer getDrawtype() {
        return drawtype;
    }

    /**
     * Sets new drawtype.
     *
     * @param drawtype New value of drawtype.
     */
    public void setDrawtype(Integer drawtype) {
        this.drawtype = drawtype;
    }

    /**
     * Gets linkid.
     *
     * @return Value of linkid.
     */
    public Integer getLinkid() {
        return linkid;
    }

    /**
     * Sets new linkid.
     *
     * @param linkid New value of linkid.
     */
    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    /**
     * Gets linktriggerid.
     *
     * @return Value of linktriggerid.
     */
    public Integer getLinktriggerid() {
        return linktriggerid;
    }

    /**
     * Sets new linktriggerid.
     *
     * @param linktriggerid New value of linktriggerid.
     */
    public void setLinktriggerid(Integer linktriggerid) {
        this.linktriggerid = linktriggerid;
    }

    /**
     * Gets color.
     *
     * @return Value of color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets new color.
     *
     * @param color New value of color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets triggerid.
     *
     * @return Value of triggerid.
     */
    public Integer getTriggerid() {
        return triggerid;
    }

    /**
     * Sets new triggerid.
     *
     * @param triggerid New value of triggerid.
     */
    public void setTriggerid(Integer triggerid) {
        this.triggerid = triggerid;
    }

    public static enum INDICATOR_DRAW_STYLE {
        LINE(0), BOLD_LINE(2), DOTTED_LINE(3), DASHED_LINE(4);
        public int value;

        private INDICATOR_DRAW_STYLE(int value) {
            this.value = value;
        }
    }
}
