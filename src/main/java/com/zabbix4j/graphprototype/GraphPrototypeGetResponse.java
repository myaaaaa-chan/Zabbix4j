package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.item.ItemObject;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/03.
 */
public class GraphPrototypeGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public GraphPrototypeGetResponse() {
        super();
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends GraphPrototypeObject {
        private List<ItemObject> items;
        private List<GraphObject> gitems;
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;

        public List<ItemObject> getItems() {
            return items;
        }

        public void setItems(List<ItemObject> items) {
            this.items = items;
        }

        // TODO: implement a variable
        //private List<TemplateObject> templates;

        public List<GraphObject> getGitems() {
            return gitems;
        }

        public void setGitems(List<GraphObject> gitems) {
            this.gitems = gitems;
        }

        public List<HostgroupObject> getGroups() {
            return groups;
        }

        public void setGroups(List<HostgroupObject> groups) {
            this.groups = groups;
        }

        public List<HostObject> getHosts() {
            return hosts;
        }

        public void setHosts(List<HostObject> hosts) {
            this.hosts = hosts;
        }

        // TODO: implement a variable
        //private List<LLDRuleObject> discoveryRule;
    }
}
