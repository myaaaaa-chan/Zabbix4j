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

package com.zabbix4j.history;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * History objects differ depending on the item's type of information.</br>
 * They are created by the Zabbix server and cannot be modified via the API.
 * <p/>
 *
 * @author Suguru Yajima on 2014/06/03.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HistoryObject {

    private Long clock;
    private Integer itemid;
    private Integer ns;
    private String value;

    /**
     * Use only Text Hisotry
     */
    private String text;
    private Integer id;
    /**
     * Windows event log entry ID
     * Use Only Log Hisotry
     */
    private Integer logeventid;

    /**
     * Windows event log entry level.
     * Use Only Log Hisotry
     */
    private Integer severity;
    /**
     * Windows event log entry source.
     * Use Only Log Hisotry
     */
    private Integer source;
    /**
     * Windows event log entry time.
     * Use Only Log Hisotry
     */
    private Long timestamp;

    public HistoryObject() {
    }

    public Date getTimestampDate() {
        if (timestamp != null && timestamp != 0) {
            return new Date(timestamp);
        }

        return null;
    }

    public Date getClockDate() {
        if (clock != null && clock != 0) {
            return new Date(clock);
        }

        return null;
    }

    public static enum HISOTRY_OBJECT_TYPE {
        FLOAT(0), STRING(1), LOG(2), INTEGER(3), TEXT(4);
        public int value;

        private HISOTRY_OBJECT_TYPE(int value) {
            this.value = value;
        }
    }
}
