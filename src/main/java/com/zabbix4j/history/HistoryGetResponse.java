package com.zabbix4j.history;

import com.zabbix4j.ZabbixApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Response paramter for history.get
 * @author Suguru Yajima on 2014/06/03.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HistoryGetResponse extends ZabbixApiResponse {
    private List<HistoryObject> result;

    public HistoryGetResponse() {
        super();
    }
}
