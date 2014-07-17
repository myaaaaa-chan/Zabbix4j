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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * Request paramter for event.get
 * @author Suguru Yajima on 2014/05/28.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EventGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public EventGetRequest() {
        setMethod("event.get");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GetRequestCommonParams {
        private List<Integer> eventids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> objectids;
        private Integer object = 0;
        private Boolean acknowledged;
        private Integer eventid_from;
        private Integer eventid_till;
        private Integer source;
        private Long time_from;
        private Long time_till;
        private List<Integer> value;
        private String selectHosts;
        private String selectRelatedObject;
        private String select_alerts;
        private String select_acknowledges;

        public Params() {
            super();
        }

        public void addEventId(Integer id) {
            eventids = ZbxListUtils.add(eventids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addObjectId(Integer id) {
            objectids = ZbxListUtils.add(objectids, id);
        }

        public Date getTimeFromDate() {
            if (time_from != null && time_from != 0) {
                return new Date(time_from);
            }
            return null;
        }

        public Date getTimeTillDate() {
            if (time_till != null && time_till != 0) {
                return new Date(time_till);
            }
            return null;
        }
    }
}
