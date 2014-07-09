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

package com.zabbix4j.trigger;

import com.zabbix4j.utils.ZbxListUtils;
import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/10.
 */
public class TriggerCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public TriggerCreateRequest() {
        setMethod("trigger.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends TriggerObject {

        private List<Dependencies> dependencieses;

        public Params() {
        }

        public List<Dependencies> getDependencieses() {
            return dependencieses;
        }

        public void setDependencieses(List<Dependencies> dependencieses) {
            this.dependencieses = dependencieses;
        }

        public void addDependencies(Integer triggerId) {

            dependencieses = ZbxListUtils.add(dependencieses, new Dependencies(triggerId));
        }
    }

    public class Dependencies {
        private Integer triggerid;

        public Dependencies() {
        }

        public Dependencies(Integer triggerid) {
            this.triggerid = triggerid;
        }

        public Integer getTriggerid() {
            return triggerid;
        }

        public void setTriggerid(Integer triggerid) {
            this.triggerid = triggerid;
        }
    }
}
