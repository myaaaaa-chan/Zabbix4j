package com.zabbix4j.graphprototype;

/**
 * Created by Suguru Yajima on 2014/06/01.
 */
public class GraphPrototypeObject {

    private Integer graphid;
    private Integer height;
    private String name;
    private Integer width;
    private Integer graphtype;
    private Float percent_left = 0f;
    private Float percent_right = 0f;
    private Integer show_3d = SHOW_3D.SHOW_IN_2D.value;
    private Integer show_legend = SHOW_LEGEND.SHOW.value;
    private Integer show_work_period = WORK_PERIOD.SHOW.value;
    private Integer templateid;
    private Float yaxismax;
    private Float yaxismin;

    public Integer getGraphid() {
        return graphid;
    }

    public void setGraphid(Integer graphid) {
        this.graphid = graphid;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getGraphtype() {
        return graphtype;
    }

    public void setGraphtype(Integer graphtype) {
        this.graphtype = graphtype;
    }

    public Float getPercent_left() {
        return percent_left;
    }

    public void setPercent_left(Float percent_left) {
        this.percent_left = percent_left;
    }

    public Float getPercent_right() {
        return percent_right;
    }

    public void setPercent_right(Float percent_right) {
        this.percent_right = percent_right;
    }

    public Integer getShow_3d() {
        return show_3d;
    }

    public void setShow_3d(Integer show_3d) {
        this.show_3d = show_3d;
    }

    public Integer getShow_legend() {
        return show_legend;
    }

    public void setShow_legend(Integer show_legend) {
        this.show_legend = show_legend;
    }

    public Integer getShow_work_period() {
        return show_work_period;
    }

    public void setShow_work_period(Integer show_work_period) {
        this.show_work_period = show_work_period;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public Float getYaxismax() {
        return yaxismax;
    }

    public void setYaxismax(Float yaxismax) {
        this.yaxismax = yaxismax;
    }

    public Float getYaxismin() {
        return yaxismin;
    }

    public void setYaxismin(Float yaxismin) {
        this.yaxismin = yaxismin;
    }

    public static enum GRAPH_PROTOTYPE_TYPE {
        NORMAIL(0), STACKED(1), PIE(2), EXPLODED(3);
        public int value;

        private GRAPH_PROTOTYPE_TYPE(int value) {
            this.value = value;
        }
    }

    public enum SHOW_3D {
        SHOW_IN_2D(0), SHOW_IN_3D(1);

        public int value;

        private SHOW_3D(int value) {
            this.value = value;
        }
    }

    public static enum SHOW_LEGEND {
        HIDE(0), SHOW(1);
        public int value;

        private SHOW_LEGEND(int value) {
            this.value = value;
        }
    }

    public static enum WORK_PERIOD {
        HIDE(0), SHOW(1);
        public int value;

        private WORK_PERIOD(int value) {
            this.value = value;
        }
    }

}
