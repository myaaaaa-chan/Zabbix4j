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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/21.
 */
public class AlertGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public AlertGetRequest() {
        setMethod("alert.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {

        private List<Integer> alertids;
        private List<Integer> actionids;
        private List<Integer> eventids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> mediatypeids;
        private List<Integer> triggerids;
        private List<Integer> userids;
        private Long time_from;
        private Long time_till;
        private String selectHosts;
        private String selectMediatypes;
        private String selectUsers;

        public Params() {
            super();
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectMediatypes() {
            return selectMediatypes;
        }

        public void setSelectMediatypes(String selectMediatypes) {
            this.selectMediatypes = selectMediatypes;
        }

        public String getSelectUsers() {
            return selectUsers;
        }

        public void setSelectUsers(String selectUsers) {
            this.selectUsers = selectUsers;
        }

        public void addAlertId(Integer id) {
            alertids = ZbxListUtils.add(alertids, id);
        }

        public void addActionId(Integer id) {
            actionids = ZbxListUtils.add(actionids, id);
        }

        public void addEventId(Integer id) {
            eventids = ZbxListUtils.add(eventids, id);
        }

        public void add(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public List<Integer> getAlertids() {
            return alertids;
        }

        public void setAlertids(List<Integer> alertids) {
            this.alertids = alertids;
        }

        public List<Integer> getActionids() {
            return actionids;
        }

        public void setActionids(List<Integer> actionids) {
            this.actionids = actionids;
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

        public List<Integer> getMediatypeids() {
            return mediatypeids;
        }

        public void setMediatypeids(List<Integer> mediatypeids) {
            this.mediatypeids = mediatypeids;
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public List<Integer> getUserids() {
            return userids;
        }

        public void setUserids(List<Integer> userids) {
            this.userids = userids;
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

        public void addMediaTypeId(Integer id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }
    }
}
