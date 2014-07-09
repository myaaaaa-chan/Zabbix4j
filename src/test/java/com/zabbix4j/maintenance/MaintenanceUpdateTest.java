package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MaintenanceUpdateTest extends ZabbixApiTestBase {

    public MaintenanceUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        final Integer groupId = 23;

        DummyMaintenance dummyMaintenance = new DummyMaintenance(zabbixApi);
        Integer targetId = dummyMaintenance.create();

        try {
            MaintenanceUpdateRequest request = new MaintenanceUpdateRequest();
            MaintenanceUpdateRequest.Params params = request.getParams();
            params.setMaintenanceid(targetId);

            params.setName("test.maintenance.update." + new Date().getTime());

            Long since = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2014/01/01 00:00:00").getTime() / 1000;
            params.setActive_since(since);
            Long till = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2030/01/01 00:00:00").getTime() / 1000;
            params.setActive_till(till);
            params.addGroupId(groupId);
            params.setDescription("test.maintenance.update");

            TimePeriodObject obj = new TimePeriodObject();
            obj.setTimeperiod_type(TimePeriodObject.TIMEPERIOD_TYPE.WEEKLY.value);
            obj.setEvery(TimePeriodObject.WEEK_OF_THE_MONTH.FIRST_WEEK.value);
            obj.setDayofweek(64);
            obj.setStart_time(64800);
            obj.setPeriod(3600);
            params.addTimePeriod(obj);

            MaintenanceUpdateResponse response = zabbixApi.maintenance().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getMaintenanceids().get(0);
            assertThat(actualId, is(targetId));
        } finally {
            dummyMaintenance.delete(targetId);
        }
    }
}
