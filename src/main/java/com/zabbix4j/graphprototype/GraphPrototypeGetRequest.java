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

package com.zabbix4j.graphprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for graphprototype.get
 *
 * @author Suguru Yajima on 2014/06/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public GraphPrototypeGetRequest() {
        setMethod("graphprototype.get");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GetRequestCommonParams {

        private List<Integer> discoveryids;
        private List<Integer> graphids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private List<Integer> templateids;
        private Boolean inherited;
        private Boolean templated;
        private String selectDiscoveryRule;
        private String selectGraphItems;
        private String selectGroups;
        private String selectHosts;
        private String selectItems;
        private String selectTemplates;
        private String filter;

        public void addDiscoveryId(Integer id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

    }
}
