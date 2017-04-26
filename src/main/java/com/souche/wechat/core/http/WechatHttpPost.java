package com.souche.wechat.core.http;

import com.souche.wechat.core.util.GsonUtils;
import com.souche.wechat.core.util.WechatHttpUtil;

import java.io.IOException;

/**
 * @author kalle
 * @class_name WechatHttpPost
 * @description post请求接口
 * @create 2017/4/19
 */
public class WechatHttpPost<T> extends WechatHttpClient<T>{

    public WechatHttpPost(WechatHttpEntity entity, String uri, String token) {
        super(entity, uri, token);
    }

    @Override
    public T send(Class<T> clazz) throws IOException {
        String reponseContent = WechatHttpUtil.post(uri, entity.getJson());

        return (T) GsonUtils.fromJson(reponseContent, clazz);
    }
}
