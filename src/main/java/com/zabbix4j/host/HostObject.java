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

package com.zabbix4j.host;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Suguru Yajima on 2014/05/08.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostObject {

    private Integer hostid;
    private Integer proxy_hostid;
    private String host;
    private Integer status;
    private Integer disable_until;
    private String error;
    private Integer available;
    private Integer errors_from;
    private Integer lastaccess;
    private Integer ipmi_authtype;
    private Integer ipmi_privilege;
    private String ipmi_username;
    private String ipmi_password;
    private Integer ipmi_disable_until;
    private Integer ipmi_available;
    private Integer snmp_disable_until;
    private Integer snmp_available;
    private Integer maintenanceid;
    private Integer maintenance_status;
    private Integer maintenance_type;
    private Integer maintenance_from;
    private Integer ipmi_errors_from;
    private Integer snmp_errors_from;
    private String ipmi_error;
    private String snmp_error;
    private Integer jmx_disable_until;
    private Integer jmx_available;
    private Integer jmx_errors_from;
    private String jmx_error;
    private String name;

    public HostObject() {
    }
}
