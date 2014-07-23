package com.zabbix4j.history;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * Request paramter for history.get
 *
 * @author Suguru Yajima on 2014/06/03.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HistoryGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HistoryGetRequest() {
        setMethod("history.get");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params extends GetRequestCommonParams {
        private Integer history = HistoryObject.HISOTRY_OBJECT_TYPE.INTEGER.value;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private Long time_from;
        private Long time_till;

        public Params() {
            super();
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(hostids, id);
        }

        public Date getTimeFromDate() {
            if (time_from != null && time_from != 0) {
                return new Date(time_from);
            }
            return null;
        }

        public Date getTimeTillDate() {
            if (time_till != null && time_till != 0) {
                return new Date(time_till);
            }
            return null;
        }
    }
}
