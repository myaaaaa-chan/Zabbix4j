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

package jp.myaaaaa.zabbix4j.graph;

import jp.myaaaaa.zabbix4j.GetRequestCommonParams;
import jp.myaaaaa.zabbix4j.ZabbixApiRequest;
import jp.myaaaaa.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphGetRequest extends ZabbixApiRequest{

    public GraphGetRequest() {
        setMethod("graph.get");
    }

    public class Params extends GetRequestCommonParams {

        public Params() {
            super();
        }

        private List<Integer> graphids;
        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        private List<Integer> groupids;
        public void addGropuId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        private List<Integer> templateids;
        public void addtempateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        private List<Integer> hostids;
        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        private List<Integer> itemids;
        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        private Boolean templated;
        private Boolean inherited;
        private Boolean expandName;

        private Boolean selectGroups;
        private Boolean selectTemplates;
        private Boolean selectHosts;
        private Boolean selectItems;
        private Boolean selectGraphItems;
        private Boolean selectDiscoveryRule;

        private String filter;



    }
}
