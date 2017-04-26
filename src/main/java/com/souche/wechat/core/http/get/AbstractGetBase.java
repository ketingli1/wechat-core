package com.souche.wechat.core.http.get;

import com.souche.wechat.core.http.WechatHttpClient;
import com.souche.wechat.core.http.WechatHttpEntity;
import com.souche.wechat.core.http.WechatHttpGet;

/**
 * @author kalle
 * @class_name AbstractGetBase
 * @description 业务get基础类
 * @create 2017/4/21
 */
public abstract class AbstractGetBase<T> {
    /**
     * 获取get http请求实例
     * @param uri
     * @param token
     * @param entity
     * @return
     */
    protected WechatHttpClient<T> getHttpClient(String uri, String token, WechatHttpEntity entity) {
        return new WechatHttpGet<T>(entity, uri, token);
    }

    /**
     * 发送post请求
     * @return
     */
    public abstract T get();
}
