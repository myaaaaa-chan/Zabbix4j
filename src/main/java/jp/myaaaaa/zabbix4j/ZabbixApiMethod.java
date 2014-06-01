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

package jp.myaaaaa.zabbix4j;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import jp.myaaaaa.zabbix4j.utils.json.JSONException;
import jp.myaaaaa.zabbix4j.utils.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Suguru Yajima on 2014/04/26.
 */
public class ZabbixApiMethod {

    private static Logger logger = LoggerFactory.getLogger(ZabbixApiMethod.class);

    protected String apiUrl;

    protected String auth;

    public ZabbixApiMethod(String apiUrl, String auth) {
        this.apiUrl = apiUrl;
        this.auth = auth;
    }

    public String sendRequest(String requestJson) throws ZabbixApiException {
        logger.debug("request json is \n" + requestJson);

        // HTTP POST
        HttpResponse httpResponse;

        HttpPost httpPost = new HttpPost(apiUrl);

        String responseBody = null;
        try {
            httpPost.setHeader("Content-Type", "application/json-rpc");
            httpPost.setEntity(new StringEntity(requestJson));

            DefaultHttpClient client = new DefaultHttpClient();
            httpResponse = client.execute(httpPost);
            responseBody = EntityUtils.toString(httpResponse.getEntity());

        } catch (Exception e) {
            throw new ZabbixApiException("HTTP Request Error");
        }

        // HTTP エラー処理
        if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            throw new ZabbixApiException("HTTP Error : " + responseBody);
        }

        // JSON Objectの取り出し
        JSONObject responseJson;
        try {
            responseJson = new JSONObject(responseBody);
        } catch (Exception e) {
            throw new ZabbixApiException(e.getMessage());
        }

        // APIエラー処理
        if (responseJson.has("error")) {
            String message;
            try {
                message = "API Error : " + responseJson.getJSONObject("error").toString();
            } catch (JSONException e) {
                throw new ZabbixApiException(e.getMessage());
            }
            message += "\nRequest:" + requestJson.toString();
            throw new ZabbixApiException(message);
        }


        logger.debug("response json is \n" + responseBody);

        return responseBody;
    }
}
