package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.usergroup.UserGroupObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScriptGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public ScriptGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ScriptObject {

        private List<UserGroupObject> groups;
        private List<HostObject> hosts;

        /**
         * Gets groups.
         *
         * @return Value of groups.
         */
        public List<UserGroupObject> getGroups() {
            return groups;
        }

        /**
         * Sets new groups.
         *
         * @param groups New value of groups.
         */
        public void setGroups(List<UserGroupObject> groups) {
            this.groups = groups;
        }

        /**
         * Gets hosts.
         *
         * @return Value of hosts.
         */
        public List<HostObject> getHosts() {
            return hosts;
        }

        /**
         * Sets new hosts.
         *
         * @param hosts New value of hosts.
         */
        public void setHosts(List<HostObject> hosts) {
            this.hosts = hosts;
        }
    }
}
