package com.zabbix4j.itservice;

/**
 * @author Suguru Yajima
 */
public class ITServiceObject {

    private Integer serviceid;
    private Integer algorithm;
    private String name;
    private Integer showsla;
    private Integer sortorder;
    private Float goodsla;
    private Integer status;
    private Integer triggerid;

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
     * Gets algorithm.
     *
     * @return Value of algorithm.
     */
    public Integer getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets new algorithm.
     *
     * @param algorithm New value of algorithm.
     */
    public void setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
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

    /**
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets goodsla.
     *
     * @return Value of goodsla.
     */
    public Float getGoodsla() {
        return goodsla;
    }

    /**
     * Sets new goodsla.
     *
     * @param goodsla New value of goodsla.
     */
    public void setGoodsla(Float goodsla) {
        this.goodsla = goodsla;
    }

    /**
     * Gets showsla.
     *
     * @return Value of showsla.
     */
    public Integer getShowsla() {
        return showsla;
    }

    /**
     * Sets new showsla.
     *
     * @param showsla New value of showsla.
     */
    public void setShowsla(Integer showsla) {
        this.showsla = showsla;
    }

    /**
     * Gets serviceid.
     *
     * @return Value of serviceid.
     */
    public Integer getServiceid() {
        return serviceid;
    }

    /**
     * Sets new serviceid.
     *
     * @param serviceid New value of serviceid.
     */
    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
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

    public static enum ALGORITHM {
        DO_NOT_CALCULATE(0), LEAST_ONE_CHILD_PROBLEM(1), ALL_CHILDREN_PROBLEM(2);
        public int value;

        private ALGORITHM(int value) {
            this.value = value;
        }
    }

    public static enum SLA {
        DO_NOT_CALCULATE(0), CALCULATE(1);
        public int value;

        private SLA(int value) {
            this.value = value;
        }
    }
}
