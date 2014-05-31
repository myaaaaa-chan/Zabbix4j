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

package jp.myaaaaa.zabbix4j.action;

import jp.myaaaaa.zabbix4j.ZabbixApiRequest;
import jp.myaaaaa.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/19.
 */
public class ActionCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ActionCreateRequest() {
        setMethod("action.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends ActionObject {

        private List<ActionCondition> conditions;
        private List<ActionOperation> operations;

        public Params() {
        }

        public void addActionConditon(ActionCondition ac) {
            conditions = ZbxListUtils.add(conditions, ac);
        }

        public List<ActionCondition> getConditions() {
            return conditions;
        }

        public void setConditions(List<ActionCondition> conditions) {
            this.conditions = conditions;
        }

        public List<ActionOperation> getOperations() {
            return operations;
        }

        public void setOperations(List<ActionOperation> operations) {
            this.operations = operations;
        }

        public void addActionOperation(ActionOperation ao) {
            operations = ZbxListUtils.add(operations, ao);

        }
    }
}
