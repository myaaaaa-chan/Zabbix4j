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

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Suguru Yajima on 2014/06/01.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphPrototypeObject {

    private Integer graphid;
    private Integer height;
    private String name;
    private Integer width;
    private Integer graphtype;
    private Float percent_left;
    private Float percent_right;
    private Integer show_3d;
    private Integer show_legend;
    private Integer show_work_period;
    private Integer templateid;
    private Float yaxismax;
    private Float yaxismin;

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
