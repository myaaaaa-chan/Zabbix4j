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

package com.zabbix4j;

import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;

import java.util.List;

/**
 * @author uguru Yajima on 2014/05/02.
 */
@Data
public class GetRequestCommonParams {
    private Boolean countOutput;
    private Boolean editable;
    private Boolean excludeSearch;
    private Integer limit;
    private List<Integer> nodeids;
    private String output = "extend";
    private Boolean preservekeys;
    private String search;
    private Boolean searchByAny;
    private Boolean searchWildcardsEnabled;
    private List<SortOrder> sortorder;
    private String startSearch;
    private Integer limitSelects;
    private List<String> sortfield;
    private String selectConditions;
    private String selectOperations;

    public GetRequestCommonParams() {
    }

    public void setSortOrder(SortOrder order) {
        sortorder = ZbxListUtils.add(sortorder, order);
    }

    public class SortOrder {
        private String sortfield;
        private String order;

        private SortOrder() {
        }

        public String getSortfield() {
            return sortfield;
        }

        public void setSortfield(String sortfield) {
            this.sortfield = sortfield;
        }
    }

    public class Filter {
        private List<String> name;

        public List<String> getName() {
            return name;
        }

        public void setName(List<String> name) {
            this.name = name;
        }

        public void addName(String name) {
            this.name = ZbxListUtils.add(this.name, name);

        }
    }
}
