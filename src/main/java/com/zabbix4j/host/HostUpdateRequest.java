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
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request parameter for host.update
 *
 * @author Suguru Yajima on 2014/05/01.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostUpdateRequest() {
        setMethod("host.update");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
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
            templatesClear = ZbxListUtils.add(templatesClear, new UnLinkTemplate(templateId));
        }

        public void setGroup(int groupId) {
            Group group = new Group();
            group.setGroupid(groupId);
            groups = ZbxListUtils.add(groups, group);
        }

        public void setInteface(HostInterfaceObject hostInterface) {
            interfaces = ZbxListUtils.add(interfaces, hostInterface);
        }

        public void addMacro(Macro macro) {
            macros = ZbxListUtils.add(macros, macro);
        }
    }
}
