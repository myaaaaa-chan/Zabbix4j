package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiResponse;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ImageGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public ImageGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ImageObject {

        /**
         * Base64 encoded image. The maximum size of the encoded image is 1 MB¬
         */
        private String image;

        /**
         * Gets Base64 encoded image. The maximum size of the encoded image is 1 MB.
         *
         * @return Value of Base64 encoded image. The maximum size of the encoded image is 1 MB.
         */
        public String getImage() {
            return image;
        }

        /**
         * Sets new Base64 encoded image. The maximum size of the encoded image is 1 MB.
         *
         * @param image New value of Base64 encoded image. The maximum size of the encoded image is 1 MB.
         */
        public void setImage(String image) {
            this.image = image;
        }
    }
}
