/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
