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

package com.zabbix4j.discoveredhost;

import java.util.Date;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class Dservice {

    private Integer dserviceid;
    private Integer dhostid;
    private Integer type;
    private String key_;
    private String value;
    private Integer port;
    private Integer status;
    private Long lastup;
    private Long lastdown;
    private Integer dcheckid;
    private String ip;
    private String dns;

    public Dservice() {
    }

    public Integer getDserviceid() {
        return dserviceid;
    }

    public void setDserviceid(Integer dserviceid) {
        this.dserviceid = dserviceid;
    }

    public Integer getDhostid() {
        return dhostid;
    }

    public void setDhostid(Integer dhostid) {
        this.dhostid = dhostid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKey_() {
        return key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLastup() {
        return lastup;
    }

    public void setLastup(Long lastup) {
        this.lastup = lastup;
    }

    public Long getLastdown() {
        return lastdown;
    }

    public void setLastdown(Long lastdown) {
        this.lastdown = lastdown;
    }

    public Integer getDcheckid() {
        return dcheckid;
    }

    public void setDcheckid(Integer dcheckid) {
        this.dcheckid = dcheckid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public Date getLastupDate() {
        if (lastup != null && lastup != 0) {
            return new Date(lastup);
        }
        return null;
    }

    public Date getLastUpDate() {
        if (lastdown != null && lastdown != 0) {
            return new Date(lastdown);
        }

        return null;
    }
}
