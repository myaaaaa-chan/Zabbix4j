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

package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/13.
 */
public class UserGroupCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public UserGroupCreateRequest() {
        setMethod("usergroup.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends UserGroupObject {
        private List<PermissionObject> rights;
        private List<Integer> userids;

        public Params() {
            super();
        }

        public void addPermission(Integer hostgroupId, Integer permission) {
            rights = ZbxListUtils.add(rights, new PermissionObject(hostgroupId, permission));
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public List<PermissionObject> getRights() {
            return rights;
        }

        public void setRights(List<PermissionObject> rights) {
            this.rights = rights;
        }

        public List<Integer> getUserids() {
            return userids;
        }

        public void setUserids(List<Integer> userids) {
            this.userids = userids;
        }
    }

}
