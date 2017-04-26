package com.souche.wechat.core.http;

import com.souche.wechat.core.util.GsonUtils;
import com.souche.wechat.core.util.WechatHttpUtil;

import java.io.IOException;

/**
 * @author kalle
 * @class_name WechatHttpGet
 * @description get请求接口
 * @create 2017/4/21
 */
public class WechatHttpGet<T> extends WechatHttpClient<T>{

    public WechatHttpGet(WechatHttpEntity entity, String uri, String token) {
        super(entity, uri, token);
    }

    @Override
    public T send(Class<T> clazz) throws IOException {
        this.uri += this.entity.getQueryString();
        String reponseContent = WechatHttpUtil.get(uri);

        return (T) GsonUtils.fromJson(reponseContent, clazz);
    }
}
