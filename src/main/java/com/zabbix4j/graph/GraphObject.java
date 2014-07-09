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

package com.zabbix4j.graph;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
public class GraphObject {

    private Integer graphid;
    private Integer height;
    private String name;
    private Integer width;
    private Integer flags;
    private Integer graphtype;
    private Float percent_left;
    private Float percent_right;
    private Integer show_3d = GRAPH_SHOW_DIMENSION_TYPE.SHOW_IN_2D.value;
    private Integer show_legend = GRAPH_SHOW_TYPE.SHOW.value;
    private Integer show_work_period = GRAPH_SHOW_TYPE.SHOW.value;
    private Integer templateid;
    private Float yaxismax;
    private Float yaxismin;
    private Integer ymax_itemid;
    private Integer ymax_type = CALCULATION_METHOD.CALCULATED.value;
    private Integer ymin_itemid;
    private Integer ymin_type = CALCULATION_METHOD.CALCULATED.value;
    private List<GraphId> graphs;

    public List<GraphId> getGraphs() {
        return graphs;
    }

    public void setGraphs(List<GraphId> graphs) {
        this.graphs = graphs;
    }

    public Integer getYmin_type() {
        return ymin_type;
    }

    public void setYmin_type(Integer ymin_type) {
        this.ymin_type = ymin_type;
    }

    public Integer getYmin_itemid() {
        return ymin_itemid;
    }

    public void setYmin_itemid(Integer ymin_itemid) {
        this.ymin_itemid = ymin_itemid;
    }

    public Integer getYmax_type() {
        return ymax_type;
    }

    public void setYmax_type(Integer ymax_type) {
        this.ymax_type = ymax_type;
    }

    public Integer getYmax_itemid() {
        return ymax_itemid;
    }

    public void setYmax_itemid(Integer ymax_itemid) {
        this.ymax_itemid = ymax_itemid;
    }

    public Float getYaxismin() {
        return yaxismin;
    }

    public void setYaxismin(Float yaxismin) {
        this.yaxismin = yaxismin;
    }

    public Float getYaxismax() {
        return yaxismax;
    }

    public void setYaxismax(Float yaxismax) {
        this.yaxismax = yaxismax;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public Integer getShow_work_period() {
        return show_work_period;
    }

    public void setShow_work_period(Integer show_work_period) {
        this.show_work_period = show_work_period;
    }

    public Integer getShow_legend() {
        return show_legend;
    }

    public void setShow_legend(Integer show_legend) {
        this.show_legend = show_legend;
    }

    public Integer getShow_3d() {
        return show_3d;
    }

    public void setShow_3d(Integer show_3d) {
        this.show_3d = show_3d;
    }

    public Float getPercent_right() {
        return percent_right;
    }

    public void setPercent_right(Float percent_right) {
        this.percent_right = percent_right;
    }

    public Float getPercent_left() {
        return percent_left;
    }

    public void setPercent_left(Float percent_left) {
        this.percent_left = percent_left;
    }

    public Integer getGraphtype() {
        return graphtype;
    }

    public void setGraphtype(Integer graphtype) {
        this.graphtype = graphtype;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getGraphid() {
        return graphid;
    }

    public void setGraphid(Integer graphid) {
        this.graphid = graphid;
    }

    public static enum GRAPH_LAYOUT_TYPE {
        NORMAL(0), STACKED(1), PIE(2), EXPLODED(3);
        public int value;

        private GRAPH_LAYOUT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum GRAPH_SHOW_DIMENSION_TYPE {
        SHOW_IN_2D(0), SHOW_IN_3D(1);

        public int value;

        private GRAPH_SHOW_DIMENSION_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum GRAPH_SHOW_TYPE {
        HIDE(0), SHOW(1);

        public int value;

        private GRAPH_SHOW_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum CALCULATION_METHOD {
        CALCULATED(0), FIXED(1), ITEM(2);
        public int value;

        private CALCULATION_METHOD(int value) {
            this.value = value;
        }
    }

    public class GraphId {
        private Integer graphid;

        public Integer getGraphid() {
            return graphid;
        }

        public void setGraphid(Integer graphid) {
            this.graphid = graphid;
        }
    }
}
