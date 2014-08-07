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

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request paramter for graphprototype.create
 *
 * @author Suguru Yajima on 2014/06/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeCreateRequest extends ZabbixApiRequest {

    private List<Params> params = new ArrayList<Params>();

    public GraphPrototypeCreateRequest() {
        setMethod("graphprototype.create");
    }

    public Params createParam() {
        Params param = new Params();
        params.add(param);
        return param;
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GraphPrototypeObject {
        private List<GraphItem> gitems;

        public Params() {
            super();
        }

        public void addGraphItem(GraphItem gitem) {
            gitems = ZbxListUtils.add(gitems, gitem);

        }
    }
}
