package com.zabbix4j.iconmap;

/**
 * @author Suguru Yajima
 */
public class IconMappingObject {

    private Integer iconmappingid;
    private Integer iconid;
    private String expression;
    private Integer inventory_link;
    private Integer iconmapid;
    private Integer sortorder;

    /**
     * Gets expression.
     *
     * @return Value of expression.
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets new expression.
     *
     * @param expression New value of expression.
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Gets iconid.
     *
     * @return Value of iconid.
     */
    public Integer getIconid() {
        return iconid;
    }

    /**
     * Sets new iconid.
     *
     * @param iconid New value of iconid.
     */
    public void setIconid(Integer iconid) {
        this.iconid = iconid;
    }

    /**
     * Gets iconmappingid.
     *
     * @return Value of iconmappingid.
     */
    public Integer getIconmappingid() {
        return iconmappingid;
    }

    /**
     * Sets new iconmappingid.
     *
     * @param iconmappingid New value of iconmappingid.
     */
    public void setIconmappingid(Integer iconmappingid) {
        this.iconmappingid = iconmappingid;
    }

    /**
     * Gets sortorder.
     *
     * @return Value of sortorder.
     */
    public Integer getSortorder() {
        return sortorder;
    }

    /**
     * Sets new sortorder.
     *
     * @param sortorder New value of sortorder.
     */
    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    /**
     * Gets inventory_link.
     *
     * @return Value of inventory_link.
     */
    public Integer getInventory_link() {
        return inventory_link;
    }

    /**
     * Sets new inventory_link.
     *
     * @param inventory_link New value of inventory_link.
     */
    public void setInventory_link(Integer inventory_link) {
        this.inventory_link = inventory_link;
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
}
