package com.zabbix4j.templatescreenitem;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenItemObject {
    private Integer screenitemid;
    private Integer colspan;
    private Integer resourceid;
    private Integer resourcetype;
    private Integer rowspan;
    private Integer elements;
    private Integer screenid;
    private Integer halign;
    private Integer height;
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

    public static enum RESOURCE_TYPE {
        GRAPH(0), SIMPLE_GRAPH(1), PLAIN_TEXT(3), CLOCK(7), URL(11);
        public int value;

        private RESOURCE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum HALIGH {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private HALIGH(int value) {
            this.value = value;
        }
    }

    public static enum CLOCK_STYLE {
        LOCAL_TIME(0), SERVER_TIME(1), HOST_TIME(2);
        public int value;

        private CLOCK_STYLE(int value) {
            this.value = value;
        }
    }

    public static enum PLAIN_TEXT_STYLE {
        PLAIN_TEXT(0), HTML(1);
        public int value;

        private PLAIN_TEXT_STYLE(int value) {
            this.value = value;
        }
    }

    public static enum VALIGN {
        MIDDLE(0), TOP(1), BOTTOM(2);
        public int value;

        private VALIGN(int value) {
            this.value = value;
        }

    }
}
