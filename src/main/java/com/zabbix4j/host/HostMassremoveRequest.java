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

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for host.massremove
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostMassremoveRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostMassremoveRequest() {
        setMethod("host.massremove");
    }
    
    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<Integer> hostids;
        private List<Integer> groupids;
        private List<HostInterfaceObject> interfaces;
        private List<Macro> macros;
        private List<Integer> templateids;
        private List<TemplateObject> templateids_clear;

        public Params() {
        }

        public void addTemplateClear(Integer id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templateids_clear = ZbxListUtils.add(templateids_clear, obj);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addHostGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostInterface(HostInterfaceObject obj) {
            interfaces = ZbxListUtils.add(interfaces, obj);
        }

        public void addMacro(Macro obj) {
            macros = ZbxListUtils.add(macros, obj);
        }

        public void addTemplate(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }
    }
}
