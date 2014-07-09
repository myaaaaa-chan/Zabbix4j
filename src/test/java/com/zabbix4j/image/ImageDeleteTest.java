package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;


/**
 * @author Suguru Yajima
 */
public class ImageDeleteTest extends ZabbixApiTestBase {

    public ImageDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {

        DummyImage dummyImage = new DummyImage(zabbixApi);
        Integer targetId = dummyImage.create();

        ImageDeleteRequest request = new ImageDeleteRequest();
        request.addImageId(targetId);

        ImageDeleteResponse response = zabbixApi.image().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getImageids().get(0);
        assertThat(targetId, is(actualId));

    }
}
