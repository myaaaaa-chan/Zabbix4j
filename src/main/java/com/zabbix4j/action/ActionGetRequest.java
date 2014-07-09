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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima on 2014/05/20.
 */
public class ActionGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ActionGetRequest() {
        setMethod("action.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> actionids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> triggerids;
        private List<Integer> mediatypeids;
        private List<Integer> usrgrpids;
        private List<Integer> userids;
        private List<Integer> scriptids;

        public Params() {
        }

        public void addActionId(Integer id) {
            actionids = ZbxListUtils.add(actionids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addTriggerId(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public void addmediaTypeId(Integer id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
        }

        public void addUserGroupId(Integer id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
        }

        public void adduserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public List<Integer> getActionids() {
            return actionids;
        }

        public void setActionids(List<Integer> actionids) {
            this.actionids = actionids;
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

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public List<Integer> getMediatypeids() {
            return mediatypeids;
        }

        public void setMediatypeids(List<Integer> mediatypeids) {
            this.mediatypeids = mediatypeids;
        }

        public List<Integer> getUsrgrpids() {
            return usrgrpids;
        }

        public void setUsrgrpids(List<Integer> usrgrpids) {
            this.usrgrpids = usrgrpids;
        }

        public List<Integer> getUserids() {
            return userids;
        }

        public void setUserids(List<Integer> userids) {
            this.userids = userids;
        }

        public List<Integer> getScriptids() {
            return scriptids;
        }

        public void setScriptids(List<Integer> scriptids) {
            this.scriptids = scriptids;
        }

        public void addScriptId(Integer id) {
            scriptids = ZbxListUtils.add(scriptids, id);
        }
    }
}
