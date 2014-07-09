package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MediaTypeDeleteTest extends ZabbixApiTestBase {

    public MediaTypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyMediaType dummyMediaType = new DummyMediaType(zabbixApi);
        Integer targetId = dummyMediaType.create();

        MediaTypeDeleteRequest request = new MediaTypeDeleteRequest();
        request.addMediaTypeId(targetId);

        MediaTypeDeleteResponse response = zabbixApi.mediaType().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getMediatypeids().get(0);
        assertThat(actualId, is(targetId));
    }
}
