package com.zabbix4j.screenitem;

/**
 * @author Suguru Yajima
 */
public class ScreenItemObject {
    private Integer screenitemid;
    private Integer colspan;
    private Integer resourcetype;
    private Integer rowspan;
    private Integer screenid;
    private Integer elements;
    private Integer halign;
    private Integer height;
    private Integer resourceid;
    private Integer sort_triggers;
    private Integer style;
    private String url;
    private Integer valign;
    private Integer width;
    private Integer x;
    private Integer y;

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
     * Gets sort_triggers.
     *
     * @return Value of sort_triggers.
     */
    public Integer getSort_triggers() {
        return sort_triggers;
    }

    /**
     * Sets new sort_triggers.
     *
     * @param sort_triggers New value of sort_triggers.
     */
    public void setSort_triggers(Integer sort_triggers) {
        this.sort_triggers = sort_triggers;
    }

    /**
     * Gets style.
     *
     * @return Value of style.
     */
    public Integer getStyle() {
        return style;
    }

    /**
     * Sets new style.
     *
     * @param style New value of style.
     */
    public void setStyle(Integer style) {
        this.style = style;
    }

    /**
     * Gets screenitemid.
     *
     * @return Value of screenitemid.
     */
    public Integer getScreenitemid() {
        return screenitemid;
    }

    /**
     * Sets new screenitemid.
     *
     * @param screenitemid New value of screenitemid.
     */
    public void setScreenitemid(Integer screenitemid) {
        this.screenitemid = screenitemid;
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
     * Gets rowspan.
     *
     * @return Value of rowspan.
     */
    public Integer getRowspan() {
        return rowspan;
    }

    /**
     * Sets new rowspan.
     *
     * @param rowspan New value of rowspan.
     */
    public void setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
    }

    /**
     * Gets resourcetype.
     *
     * @return Value of resourcetype.
     */
    public Integer getResourcetype() {
        return resourcetype;
    }

    /**
     * Sets new resourcetype.
     *
     * @param resourcetype New value of resourcetype.
     */
    public void setResourcetype(Integer resourcetype) {
        this.resourcetype = resourcetype;
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
     * Gets resourceid.
     *
     * @return Value of resourceid.
     */
    public Integer getResourceid() {
        return resourceid;
    }

    /**
     * Sets new resourceid.
     *
     * @param resourceid New value of resourceid.
     */
    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    /**
     * Gets elements.
     *
     * @return Value of elements.
     */
    public Integer getElements() {
        return elements;
    }

    /**
     * Sets new elements.
     *
     * @param elements New value of elements.
     */
    public void setElements(Integer elements) {
        this.elements = elements;
    }

    /**
     * Gets valign.
     *
     * @return Value of valign.
     */
    public Integer getValign() {
        return valign;
    }

    /**
     * Sets new valign.
     *
     * @param valign New value of valign.
     */
    public void setValign(Integer valign) {
        this.valign = valign;
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

    /**
     * Gets colspan.
     *
     * @return Value of colspan.
     */
    public Integer getColspan() {
        return colspan;
    }

    /**
     * Sets new colspan.
     *
     * @param colspan New value of colspan.
     */
    public void setColspan(Integer colspan) {
        this.colspan = colspan;
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
     * Gets halign.
     *
     * @return Value of halign.
     */
    public Integer getHalign() {
        return halign;
    }

    /**
     * Sets new halign.
     *
     * @param halign New value of halign.
     */
    public void setHalign(Integer halign) {
        this.halign = halign;
    }

    public static enum RESOURCE_TYPE {
        GRAPH(0), SIMPLE_GRAPH(1), MAP(2), PLAIN_TEXT(3), HOSTS_INFO(4), TRIGGERS_INFO(5), SERVER_INFO(6),
        CLOCK(7), SCREEN(8), TRIGGERS_OVERVIEW(9), DATA_OVERVIEW(10), URL(11), HISTORY_OF_ACTIONS(12),
        HISTORY_OF_EVENTS(13), STATUS_OF_HOST_GROUP_TRIGGERS(14), SYSTEM_STATUS(15), STATUS_OF_HOST_TRIGGERS(16);

        public int value;

        private RESOURCE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum HORIZONTAL_ALIGN {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private HORIZONTAL_ALIGN(int value) {
            this.value = value;
        }
    }

    public static enum SORT_ORDER {
        TIME_ASCENDING(3), TYPE_ASCENDING(5), TYPE_DESCENDING(6), STATUS_ASCENDING(7), STATUS_DESCENDING(8),
        RETRIES_LEFT_ASCENDING(9), RETRIES_LEFT_DESCENDING(10), RECIPIENT_ASCENDING(11), RECIPIENT_DESCENDING(12),
        LAST_CHANGE_DESCENDING(0), SEVERITY_DESCENDING(1), HOST_ASCENDING(2);

        public int value;

        private SORT_ORDER(int value) {
            this.value = value;
        }
    }

    public static enum VERTICAL_ALIGN {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private VERTICAL_ALIGN(int value) {
            this.value = value;
        }
    }
}
