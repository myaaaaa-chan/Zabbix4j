package com.zabbix4j.script;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ScriptGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScriptGetRequest() {
        setMethod("script.get");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> scriptids;
        private List<Integer> usrgrpids;
        private String selectGroups;
        private String selectHosts;

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addScriptId(Integer id) {
            scriptids = ZbxListUtils.add(scriptids, id);
        }

        public void addUsrGroupId(Integer id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
        }

        /**
         * Gets scriptids.
         *
         * @return Value of scriptids.
         */
        public List<Integer> getScriptids() {
            return scriptids;
        }

        /**
         * Sets new scriptids.
         *
         * @param scriptids New value of scriptids.
         */
        public void setScriptids(List<Integer> scriptids) {
            this.scriptids = scriptids;
        }

        /**
         * Gets usrgrpids.
         *
         * @return Value of usrgrpids.
         */
        public List<Integer> getUsrgrpids() {
            return usrgrpids;
        }

        /**
         * Sets new usrgrpids.
         *
         * @param usrgrpids New value of usrgrpids.
         */
        public void setUsrgrpids(List<Integer> usrgrpids) {
            this.usrgrpids = usrgrpids;
        }

        /**
         * Gets groupids.
         *
         * @return Value of groupids.
         */
        public List<Integer> getGroupids() {
            return groupids;
        }

        /**
         * Sets new groupids.
         *
         * @param groupids New value of groupids.
         */
        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        /**
         * Gets hostids.
         *
         * @return Value of hostids.
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new hostids.
         *
         * @param hostids New value of hostids.
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        /**
         * Gets selectHosts.
         *
         * @return Value of selectHosts.
         */
        public String getSelectHosts() {
            return selectHosts;
        }

        /**
         * Sets new selectHosts.
         *
         * @param selectHosts New value of selectHosts.
         */
        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        /**
         * Gets selectGroups.
         *
         * @return Value of selectGroups.
         */
        public String getSelectGroups() {
            return selectGroups;
        }

        /**
         * Sets new selectGroups.
         *
         * @param selectGroups New value of selectGroups.
         */
        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }
    }
}
