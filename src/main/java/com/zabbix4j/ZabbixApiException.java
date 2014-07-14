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

package com.zabbix4j;

import com.google.gson.Gson;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Suguru Yajima on 2014/04/25.
 */
public class ZabbixApiException extends Exception {
    private static Logger logger = LoggerFactory.getLogger(ZabbixApiException.class);
    private ZabbixApiErrorMessageObject errorMessageObject;
    private String requestMessage;

    public ZabbixApiException(String message) {
        super(message);

        logger.error(message);

        try {
            Gson gson = new Gson();
            errorMessageObject = gson.fromJson(message, ZabbixApiErrorMessageObject.class);
        } catch (Exception e) {
            errorMessageObject = new ZabbixApiErrorMessageObject();
        }
    }


    public ZabbixApiException(String message, String requestMessage) {
        super(message);
        this.requestMessage = requestMessage;

        logger.error(message);
        
        try {
            Gson gson = new Gson();
            errorMessageObject = gson.fromJson(message, ZabbixApiErrorMessageObject.class);
        } catch (Exception e) {
            errorMessageObject = new ZabbixApiErrorMessageObject();
        }
    }

    public ZabbixApiException(Throwable t) {
        super(t);
    }

    public String getMessage() {
        return errorMessageObject.getMessage();
    }

    public Integer getCode() {
        return errorMessageObject.getCode();
    }

    public String getData() {
        return errorMessageObject.getData();
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class ZabbixApiErrorMessageObject {
        private String message;
        private String data;
        private Integer code;

        public ZabbixApiErrorMessageObject() {
            super();
        }
    }
}
