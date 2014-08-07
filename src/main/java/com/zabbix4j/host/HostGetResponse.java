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

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.application.ApplicationObject;
import com.zabbix4j.discoveryrule.DiscoveryRuleObject;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.hostprototype.HostPrototypeInventoryObject;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.screen.ScreenObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.trigger.TriggerObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.webscenario.WebScenarioObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Response paramter for host.get
 * @author Suguru Yajima on 2014/05/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostGetResponse extends ZabbixApiResponse {

    private List<Result> result = new ArrayList<Result>();

    public HostGetResponse() {
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Result extends HostObject {
        private List<HostgroupObject> groups;
        private List<TemplateObject> parentTemplates;
        private List<ItemObject> items;
        private List<DiscoveryRuleObject> discoveries;
        private List<TriggerObject> triggers;
        private List<GraphObject> graphs;
        private List<WebScenarioObject> httpTests;
        private List<ApplicationObject> applications;
        private List<Macro> macros;
        private List<HostPrototypeInventoryObject> inventory;
        private List<HostInterfaceObject> interfaces;
        private List<ScreenObject> screens;
        private List<DiscoveryRuleObject> discoveryRule;
        private List<HostObject> hostDiscovery;
    }
}
