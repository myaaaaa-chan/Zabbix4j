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

import java.util.Date;
import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/28.
 */
public class EventGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public EventGetRequest() {
        setMethod("event.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

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

        public List<Integer> getEventids() {
            return eventids;
        }

        public void setEventids(List<Integer> eventids) {
            this.eventids = eventids;
        }

        public List<Integer> getGroupids() {
            return groupids;
        }

        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getObjectids() {
            return objectids;
        }

        public void setObjectids(List<Integer> objectids) {
            this.objectids = objectids;
        }

        public Integer getObject() {
            return object;
        }

        public void setObject(Integer object) {
            this.object = object;
        }

        public Boolean getAcknowledged() {
            return acknowledged;
        }

        public void setAcknowledged(Boolean acknowledged) {
            this.acknowledged = acknowledged;
        }

        public Integer getEventid_from() {
            return eventid_from;
        }

        public void setEventid_from(Integer eventid_from) {
            this.eventid_from = eventid_from;
        }

        public Integer getEventid_till() {
            return eventid_till;
        }

        public void setEventid_till(Integer eventid_till) {
            this.eventid_till = eventid_till;
        }

        public Integer getSource() {
            return source;
        }

        public void setSource(Integer source) {
            this.source = source;
        }

        public Long getTime_from() {
            return time_from;
        }

        public void setTime_from(Long time_from) {
            this.time_from = time_from;
        }

        public Long getTime_till() {
            return time_till;
        }

        public void setTime_till(Long time_till) {
            this.time_till = time_till;
        }

        public List<Integer> getValue() {
            return value;
        }

        public void setValue(List<Integer> value) {
            this.value = value;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectRelatedObject() {
            return selectRelatedObject;
        }

        public void setSelectRelatedObject(String selectRelatedObject) {
            this.selectRelatedObject = selectRelatedObject;
        }

        public String getSelect_alerts() {
            return select_alerts;
        }

        public void setSelect_alerts(String select_alerts) {
            this.select_alerts = select_alerts;
        }

        public String getSelect_acknowledges() {
            return select_acknowledges;
        }

        public void setSelect_acknowledges(String select_acknowledges) {
            this.select_acknowledges = select_acknowledges;
        }
    }
}
