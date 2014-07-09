package com.zabbix4j.image;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyImage extends ZabbixApiTestDummyMethodBase {

    public DummyImage(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String encodeBase64(String imageFilePath) {
        File file = new File(imageFilePath);
        BufferedImage image = null;

        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        image.flush();
        try {
            ImageIO.write(image, "jpg", bos);
            bos.flush();
            bos.close();
        } catch (IOException e) {
        }

        byte[] bImage = baos.toByteArray();

        //return Base64.encodeBase64(bImage).toString();
        return Base64.encodeBase64String(bImage);
    }

    public Integer create() throws ZabbixApiException {

        String filepath = getClass().getClassLoader().getResource("cat.jpeg").getPath();
        DummyImage dummyImage = new DummyImage(zabbixApi);
        String base64Image = dummyImage.encodeBase64(filepath);

        ImageCreateRequest request = new ImageCreateRequest();
        ImageCreateRequest.Params params = request.getParams();
        params.setName("test image.create." + new Date().getTime());
        params.setImagetype(ImageObject.IMAGE_TYPE.ICON.value);
        params.setImage(base64Image);

        ImageCreateResponse response = zabbixApi.image().create(request);


        Integer actualId = response.getResult().getImageids().get(0);

        return actualId;
    }

    public void delete(Integer id) throws ZabbixApiException {
        ImageDeleteRequest request = new ImageDeleteRequest();
        request.addImageId(id);

        ImageDeleteResponse response = zabbixApi.image().delete(request);
    }
}
