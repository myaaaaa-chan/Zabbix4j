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

package jp.myaaaaa.zabbix4j.host;

import jp.myaaaaa.zabbix4j.ZabbixApiRequest;
import jp.myaaaaa.zabbix4j.hostinteface.HostInterfaceObject;
import jp.myaaaaa.zabbix4j.usermacro.Macro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suguru Yajima on 2014/04/30.
 */
public class HostCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostCreateRequest() {
        setMethod("host.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Group {

        private int groupid;

        public Group() {
        }

        public int getGroupid() {
            return groupid;
        }

        public void setGroupid(int groupid) {
            this.groupid = groupid;
        }
    }

    public class Params extends HostObject {

        private List<Group> groups = new ArrayList<Group>();
        private List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
        private List<Integer> templates = new ArrayList<Integer>();
        private List<Macro> macros = new ArrayList<Macro>();

        public Params() {
        }

        public void setGroup(int groupId) {
            Group group = new Group();
            group.setGroupid(groupId);
            this.groups.add(group);
        }

        public List<Group> getGroups() {
            return groups;
        }

        public void setGroups(List<Group> groups) {
            this.groups = groups;
        }

        public List<HostInterfaceObject> getInterfaces() {
            return interfaces;
        }

        public void setInterfaces(List<HostInterfaceObject> interfaces) {
            this.interfaces = interfaces;
        }

        public List<Integer> getTemplates() {
            return templates;
        }

        public void setTemplates(List<Integer> templates) {
            this.templates = templates;
        }

        public List<Macro> getMacros() {
            return macros;
        }

        public void setMacros(List<Macro> macros) {
            this.macros = macros;
        }

    }

}
