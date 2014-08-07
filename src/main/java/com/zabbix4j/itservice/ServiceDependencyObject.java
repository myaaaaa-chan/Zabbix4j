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
