package com.souche.wechat.core.http.post;

import com.souche.wechat.core.http.WechatHttpClient;
import com.souche.wechat.core.http.WechatHttpEntity;
import com.souche.wechat.core.http.WechatHttpPost;

/**
 * @author kalle
 * @class_name AbstractPostBase
 * @description 业务post基础类
 * @create 2017/4/21
 */
public abstract class AbstractPostBase<T> {

    /**
     * 获取http实例
     * @param uri       请求连接
     * @param token     请求token
     * @param entity    请求数据
     * @return
     */
    protected WechatHttpClient<T> getHttpClient(String uri, String token, WechatHttpEntity entity) {
        return new WechatHttpPost<T>(entity, uri, token);
    }

    /**
     * 发送post请求
     * @return
     */
    public abstract T post();
}
