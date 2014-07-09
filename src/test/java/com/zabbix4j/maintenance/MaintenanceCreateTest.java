package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class MaintenanceCreateTest extends ZabbixApiTestBase {

    public MaintenanceCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {

        final Integer groupId = 23;

        MaintenanceCreateRequest request = new MaintenanceCreateRequest();
        MaintenanceCreateRequest.Params params = request.getParams();

        params.setName("test.maintenance.create." + new Date().getTime());

        Long since = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2014/01/01 00:00:00").getTime() / 1000;
        params.setActive_since(since);
        Long till = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2030/01/01 00:00:00").getTime() / 1000;
        params.setActive_till(till);
        params.addGroupId(23);
        params.setDescription("test.maintenance.create");

        TimePeriodObject obj = new TimePeriodObject();
        obj.setTimeperiod_type(TimePeriodObject.TIMEPERIOD_TYPE.WEEKLY.value);
        obj.setEvery(TimePeriodObject.WEEK_OF_THE_MONTH.FIRST_WEEK.value);
        obj.setDayofweek(64);
        obj.setStart_time(64800);
        obj.setPeriod(3600);
        params.addTimeperiodId(obj);

        MaintenanceCreateResponse response = zabbixApi.maintenance().create(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getMaintenanceids().get(0);
        assertNotNull(actualId);
    }
}
