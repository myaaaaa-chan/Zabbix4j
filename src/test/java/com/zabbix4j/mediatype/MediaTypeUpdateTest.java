package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MediaTypeUpdateTest extends ZabbixApiTestBase {
    public MediaTypeUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {
        DummyMediaType dummyMediaType = new DummyMediaType(zabbixApi);
        Integer targetId = dummyMediaType.create();

        try {
            MediaTypeUpdateRequest request = new MediaTypeUpdateRequest();
            MediaTypeObject obj = new MediaTypeObject();
            obj.setMediatypeid(targetId);
            obj.setDescription("update" + new Date());
            obj.setSmtp_email("hoge@hoge.com");
            request.addMediaTypeObject(obj);

            MediaTypeUpdateResponse response = zabbixApi.mediaType().update(request);
            assertNotNull(response);

            logger.debug(getGson().toJson(response));

            Integer actualId = response.getResult().getMediatypeids().get(0);
            assertThat(actualId, is(targetId));

        } finally {
            dummyMediaType.delete(targetId);
        }
    }
}
