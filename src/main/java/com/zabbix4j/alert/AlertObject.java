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

package com.zabbix4j.alert;

import lombok.Data;

import java.util.Date;

/**
 * The following objects are directly related to the alert API.
 *
 * @author Suguru Yajima on 2014/05/21.
 */
@Data
public class AlertObject {

    private Integer alertid;
    private Integer actionid;
    private Integer alerttype;
    private Long clock;
    private String error;
    private Integer esc_step;
    private Integer eventid;
    private Integer mediatypeid;
    private String message;
    private Integer retries;
    private String sendto;
    private Integer status;
    private String subject;
    private Integer userid;

    public AlertObject() {
        super();
    }

    public Date getClockByDate() {
        if (clock != null && clock != 0) {
            return new Date(clock);
        }

        return null;
    }


    public static enum ALERT_TYPE {
        MESSAGE(0), REMOTE_COMMAND(1);

        private int value;

        private ALERT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum MESSAGE_STATUS {
        NOT_SENT(0), SENT(1), FAILED(2);

        private int value;

        private MESSAGE_STATUS(int value) {
            this.value = value;
        }
    }

    public static enum COMMAND_STATUS {
        RUN(1), UNAVAILABLE(2);

        private int value;

        private COMMAND_STATUS(int value) {
            this.value = value;
        }
    }
}
