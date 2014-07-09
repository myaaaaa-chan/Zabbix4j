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

import java.util.Date;

/**
 * Created by Suguru Yajima on 2014/05/09.
 */
public class TriggerObject {

    private Integer triggerid;
    private String description;
    private String expression;
    private String comments;
    private String error;
    private Integer flags;
    private Long lastchange;
    private Integer priority;
    private Integer status;
    private Integer templateid;
    private Integer type;
    private String url;
    private Integer value;
    private Integer value_flags;

    public TriggerObject() {
    }

    public Integer getTriggerid() {
        return triggerid;
    }

    public void setTriggerid(Integer triggerid) {
        this.triggerid = triggerid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Long getLastchange() {
        return lastchange;
    }

    public void setLastchange(Long lastchange) {
        this.lastchange = lastchange;
    }

    public Date getLastchangeDate() {
        if (lastchange != 0) {
            return new Date(lastchange);
        }

        return null;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue_flags() {
        return value_flags;
    }

    public void setValue_flags(Integer value_flags) {
        this.value_flags = value_flags;
    }

    public static enum SEVERITY {
        NOT_CLASSIFIED(0), INFORMATION(1), WARNING(2), AVERAGE(3), HIGH(4), DISASTER(5);
        public int value;

        private SEVERITY(int value) {
            this.value = value;
        }
    }
}
