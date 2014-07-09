package com.zabbix4j.itservice;

/**
 * @author Suguru Yajima
 */
public class ServiceDependencyObject {

    private Integer linkid;
    private Integer servicedownid;
    private Integer serviceupid;
    private Integer soft;

    /**
     * Gets soft.
     *
     * @return Value of soft.
     */
    public Integer getSoft() {
        return soft;
    }

    /**
     * Sets new soft.
     *
     * @param soft New value of soft.
     */
    public void setSoft(Integer soft) {
        this.soft = soft;
    }

    /**
     * Gets servicedownid.
     *
     * @return Value of servicedownid.
     */
    public Integer getServicedownid() {
        return servicedownid;
    }

    /**
     * Sets new servicedownid.
     *
     * @param servicedownid New value of servicedownid.
     */
    public void setServicedownid(Integer servicedownid) {
        this.servicedownid = servicedownid;
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
     * Gets serviceupid.
     *
     * @return Value of serviceupid.
     */
    public Integer getServiceupid() {
        return serviceupid;
    }

    /**
     * Sets new serviceupid.
     *
     * @param serviceupid New value of serviceupid.
     */
    public void setServiceupid(Integer serviceupid) {
        this.serviceupid = serviceupid;
    }

    public static enum DEPENDENCY_TYPE {
        HARD_DEPENDENCY(0), SOFT_DEPENDENCY(1);
        public int value;

        private DEPENDENCY_TYPE(int value) {
            this.value = value;
        }
    }
}
