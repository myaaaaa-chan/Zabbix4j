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

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
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

    public String getSelectConditions() {
        return selectConditions;
    }

    public void setSelectConditions(String selectConditions) {
        this.selectConditions = selectConditions;
    }

    public String getSelectOperations() {
        return selectOperations;
    }

    public void setSelectOperations(String selectOperations) {
        this.selectOperations = selectOperations;
    }

    public Boolean getCountOutput() {
        return countOutput;
    }

    public void setCountOutput(Boolean countOutput) {
        this.countOutput = countOutput;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getExcludeSearch() {
        return excludeSearch;
    }

    public void setExcludeSearch(Boolean excludeSearch) {
        this.excludeSearch = excludeSearch;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getPreservekeys() {
        return preservekeys;
    }

    public void setPreservekeys(Boolean preservekeys) {
        this.preservekeys = preservekeys;
    }

    public Boolean getSearchByAny() {
        return searchByAny;
    }

    public void setSearchByAny(Boolean searchByAny) {
        this.searchByAny = searchByAny;
    }

    public Boolean getSearchWildcardsEnabled() {
        return searchWildcardsEnabled;
    }

    public void setSearchWildcardsEnabled(Boolean searchWildcardsEnabled) {
        this.searchWildcardsEnabled = searchWildcardsEnabled;
    }

    public Integer getLimitSelects() {
        return limitSelects;
    }

    public void setLimitSelects(Integer limitSelects) {
        this.limitSelects = limitSelects;
    }

    public void addSortField(String field) {
        sortfield = ZbxListUtils.add(sortfield, field);
    }

    public void setNodeId(int id) {
        nodeids = ZbxListUtils.add(nodeids, id);
    }

    public void setSortField(String field) {
        sortfield = ZbxListUtils.add(sortfield, field);
    }

    public Boolean isCountOutput() {
        return countOutput;
    }

    public Boolean isEditable() {
        return editable;
    }

    public Boolean isExcludeSearch() {
        return excludeSearch;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Integer> getNodeids() {
        return nodeids;
    }

    public void setNodeids(List<Integer> nodeids) {
        this.nodeids = nodeids;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Boolean isPreservekeys() {
        return preservekeys;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Boolean isSearchByAny() {
        return searchByAny;
    }

    public Boolean isSearchWildcardsEnabled() {
        return searchWildcardsEnabled;
    }

    public List<String> getSortfield() {
        return sortfield;
    }

    public void setSortfield(List<String> sortfield) {
        this.sortfield = sortfield;
    }

    public List<SortOrder> getSortorder() {
        return sortorder;
    }

    public void setSortorder(List<SortOrder> sortorder) {
        this.sortorder = sortorder;
    }

    public String getStartSearch() {
        return startSearch;
    }

    public void setStartSearch(String startSearch) {
        this.startSearch = startSearch;
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
}
