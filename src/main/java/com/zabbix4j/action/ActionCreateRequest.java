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

package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request paramter of action.create
 *
 * @author Suguru Yajima on 2014/05/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ActionCreateRequest extends ZabbixApiRequest {

    private List<Params> params = new ArrayList<Params>();

    public ActionCreateRequest() {
        setMethod("action.create");
    }

    public void add(Params param) {
        params = ZbxListUtils.add(params, param);
    }

    public Params createParam() {
        Params param = new Params();
        params.add(param);

        return param;
    }

    @Data
    public class Params extends ActionObject {

        private List<ActionCondition> conditions;
        private List<ActionOperation> operations;

        public Params() {
            super();
        }

        public void addActionConditon(ActionCondition ac) {
            conditions = ZbxListUtils.add(conditions, ac);
        }

        public void addActionOperation(ActionOperation ao) {
            operations = ZbxListUtils.add(operations, ao);
        }
    }
}
