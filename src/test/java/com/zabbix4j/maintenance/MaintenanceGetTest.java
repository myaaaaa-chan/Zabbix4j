package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MaintenanceGetTest extends ZabbixApiTestBase {

    public MaintenanceGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        DummyMaintenance dummyMaintenance = new DummyMaintenance(zabbixApi);
        Integer targetId = dummyMaintenance.create();

        try {
            MaintenanceGetRequest request = new MaintenanceGetRequest();
            MaintenanceGetRequest.Params params = request.getParams();
            params.addMaintenanceId(targetId);

            params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
            params.setSelectTimeperiods(ZabbixApiParamter.QUERY.extend.name());

            MaintenanceGetResponse response = zabbixApi.maintenance().get(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            MaintenanceGetResponse.Result obj = response.getResult().get(0);
            assertNotNull(obj.getGroups());
            assertNotNull(obj.getTimeperiods());
            assertNotNull(obj.getActive_since());
            assertNotNull(obj.getActive_till());
            assertNotNull(obj.getActiveSinceDate());
            assertNotNull(obj.getDescription());
            assertNotNull(obj.getMaintenance_type());

        } finally {
            dummyMaintenance.delete(targetId);
        }
    }
}
