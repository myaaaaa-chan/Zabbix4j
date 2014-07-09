package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiTestBase;
import junit.framework.TestCase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


/**
 * @author Suguru Yajima
 */
public class ImageUpdateTest extends ZabbixApiTestBase {
    public ImageUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        DummyImage dummyImage = new DummyImage(zabbixApi);

        Integer targetId = dummyImage.create();

        ImageUpdateRequest request = new ImageUpdateRequest();
        ImageUpdateRequest.Params params = request.getParams();
        params.setImageid(targetId);

        String filepath = getClass().getClassLoader().getResource("cat.jpeg").getPath();
        String updateImage = dummyImage.encodeBase64(filepath);
        params.setImage(updateImage);

        params.setName("test.image.update");

        ImageUpdateResponse response = zabbixApi.image().update(request);
        assertNotNull(response);

        dummyImage.delete(targetId);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getImageids().get(0);
        assertThat(targetId, is(actualId));
    }
}
