package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class MediaTypeCreateTest extends ZabbixApiTestBase {

    public MediaTypeCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        MediaTypeCreateRequest request = new MediaTypeCreateRequest();

        MediaTypeObject obj = new MediaTypeObject();
        obj.setDescription("test.mediatype." + new Date());
        obj.setType(MediaTypeObject.MEDIA_TYPE.EMAIL.value);
        obj.setSmtp_server("rootmail@company.com");
        obj.setSmtp_helo("company.com");
        obj.setSmtp_email("zabbix@company.com");
        request.addMediaType(obj);

        MediaTypeCreateResponse response = zabbixApi.mediaType().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getMediatypeids().get(0);
        assertNotNull(actualId);
    }
}
