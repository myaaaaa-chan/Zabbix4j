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

package com.zabbix4j.host;

import com.google.gson.annotations.SerializedName;
import com.zabbix4j.utils.ZbxListUtils;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostUpdateRequest() {
        setMethod("host.update");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends HostObject {

        private List<Group> groups;
        private List<HostInterfaceObject> interfaces;
        private List<Integer> templates;
        @SerializedName("templates_clear")
        private List<UnLinkTemplate> templatesClear;
        private List<Macro> macros;

        public Params() {
        }

        public void setUnLinkTemplate(int templateId) {
            if (templatesClear == null) {
                templatesClear = new ArrayList<UnLinkTemplate>();
            }
            templatesClear.add(new UnLinkTemplate(templateId));
        }

        public List<UnLinkTemplate> getTemplatesClear() {
            return templatesClear;
        }

        public void setTemplatesClear(List<UnLinkTemplate> templatesClear) {
            this.templatesClear = templatesClear;
        }

        public void setGroup(int groupId) {
            if (this.groups == null) {
                this.groups = new ArrayList<Group>();
            }
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

        public void setInteface(HostInterfaceObject hostInterface) {
            interfaces = ZbxListUtils.add(interfaces, hostInterface);
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

        public void setMacro(Macro macro) {
            macros = ZbxListUtils.add(macros, macro);
        }

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

    public class UnLinkTemplate {
        private int templateid;

        public UnLinkTemplate(int templateId) {
        }

        public int getTemplateid() {
            return templateid;
        }

        public void setTemplateid(int templateid) {
            this.templateid = templateid;
        }
    }
}
