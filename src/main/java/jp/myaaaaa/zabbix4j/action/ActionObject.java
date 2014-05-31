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

package jp.myaaaaa.zabbix4j.action;

/**
 * Created by Suguru Yajima on 2014/05/19.
 */
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
    }

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public Integer getEsc_period() {
        return esc_period;
    }

    public void setEsc_period(Integer esc_period) {
        this.esc_period = esc_period;
    }

    public Integer getEvaltype() {
        return evaltype;
    }

    public void setEvaltype(Integer evaltype) {
        this.evaltype = evaltype;
    }

    public Integer getEventsource() {
        return eventsource;
    }

    public void setEventsource(Integer eventsource) {
        this.eventsource = eventsource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDef_longdata() {
        return def_longdata;
    }

    public void setDef_longdata(String def_longdata) {
        this.def_longdata = def_longdata;
    }

    public String getDef_shortdata() {
        return def_shortdata;
    }

    public void setDef_shortdata(String def_shortdata) {
        this.def_shortdata = def_shortdata;
    }

    public String getR_longdata() {
        return r_longdata;
    }

    public void setR_longdata(String r_longdata) {
        this.r_longdata = r_longdata;
    }

    public String getR_shortdata() {
        return r_shortdata;
    }

    public void setR_shortdata(String r_shortdata) {
        this.r_shortdata = r_shortdata;
    }

    public Integer getRecovery_msg() {
        return recovery_msg;
    }

    public void setRecovery_msg(Integer recovery_msg) {
        this.recovery_msg = recovery_msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
