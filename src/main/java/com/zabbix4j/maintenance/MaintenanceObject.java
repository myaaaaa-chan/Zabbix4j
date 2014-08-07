/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.maintenance;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class MaintenanceObject {

    private Integer maintenanceid;
    private String name;
    private Long active_since;
    private Long active_till;
    private String description;
    private Integer maintenance_type;

    public Date getActiveSinceDate() {
        if (active_since != null && active_since != 0) {
            return new Date(active_since);
        }

        return null;
    }

    public Date getActiveTill() {
        if (active_till != null && active_till != 0) {
            return new Date(active_till);
        }

        return null;
    }

    /**
     * Gets active_since.
     *
     * @return Value of active_since.
     */
    public Long getActive_since() {
        return active_since;
    }

    /**
     * Sets new active_since.
     *
     * @param active_since New value of active_since.
     */
    public void setActive_since(Long active_since) {
        this.active_since = active_since;
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
     * Gets maintenance_type.
     *
     * @return Value of maintenance_type.
     */
    public Integer getMaintenance_type() {
        return maintenance_type;
    }

    /**
     * Sets new maintenance_type.
     *
     * @param maintenance_type New value of maintenance_type.
     */
    public void setMaintenance_type(Integer maintenance_type) {
        this.maintenance_type = maintenance_type;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets maintenanceid.
     *
     * @return Value of maintenanceid.
     */
    public Integer getMaintenanceid() {
        return maintenanceid;
    }

    /**
     * Sets new maintenanceid.
     *
     * @param maintenanceid New value of maintenanceid.
     */
    public void setMaintenanceid(Integer maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    /**
     * Gets active_till.
     *
     * @return Value of active_till.
     */
    public Long getActive_till() {
        return active_till;
    }

    /**
     * Sets new active_till.
     *
     * @param active_till New value of active_till.
     */
    public void setActive_till(Long active_till) {
        this.active_till = active_till;
    }

    public static enum MAINTENANCE_TYPE {
        WITH_DATA_COLLECTION(0), WITHOUT_DATA_COLLECTION(1);
        public int value;

        private MAINTENANCE_TYPE(int value) {
            this.value = value;
        }
    }
}
