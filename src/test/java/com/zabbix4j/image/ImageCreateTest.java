package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ImageCreateTest extends ZabbixApiTestBase {

    public ImageCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        String filepath = getClass().getClassLoader().getResource("cat.jpeg").getPath();
        DummyImage dummyImage = new DummyImage(zabbixApi);
        String base64Image = dummyImage.encodeBase64(filepath);

        ImageCreateRequest request = new ImageCreateRequest();
        ImageCreateRequest.Params params = request.getParams();
        params.setName("test image.create." + new Date().getTime());
        params.setImagetype(ImageObject.IMAGE_TYPE.ICON.value);
        params.setImage(base64Image);

        ImageCreateResponse response = zabbixApi.image().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer actualId = response.getResult().getImageids().get(0);
        assertNotNull(actualId);
    }
}
