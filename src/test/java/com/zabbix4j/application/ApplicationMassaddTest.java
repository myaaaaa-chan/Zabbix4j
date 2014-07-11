package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.item.DummyItem;
import com.zabbix4j.item.ItemObject;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * @author suguru yajima 2014
 */
public class ApplicationMassaddTest extends ZabbixApiTestBase {
    public ApplicationMassaddTest() {
        super();
    }

    @Test
    public void testMassadd() throws Exception {
        DummyApplication dummyApplication = new DummyApplication(zabbixApi);
        Integer targetId = dummyApplication.create();

        DummyItem dummyItem = new DummyItem(zabbixApi);
        Integer tagetItemId = dummyItem.create();
        try {
            ApplicationMassaddRequest request = new ApplicationMassaddRequest();
            ApplicationMassaddRequest.Params params = request.getParams();
            ApplicationObject appObj = new ApplicationObject();
            appObj.setApplicationid(targetId);
            params.addApplication(appObj);

            ItemObject itemObj = new ItemObject();
            itemObj.setItemid(tagetItemId);
            params.addItem(itemObj);

            ApplicationMassaddResponse response = zabbixApi.application().massadd(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getApplicationids().get(0);
            assertThat(actualId, Is.is(targetId));
        } catch (ZabbixApiException e) {
            assertNotNull(e.getMessage());
            assertNotNull(e.getCode());
            assertNotNull(e.getData());
            fail(e.getData());
        } finally {
            dummyApplication.delete(targetId);
            dummyItem.delete(tagetItemId);
        }
    }
}
