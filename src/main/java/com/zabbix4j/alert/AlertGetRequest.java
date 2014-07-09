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
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request parameter for alert.get
 *
 * @author Suguru Yajima on 2014/05/21.
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AlertGetRequest extends ZabbixApiRequest {
    private List<Params> params = new ArrayList<Params>();

    public AlertGetRequest() {
        setMethod("alert.get");
    }

    public Params createParam() {
        Params param = new Params();
        params.add(param);

        return param;
    }

    @Data
    @EqualsAndHashCode(callSuper=false)
    public class Params extends GetRequestCommonParams {

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
        private List<Integer> alertids;


        public Params() {
            super();
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

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
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
