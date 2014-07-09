package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeUpdateTest extends ZabbixApiTestBase{

    public HostPrototypeUpdateTest() {
        super();
    }

    @Test
    public void testTest1() throws Exception {
        Integer targetId = null;
        ZabbixApiTestDummyHostPrototype dummy = new ZabbixApiTestDummyHostPrototype(zabbixApi);

        try {
            targetId = dummy.createHost();

            HostPrototypeUpdateRequest request = new HostPrototypeUpdateRequest();
            HostPrototypeUpdateRequest.Params params = request.getParams();
            params.setHostid(targetId);
            params.setHost("host.prototype.update");
            params.setName("host prototype update");

            GroupPrototypeObject typeObj = new GroupPrototypeObject();
            typeObj.setName("host prototype update");
            params.addGroupPrototype(typeObj);

            params.setHost("192.168.0.1");

            HostPrototypeUpdateResponse response = zabbixApi.hostPrototype().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getHostids().get(0);
            assertThat(targetId, Is.is(actualId));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dummy.deleteHostPrototype(targetId);
            fail();
        }
    }
}
