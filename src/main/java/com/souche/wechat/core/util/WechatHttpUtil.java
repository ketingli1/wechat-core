package com.souche.wechat.core.util;

import com.souche.wechat.core.constants.WechatHttpConstant;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author kalle
 * @class_name WechatHttpUtil
 * @description 公众号httpclient
 * @create 2017/4/14
 */
public class WechatHttpUtil {

    private static OkHttpClient client = new OkHttpClient();

    /**
     * 发送post请求
     * @param url   请求链接
     * @param json 请求参数
     * @return  响应内容
     */
    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(WechatHttpConstant.JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();

        return  response.body().toString();
    }

    /**
     * 发送get请求
     * @param url
     * @return
     * @throws IOException
     */
    public static String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
