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

package jp.myaaaaa.zabbix4j;

import jp.myaaaaa.zabbix4j.action.Action;
import jp.myaaaaa.zabbix4j.alert.Alert;
import jp.myaaaaa.zabbix4j.application.Application;
import jp.myaaaaa.zabbix4j.configuration.Configuration;
import jp.myaaaaa.zabbix4j.discoveredhost.DiscoveredHosts;
import jp.myaaaaa.zabbix4j.discoveredservice.DiscoveredService;
import jp.myaaaaa.zabbix4j.discoveryrule.DiscoveryRule;
import jp.myaaaaa.zabbix4j.event.Event;
import jp.myaaaaa.zabbix4j.graph.Graph;
import jp.myaaaaa.zabbix4j.graphitem.GraphItem;
import jp.myaaaaa.zabbix4j.host.Host;
import jp.myaaaaa.zabbix4j.hostgroup.Hostgroup;
import jp.myaaaaa.zabbix4j.hostinteface.HostInterface;
import jp.myaaaaa.zabbix4j.item.Item;
import jp.myaaaaa.zabbix4j.trigger.Trigger;
import jp.myaaaaa.zabbix4j.user.User;
import jp.myaaaaa.zabbix4j.user.UserLoginRequest;
import jp.myaaaaa.zabbix4j.user.UserLoginResponse;
import jp.myaaaaa.zabbix4j.usergroup.UserGroup;


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


}
