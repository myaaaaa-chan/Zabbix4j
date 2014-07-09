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

package com.zabbix4j;

import com.zabbix4j.action.Action;
import com.zabbix4j.alert.Alert;
import com.zabbix4j.application.Application;
import com.zabbix4j.configuration.Configuration;
import com.zabbix4j.discoveredhost.DiscoveredHosts;
import com.zabbix4j.discoveredservice.DiscoveredService;
import com.zabbix4j.discoveryrule.DiscoveryRule;
import com.zabbix4j.event.Event;
import com.zabbix4j.graph.Graph;
import com.zabbix4j.graphitem.GraphItem;
import com.zabbix4j.graphprototype.GraphPrototype;
import com.zabbix4j.history.History;
import com.zabbix4j.host.Host;
import com.zabbix4j.hostgroup.Hostgroup;
import com.zabbix4j.hostinteface.HostInterface;
import com.zabbix4j.hostprototype.HostPrototype;
import com.zabbix4j.iconmap.IconMap;
import com.zabbix4j.image.Image;
import com.zabbix4j.item.Item;
import com.zabbix4j.itemprototype.ItemPrototype;
import com.zabbix4j.itservice.ITService;
import com.zabbix4j.lldrule.LLDRule;
import com.zabbix4j.maintenance.Maintenance;
import com.zabbix4j.map.Map;
import com.zabbix4j.media.Media;
import com.zabbix4j.mediatype.MediaType;
import com.zabbix4j.proxy.Proxy;
import com.zabbix4j.screen.Screen;
import com.zabbix4j.screenitem.ScreenItem;
import com.zabbix4j.script.Script;
import com.zabbix4j.template.Template;
import com.zabbix4j.templatescreen.TemplateScreen;
import com.zabbix4j.templatescreenitem.TemplateScreenItem;
import com.zabbix4j.trigger.Trigger;
import com.zabbix4j.triggerprototype.TriggerPrototype;
import com.zabbix4j.user.User;
import com.zabbix4j.user.UserLoginRequest;
import com.zabbix4j.user.UserLoginResponse;
import com.zabbix4j.usergroup.UserGroup;
import com.zabbix4j.webscenario.WebScenario;


/**
 * Created by Suguru Yajima on 2014/04/25.
 */
public class ZabbixApi {

    private String apiUrl;

    private String auth;

    public ZabbixApi(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void login(String username, String password) throws ZabbixApiException {
        User user = new User(this.apiUrl);

        UserLoginRequest request = new UserLoginRequest();
        request.getParams().setPassword(password);
        request.getParams().setUser(username);

        UserLoginResponse response = user.login(request);

        this.auth = response.getResult();
    }

    public Hostgroup hostgroup() {

        return new Hostgroup(this.apiUrl, this.auth);
    }

    public Host host() {

        return new Host(this.apiUrl, this.auth);
    }

    public Item item() {

        return new Item(this.apiUrl, this.auth);
    }

    public HostInterface hostInterface() {

        return new HostInterface(this.apiUrl, this.auth);
    }

    public Trigger trigger() {

        return new Trigger(this.apiUrl, this.auth);
    }

    public UserGroup usergroup() {

        return new UserGroup(this.apiUrl, this.auth);
    }

    public Action action() {

        return new Action(this.apiUrl, this.auth);
    }

    public Alert alert() {

        return new Alert(this.apiUrl, this.auth);
    }

    public Application application() {

        return new Application(this.apiUrl, this.auth);
    }

    public Configuration configuration() {

        return new Configuration(this.apiUrl, this.auth);
    }

    public DiscoveredHosts discoverdHost() {

        return new DiscoveredHosts(this.apiUrl, this.auth);
    }

    public DiscoveredService discoveredService() {

        return new DiscoveredService(this.apiUrl, this.auth);
    }

    public DiscoveryRule discoveryRule() {

        return new DiscoveryRule(this.apiUrl, this.auth);
    }

    public Event event() {

        return new Event(this.apiUrl, this.auth);
    }

    public Graph graph() {

        return new Graph(this.apiUrl, this.auth);
    }

    public GraphItem graphItem() {

        return new GraphItem(this.apiUrl, this.auth);
    }

    public GraphPrototype graphPrototype() {

        return new GraphPrototype(this.apiUrl, this.auth);
    }

    public History history() {

        return new History(this.apiUrl, this.auth);
    }

    public LLDRule lldRule() {

        return new LLDRule(this.apiUrl, this.auth);
    }

    public HostPrototype hostPrototype() {

        return new HostPrototype(this.apiUrl, this.auth);
    }

    public IconMap iconMap() {

        return new IconMap(this.apiUrl, this.auth);
    }

    public Image image() {

        return new Image(this.apiUrl, this.auth);
    }

    public ItemPrototype itemPrototype() {

        return new ItemPrototype(this.apiUrl, this.auth);
    }

    public ITService itservice() {

        return new ITService(this.apiUrl, this.auth);
    }

    public Maintenance maintenance() {

        return new Maintenance(this.apiUrl, this.auth);
    }

    public Map map() {

        return new Map(this.apiUrl, this.auth);
    }

    public Media media() {

        return new Media(this.apiUrl, this.auth);
    }

    public MediaType mediaType() {

        return new MediaType(this.apiUrl, this.auth);
    }

    public Proxy proxy() {

        return new Proxy(this.apiUrl, this.auth);
    }

    public Screen screen() {

        return new Screen(this.apiUrl, this.auth);
    }

    public ScreenItem screenItem() {

        return new ScreenItem(this.apiUrl, this.auth);
    }

    public Script script() {

        return new Script(this.apiUrl, this.auth);
    }

    public Template template() {

        return new Template(this.apiUrl, this.auth);
    }

    public TemplateScreen templateScreen() {

        return new TemplateScreen(this.apiUrl, this.auth);
    }

    public TemplateScreenItem templateScreenItem() {

        return new TemplateScreenItem(this.apiUrl, this.auth);
    }

    public TriggerPrototype triggerPrototype() {

        return new TriggerPrototype(this.apiUrl, this.auth);
    }

    public WebScenario webscenario() {

        return new WebScenario(this.apiUrl, this.auth);
    }
}
