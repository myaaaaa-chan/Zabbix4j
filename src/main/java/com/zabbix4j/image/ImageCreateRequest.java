package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiRequest;

/**
 * @author Suguru Yajima
 */
public class ImageCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ImageCreateRequest() {
        setMethod("image.create");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends ImageObject {

        /**
         * Base64 encoded image. The maximum size of the encoded image is 1 MB.
         */
        private String image;

        /**
         * Gets Base64 encoded image. The maximum size of the encoded image is 1 MB..
         *
         * @return Value of Base64 encoded image. The maximum size of the encoded image is 1 MB..
         */
        public String getImage() {
            return image;
        }

        /**
         * Sets new Base64 encoded image. The maximum size of the encoded image is 1 MB..
         *
         * @param image New value of Base64 encoded image. The maximum size of the encoded image is 1 MB..
         */
        public void setImage(String image) {
            this.image = image;
        }
    }
}
