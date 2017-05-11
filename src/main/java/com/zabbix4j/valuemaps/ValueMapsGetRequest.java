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

package com.zabbix4j.valuemaps;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.utils.ZbxListUtils;
import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * Created by 0312birdzhang on 2016/02/19.
 */
public class ValueMapsGetRequest extends ZabbixApiRequest {

    private Params params = new Params();
    public ValueMapsGetRequest() {
        setMethod("valuemap.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    
    public class Params extends GetRequestCommonParams {
        private List<String> valuemapids;
        private String selectMappings;
        
        public void addValueMapId(String id) {
        	valuemapids = ZbxListUtils.add(valuemapids, id);
        }

        public List<String> getValuemapids() {
            return valuemapids;
        }

        public void setValuemapids(List<String> valuemapids) {
            this.valuemapids = valuemapids;
        }

		public String getSelectMappings() {
			return selectMappings;
		}

		public void setSelectMappings(String selectMappings) {
			this.selectMappings = selectMappings;
		}

       
    }
}
