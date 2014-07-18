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

package com.zabbix4j.graphitem;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Suguru Yajima on 2014/06/01.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GraphItemObject {

    private Integer gitemid;
    private String color;
    private Integer itemid;
    private Integer calc_fnc = CALC_FUNC.AVALAGE_VALUE.value;
    private Integer drawtype = DRAW_STYLE.LINE.value;
    private Integer graphid;
    private Integer sortorder = 0;
    private Integer type;
    private Integer yaxisside = Y_AXIS_SIDE.LEFT_SIDE.value;

    public GraphItemObject() {
    }


    public static enum CALC_FUNC {
        MINIMUM_VALUE(0), AVALAGE_VALUE(1), MAXIMUM_VALUE(2), LAST_VALUE(3);

        public int value;

        private CALC_FUNC(int value) {
            this.value = value;
        }
    }

    public static enum DRAW_STYLE {
        LINE(0), FILED_REGION(1), BOLD_LINE(2), DOT(3), DASHED_LINE(4), GRADIENT_LINE(5);
        public int value;

        private DRAW_STYLE(int value) {
            this.value = value;
        }
    }

    public static enum GRAPH_ITEM_TYPE {
        SIMPLE(0), GRAPH_SUM(2);
        public int value;

        private GRAPH_ITEM_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum Y_AXIS_SIDE {
        LEFT_SIDE(0), RIGHT_SIDE(1);
        public int value;

        private Y_AXIS_SIDE(int value) {
            this.value = value;
        }
    }
}
