package com.zabbix4j.itservice;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class ServiceAlarmObject {

    private Integer servicealarmid;
    private Integer serviceid;
    private Long clock;
    public Date getClockDate() {
        if (clock != null && clock != 0) {
            return new Date(clock);
        }

        return null;
    }
    /**
     * Status of the IT service.
     * Refer the the IT service status property for a list of possible values
     */
    private Integer value;

    /**
     * Gets Status of the IT service.
     * Refer the the IT service status property for a list of possible values.
     *
     * @return Value of Status of the IT service.
     * Refer the the IT service status property for a list of possible values.
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets new clock.
     *
     * @param clock New value of clock.
     */
    public void setClock(Long clock) {
        this.clock = clock;
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
     * Sets new Status of the IT service.
     * Refer the the IT service status property for a list of possible values.
     *
     * @param value New value of Status of the IT service.
     *              Refer the the IT service status property for a list of possible values.
     */
    public void setValue(Integer value) {
        this.value = value;
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
     * Sets new servicealarmid.
     *
     * @param servicealarmid New value of servicealarmid.
     */
    public void setServicealarmid(Integer servicealarmid) {
        this.servicealarmid = servicealarmid;
    }

    /**
     * Gets servicealarmid.
     *
     * @return Value of servicealarmid.
     */
    public Integer getServicealarmid() {
        return servicealarmid;
    }

    /**
     * Gets clock.
     *
     * @return Value of clock.
     */
    public Long getClock() {
        return clock;
    }
}
