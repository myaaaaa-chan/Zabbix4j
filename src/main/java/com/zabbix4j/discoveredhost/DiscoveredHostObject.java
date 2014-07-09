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
public class DiscoveredHostObject {

    private Integer dhostid;
    private Integer druleid;
    private Long lastdown;
    private Long lastup;
    private Integer status;

    public DiscoveredHostObject() {
    }

    public Date getLastDownDate() {
        if (lastdown != null && lastdown != 0) {
            return new Date(lastdown);
        }

        return null;
    }

    public Integer getDhostid() {
        return dhostid;
    }

    public void setDhostid(Integer dhostid) {
        this.dhostid = dhostid;
    }

    public Integer getDruleid() {
        return druleid;
    }

    public void setDruleid(Integer druleid) {
        this.druleid = druleid;
    }

    public Long getLastdown() {
        return lastdown;
    }

    public void setLastdown(Long lastdown) {
        this.lastdown = lastdown;
    }

    public Long getLastup() {
        return lastup;
    }

    public void setLastup(Long lastup) {
        this.lastup = lastup;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastUpDate() {
        if (lastup != null && lastup != 0) {
            return new Date(lastup);
        }

        return null;

    }

    public static enum STAUS {

        HOST_UP(0), HOST_DOWN(1);

        public int value;

        private STAUS(int value) {
            this.value = value;
        }
    }
}
