package com.zabbix4j.history;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
public class HistoryGetTest extends ZabbixApiTestBase{

    public HistoryGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {
        HistoryGetRequest request = new HistoryGetRequest();
        HistoryGetRequest.Params params = request.getParams();
        params.setTime_till(new Date().getTime());

        HistoryGetResponse response = zabbixApi.history().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
        HistoryObject obj = response.getResult().get(0);
        assertNotNull(obj.getItemid());
        assertNotNull(obj.getClock());
        assertNotNull(obj.getNs());
    }
}
