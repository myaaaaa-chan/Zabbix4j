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

package com.zabbix4j.media;

import com.zabbix4j.trigger.TriggerObject;

/**
 * @author Suguru Yajima
 */
public class MediaObject {

    private Integer mediaid;
    private Integer active;
    private Integer mediatypeid;
    private String period;
    private String sendto;
    /**
     * see TriggerObject.SEVERITY
     */
    private Integer severity;
    private Integer required;

    /**
     * Gets see TriggerObject.SEVERITY.
     *
     * @return Value of see TriggerObject.SEVERITY.
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * Sets new see TriggerObject.SEVERITY.
     *
     * @param severity New value of see TriggerObject.SEVERITY.
     */
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /**
     * Gets active.
     *
     * @return Value of active.
     */
    public Integer getActive() {
        return active;
    }

    /**
     * Sets new active.
     *
     * @param active New value of active.
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * Gets period.
     *
     * @return Value of period.
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets new period.
     *
     * @param period New value of period.
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Gets mediatypeid.
     *
     * @return Value of mediatypeid.
     */
    public Integer getMediatypeid() {
        return mediatypeid;
    }

    /**
     * Sets new mediatypeid.
     *
     * @param mediatypeid New value of mediatypeid.
     */
    public void setMediatypeid(Integer mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    /**
     * Gets sendto.
     *
     * @return Value of sendto.
     */
    public String getSendto() {
        return sendto;
    }

    /**
     * Sets new sendto.
     *
     * @param sendto New value of sendto.
     */
    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    /**
     * Gets required.
     *
     * @return Value of required.
     */
    public Integer getRequired() {
        return required;
    }

    /**
     * Sets new required.
     *
     * @param required New value of required.
     */
    public void setRequired(Integer required) {
        this.required = required;
    }

    /**
     * Gets mediaid.
     *
     * @return Value of mediaid.
     */
    public Integer getMediaid() {
        return mediaid;
    }

    /**
     * Sets new mediaid.
     *
     * @param mediaid New value of mediaid.
     */
    public void setMediaid(Integer mediaid) {
        this.mediaid = mediaid;
    }

    public static enum MEDIA_STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private MEDIA_STATUS(int value) {
            this.value = value;
        }
    }
}
