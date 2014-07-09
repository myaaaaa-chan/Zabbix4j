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

package com.zabbix4j.event;

import java.util.Date;

/**
 * Created by Suguru Yajima on 2014/05/27.
 */
public class EventObject {

    private Integer eventid;
    private Integer acknowledged;
    private Long clock;
    private Integer ns;
    private Integer object;
    private Integer objectid;
    private Integer source;
    private Integer value;
    private Integer value_changed;

    public EventObject() {
    }

    public Date getClockDate() {
        if (clock != null && clock != 0) {
            return new Date(clock);
        }

        return null;
    }

    public static enum OBJECT_TYPE {
        TRIGGER(0), DISCOVERED_HOST(1), DISCOVERED_SERVICE(2), AUTO_REGISTERED_HOST(3), ITEM(4), LLD_RULE(5);

        public int value;

        private OBJECT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum EVENT_SOURCE {
        TRIGGER(0), DISCOVERY_RULE(1), AUTO_REGISTRATION(2), INTERNAL_EVENT(3);
        public int value;

        private EVENT_SOURCE(int value) {
            this.value = value;
        }
    }

    public static enum TRIGGER_EVENT {
        OK(0), PROBLEM(1);
        public int value;

        private TRIGGER_EVENT(int value) {
            this.value = value;
        }
    }

    public static enum DISCOVERY_EVENT {
        SERVICE_UP(0), SERVICE_DOWN(1), SERVICE_DISCOVERED(2), SERVICE_LOST(3);
        public int value;

        private DISCOVERY_EVENT(int value) {
            this.value = value;
        }
    }

    public static enum INTERNAL_EVENT {
        NORMAL_STATE(0), UNKNOWN_OR_NOT_SUPPORTED_STATE(1);
        public int value;

        private INTERNAL_EVENT(int value) {
            this.value = value;
        }
    }
}
