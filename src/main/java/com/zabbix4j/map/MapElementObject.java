package com.zabbix4j.map;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MapElementObject {

    private Integer selementid;
    private Integer elementid;
    private Integer elementtype;
    private Integer iconid_off;
    private Integer areatype;
    private Integer elementsubtype;
    private Integer height;
    private Integer iconid_disabled;
    private Integer iconid_maintenance;
    private Integer iconid_on;
    private String label;
    private Integer label_location;
    private Integer sysmapid;
    private List<MapElementURLObject> urls;
    private Integer use_iconmap;
    /**
     * Possible values: 0 - (default) grid
     */
    private Integer viewtype;
    private Integer width;
    private Integer x;
    private Integer y;

    /**
     * Gets iconid_disabled.
     *
     * @return Value of iconid_disabled.
     */
    public Integer getIconid_disabled() {
        return iconid_disabled;
    }

    /**
     * Sets new iconid_disabled.
     *
     * @param iconid_disabled New value of iconid_disabled.
     */
    public void setIconid_disabled(Integer iconid_disabled) {
        this.iconid_disabled = iconid_disabled;
    }

    /**
     * Gets elementsubtype.
     *
     * @return Value of elementsubtype.
     */
    public Integer getElementsubtype() {
        return elementsubtype;
    }

    /**
     * Sets new elementsubtype.
     *
     * @param elementsubtype New value of elementsubtype.
     */
    public void setElementsubtype(Integer elementsubtype) {
        this.elementsubtype = elementsubtype;
    }

    /**
     * Gets elementid.
     *
     * @return Value of elementid.
     */
    public Integer getElementid() {
        return elementid;
    }

    /**
     * Sets new elementid.
     *
     * @param elementid New value of elementid.
     */
    public void setElementid(Integer elementid) {
        this.elementid = elementid;
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
     * Gets iconid_off.
     *
     * @return Value of iconid_off.
     */
    public Integer getIconid_off() {
        return iconid_off;
    }

    /**
     * Sets new iconid_off.
     *
     * @param iconid_off New value of iconid_off.
     */
    public void setIconid_off(Integer iconid_off) {
        this.iconid_off = iconid_off;
    }

    /**
     * Gets iconid_on.
     *
     * @return Value of iconid_on.
     */
    public Integer getIconid_on() {
        return iconid_on;
    }

    /**
     * Sets new iconid_on.
     *
     * @param iconid_on New value of iconid_on.
     */
    public void setIconid_on(Integer iconid_on) {
        this.iconid_on = iconid_on;
    }

    /**
     * Gets urls.
     *
     * @return Value of urls.
     */
    public List<MapElementURLObject> getUrls() {
        return urls;
    }

    /**
     * Sets new urls.
     *
     * @param urls New value of urls.
     */
    public void setUrls(List<MapElementURLObject> urls) {
        this.urls = urls;
    }

    /**
     * Gets iconid_maintenance.
     *
     * @return Value of iconid_maintenance.
     */
    public Integer getIconid_maintenance() {
        return iconid_maintenance;
    }

    /**
     * Sets new iconid_maintenance.
     *
     * @param iconid_maintenance New value of iconid_maintenance.
     */
    public void setIconid_maintenance(Integer iconid_maintenance) {
        this.iconid_maintenance = iconid_maintenance;
    }

    /**
     * Gets y.
     *
     * @return Value of y.
     */
    public Integer getY() {
        return y;
    }

    /**
     * Sets new y.
     *
     * @param y New value of y.
     */
    public void setY(Integer y) {
        this.y = y;
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
     * Gets use_iconmap.
     *
     * @return Value of use_iconmap.
     */
    public Integer getUse_iconmap() {
        return use_iconmap;
    }

    /**
     * Sets new use_iconmap.
     *
     * @param use_iconmap New value of use_iconmap.
     */
    public void setUse_iconmap(Integer use_iconmap) {
        this.use_iconmap = use_iconmap;
    }

    /**
     * Gets label_location.
     *
     * @return Value of label_location.
     */
    public Integer getLabel_location() {
        return label_location;
    }

    /**
     * Sets new label_location.
     *
     * @param label_location New value of label_location.
     */
    public void setLabel_location(Integer label_location) {
        this.label_location = label_location;
    }

    /**
     * Gets Possible values: 0 - default grid.
     *
     * @return Value of Possible values: 0 - default grid.
     */
    public Integer getViewtype() {
        return viewtype;
    }

    /**
     * Sets new Possible values: 0 - default grid.
     *
     * @param viewtype New value of Possible values: 0 - default grid.
     */
    public void setViewtype(Integer viewtype) {
        this.viewtype = viewtype;
    }

    /**
     * Gets width.
     *
     * @return Value of width.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets new width.
     *
     * @param width New value of width.
     */
    public void setWidth(Integer width) {
        this.width = width;
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
     * Gets areatype.
     *
     * @return Value of areatype.
     */
    public Integer getAreatype() {
        return areatype;
    }

    /**
     * Sets new areatype.
     *
     * @param areatype New value of areatype.
     */
    public void setAreatype(Integer areatype) {
        this.areatype = areatype;
    }

    /**
     * Gets x.
     *
     * @return Value of x.
     */
    public Integer getX() {
        return x;
    }

    /**
     * Sets new x.
     *
     * @param x New value of x.
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Gets height.
     *
     * @return Value of height.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    public static enum ELEMENT_TYPE {
        HOST(0), MAP(1), TRIGGER(2), HOST_GROUP(3), IMAGE(4);
        public int value;

        private ELEMENT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum AREA_TYPE {
        WHOLE_MAP(0), FIXED_SIZE(1);
        public int value;

        private AREA_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum ELEMENT_SUB_TYPE {
        SINGLE_ELEMENT(0), SEPARATELY(1);
        public int value;

        private ELEMENT_SUB_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_LOCATION {
        BOTTOM(0), LEFT(1), RIGHT(2), TOP(3);
        public int value;

        private LABEL_LOCATION(int value) {
            this.value = value;
        }
    }

    public static enum USE_ICONMAP {
        DO_NOT_USE_ICON_MAPPING(0), USE_ICON_MAPPING(1);
        public int value;

        private USE_ICONMAP(int value) {
            this.value = value;
        }
    }
}
