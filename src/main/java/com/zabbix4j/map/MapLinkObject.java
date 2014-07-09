package com.zabbix4j.map;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MapLinkObject {

    private Integer linkid;
    private Integer selementid1;
    private Integer selementid2;
    private String color;
    private Integer drawtype;
    private String label;
    private List<MapLinkTriggerObject> linktriggers;
    private Integer sysmapid;

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
     * Gets label.
     *
     * @return Value of label.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets new label.
     *
     * @param label New value of label.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets selementid1.
     *
     * @return Value of selementid1.
     */
    public Integer getSelementid1() {
        return selementid1;
    }

    /**
     * Sets new selementid1.
     *
     * @param selementid1 New value of selementid1.
     */
    public void setSelementid1(Integer selementid1) {
        this.selementid1 = selementid1;
    }

    /**
     * Gets linktriggers.
     *
     * @return Value of linktriggers.
     */
    public List<MapLinkTriggerObject> getLinktriggers() {
        return linktriggers;
    }

    /**
     * Sets new linktriggers.
     *
     * @param linktriggers New value of linktriggers.
     */
    public void setLinktriggers(List<MapLinkTriggerObject> linktriggers) {
        this.linktriggers = linktriggers;
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
     * Gets selementid2.
     *
     * @return Value of selementid2.
     */
    public Integer getSelementid2() {
        return selementid2;
    }

    /**
     * Sets new selementid2.
     *
     * @param selementid2 New value of selementid2.
     */
    public void setSelementid2(Integer selementid2) {
        this.selementid2 = selementid2;
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

    public static enum LINK_LINE_DRAW_STYLE {
        LINE(0), BOLD_LINE(2), DOTTED_LINE(3), DASHED_LINE(4);
        public int value;

        private LINK_LINE_DRAW_STYLE(int value) {
            this.value = value;
        }
    }
}
