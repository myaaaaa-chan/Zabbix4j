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

import jp.myaaaaa.zabbix4j.GetRequestCommonParams;
import jp.myaaaaa.zabbix4j.utils.ZbxListUtils;
import jp.myaaaaa.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostGetRequest() {
        setMethod("host.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> groupids;
        private List<Integer> applicationids;
        private List<Integer> dserviceids;
        private List<Integer> graphids;
        private List<Integer> hostids;
        private List<Integer> httptestids;
        private List<Integer> interfaceids;
        private List<Integer> itemids;
        private List<Integer> maintenanceids;
        private boolean monitored_hosts;
        private boolean proxy_hosts;
        private List<Integer> proxyids;
        private boolean templated_hosts;
        private List<Integer> templateids;
        private List<Integer> triggerids;

        public Params() {
        }

        public void setApplicationId(int id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public List<Integer> getGroupids() {
            return groupids;
        }

        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        public List<Integer> getApplicationids() {
            return applicationids;
        }

        public void setApplicationids(List<Integer> applicationids) {
            this.applicationids = applicationids;
        }

        public List<Integer> getDserviceids() {
            return dserviceids;
        }

        public void setDserviceids(List<Integer> dserviceids) {
            this.dserviceids = dserviceids;
        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getHttptestids() {
            return httptestids;
        }

        public void setHttptestids(List<Integer> httptestids) {
            this.httptestids = httptestids;
        }

        public List<Integer> getInterfaceids() {
            return interfaceids;
        }

        public void setInterfaceids(List<Integer> interfaceids) {
            this.interfaceids = interfaceids;
        }

        public List<Integer> getItemids() {
            return itemids;
        }

        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        public List<Integer> getMaintenanceids() {
            return maintenanceids;
        }

        public void setMaintenanceids(List<Integer> maintenanceids) {
            this.maintenanceids = maintenanceids;
        }

        public List<Integer> getProxyids() {
            return proxyids;
        }

        public void setProxyids(List<Integer> proxyids) {
            this.proxyids = proxyids;
        }

        public List<Integer> getTemplateids() {
            return templateids;
        }

        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public boolean isProxy_hosts() {

            return proxy_hosts;
        }

        public void setProxy_hosts(boolean proxy_hosts) {
            this.proxy_hosts = proxy_hosts;
        }

        public boolean isMonitored_hosts() {
            return monitored_hosts;
        }

        public void setMonitored_hosts(boolean monitored_hosts) {
            this.monitored_hosts = monitored_hosts;
        }

        public boolean isTemplated_hosts() {
            return templated_hosts;
        }

        public void setTemplated_hosts(boolean templated_hosts) {
            this.templated_hosts = templated_hosts;
        }

        public void setDserviceId(int id) {
            dserviceids = ZbxListUtils.add(dserviceids, id);
        }

        public void setGraphId(int id) {
            graphids = ZbxListUtils.add(graphids, id);
        }
    }

}
