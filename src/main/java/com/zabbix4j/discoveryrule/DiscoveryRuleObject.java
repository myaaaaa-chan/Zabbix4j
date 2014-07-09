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

package com.zabbix4j.discoveryrule;

import java.util.Date;

/**
 * Created by Suguru Yajima on 2014/05/26.
 */
public class DiscoveryRuleObject {

    private Integer druleid;

    /**
     * The range of IP addresses for discovery. It may have the following formats:
     * Single IP: 192.168.1.33
     * Range of IP addresses: 192.168.1.1-255
     * IP mask: 192.168.4.0/24
     * Supported IP masks:
     * /16 - /32 for IPv4 addresses
     * /112 - /128 for IPv6 addresses
     * List: 192.168.1.1-255,192.168.2.1-100,192.168.2.200,192.168.4.0/24
     */
    private String iprange;
    private String name;
    private Integer delay = 3600;
    private Long nextcheck;
    private Integer proxy_hostid;
    private Integer status = STATUS.ENABLED.value;

    public DiscoveryRuleObject() {
    }

    public Integer getDruleid() {
        return druleid;
    }

    public void setDruleid(Integer druleid) {
        this.druleid = druleid;
    }

    public String getIprange() {
        return iprange;
    }

    public void setIprange(String iprange) {
        this.iprange = iprange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Long getNextcheck() {
        return nextcheck;
    }

    public void setNextcheck(Long nextcheck) {
        this.nextcheck = nextcheck;
    }

    public Integer getProxy_hostid() {
        return proxy_hostid;
    }

    public void setProxy_hostid(Integer proxy_hostid) {
        this.proxy_hostid = proxy_hostid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getNextCheckDate() {
        if (nextcheck != null && nextcheck != 0) {
            return new Date(nextcheck);
        }

        return null;
    }

    public static enum STATUS {
        ENABLED(0), DISABLED(1);

        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }
}
