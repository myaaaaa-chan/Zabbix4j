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

package com.zabbix4j.triggerprototype;

/**
 * @author Suguru Yajima
 */
public class TriggerPrototypeObject {
    private Integer triggerid;
    private String description;
    private String expression;
    private String comments;
    private Integer priority;
    private Integer status;
    private Integer templateid;
    private Integer type;
    private String url;

    /**
     * Gets comments.
     *
     * @return Value of comments.
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets new comments.
     *
     * @param comments New value of comments.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets expression.
     *
     * @return Value of expression.
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets new expression.
     *
     * @param expression New value of expression.
     */
    public void setExpression(String expression) {
        this.expression = expression;
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
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets triggerid.
     *
     * @return Value of triggerid.
     */
    public Integer getTriggerid() {
        return triggerid;
    }

    /**
     * Sets new triggerid.
     *
     * @param triggerid New value of triggerid.
     */
    public void setTriggerid(Integer triggerid) {
        this.triggerid = triggerid;
    }

    /**
     * Gets url.
     *
     * @return Value of url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets new url.
     *
     * @param url New value of url.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets templateid.
     *
     * @return Value of templateid.
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new templateid.
     *
     * @param templateid New value of templateid.
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    /**
     * Gets priority.
     *
     * @return Value of priority.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets new priority.
     *
     * @param priority New value of priority.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    public static enum SERVERITY {
        NOT_CLASSIFIED(0), INFORMATION8(1), WARNING(2), AVERAGE(3), HIGH(4), DISASTER(5);
        public int value;

        private SERVERITY(int value) {
            this.value = value;
        }
    }

    public static enum STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }

    public static enum GENERATE_TYPE {
        DO_NOT_GENERATE_MULTIPLE_EVENTS(0), GENERATE_MULTIPLE_EVENTS(1);
        public int value;

        private GENERATE_TYPE(int value) {
            this.value = value;
        }
    }
}
