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

package com.zabbix4j.action;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

/**
 * The following objects are directly related to the action API.<br>
 * see Zabbix Documentation
 * <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/action/object">ActionObject</a>
 *
 * @author Suguru Yajima on 2014/05/19.
 */
@Data
public class ActionObject {

    private Integer actionid;
    private Integer esc_period;
    private Integer evaltype;
    private Integer eventsource;
    private String name;
    private String def_longdata;
    private String def_shortdata;
    private String r_longdata;
    private String r_shortdata;
    private Integer recovery_msg;
    private Integer status;

    public ActionObject() {
        super();
    }
}
