package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyMaintenance extends ZabbixApiTestDummyMethodBase {
    public DummyMaintenance(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public Integer create() throws ZabbixApiException, ParseException {
        final Integer groupId = 23;

        MaintenanceCreateRequest request = new MaintenanceCreateRequest();
        MaintenanceCreateRequest.Params params = request.getParams();

        params.setName("test.maintenance.create." + new Date().getTime());

        Long since = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2014/01/01 00:00:00").getTime() / 1000;
        params.setActive_since(since);
        Long till = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2030/01/01 00:00:00").getTime() / 1000;
        params.setActive_till(till);
        params.addGroupId(groupId);
        params.setDescription("test.maintenance.create");

        TimePeriodObject obj = new TimePeriodObject();
        obj.setTimeperiod_type(TimePeriodObject.TIMEPERIOD_TYPE.WEEKLY.value);
        obj.setEvery(TimePeriodObject.WEEK_OF_THE_MONTH.FIRST_WEEK.value);
        obj.setDayofweek(64);
        obj.setStart_time(64800);
        obj.setPeriod(3600);
        params.addTimeperiodId(obj);

        MaintenanceCreateResponse response = zabbixApi.maintenance().create(request);


        Integer actualId = response.getResult().getMaintenanceids().get(0);

        return actualId;
    }

    public void delete(Integer targetId) throws ZabbixApiException {

        MaintenanceDeleteRequest request = new MaintenanceDeleteRequest();
        request.addMaintenaceId(targetId);

        MaintenanceDeleteResponse response = zabbixApi.maintenance().delete(request);
    }
}
