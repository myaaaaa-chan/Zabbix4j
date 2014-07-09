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

/**
 * The action condition object defines a condition that must be met to perform the configured action operations.It has the following properties.
 * <br>
 * see Zabbix Documentation
 * <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/action/object">Action condition</a>
 *
 * @author Suguru Yajima on 2014/05/16.
 */
@Data
public class ActionCondition {

    public ActionCondition() {
        super();
    }

    private Integer conditionid;
    private Integer conditiontype;
    private String value;
    private Integer actionid;
    private Integer operator;

    public static enum CONDITION_TYPE_TRIGGER {
        HOST_GROUP(0), HOST(1), TRIGGER(2), TRIGGER_NAMW(3), TRIIGER_SERVERITY(4), TRIGGER_VALUE(5), TIME_PERIOD(6), HOST_TEMPLATE(13), APPLICATION(15), MAINTENANCE_STATUS(16), NODE(17);

        public int value;

        private CONDITION_TYPE_TRIGGER(int value) {
            this.value = value;
        }
    }

    public static enum CONDITION_TYPE_DISCOVERY {
        HOST_IP(7), DISCOVERED_SERVVCE_TYPE(8), DISCOVERED_SERVICE_PORT(9), DISCOVERY_STATUS(10), UPTIME_OR_DOWNTIME_DURATION(11), RECEIVED_VALUE(12), DISCOVERY_RULE(18), DISCOVERY_CHECK(19), PROXY(20), DISCOVERY_OBJECT(21);
        public int value;

        private CONDITION_TYPE_DISCOVERY(int value) {
            this.value = value;
        }
    }

    public static enum CONDITION_AUTO_REGISTRATION {
        PROXY(20), HOST_NAME(22);

        public int value;

        private CONDITION_AUTO_REGISTRATION(int value) {
            this.value = value;
        }
    }

    /**
     * Possible values:
     * 0 - (default) =;
     * 1 - <>;
     * 2 - like;
     * 3 - not like;
     * 4 - in;
     * 5 - >=;
     * 6 - <=;
     * 7 - not it.
     */
    public static enum CONDITION_OPERATOR {
        EQUAL(0), NOT(1), LIKE(2), NOT_LIKE(3), IN(4), LESS_THAN(5), MORE_THAN(6), NOT_IT(7);

        public int value;

        private CONDITION_OPERATOR(int value) {
            this.value = value;
        }
    }
}
