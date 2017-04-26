package com.souche.wechat.core.http;

import com.souche.wechat.core.constants.WechatHttpConstant;
import com.souche.wechat.core.util.Assert;

import java.io.IOException;

/**
 * @author kalle
 * @class_name WechatHttpClient
 * @description 公众号http客户程序
 * @create 2017/4/19
 */
public abstract class WechatHttpClient<T> {

    /**
     * 请求参数体
     */
    protected WechatHttpEntity entity;

    /**
     * 请求链接
     */
    protected String uri;

    /**
     * 请求token
     */
    protected String token;

    public WechatHttpClient(WechatHttpEntity entity, String uri, String token) {
        this.entity = entity;
        this.uri = uri;
        this.token = token;
        this.init();
    }

    /**
     * 发送请求
     * @return
     */
    public abstract T send(Class<T> clazz) throws IOException;

    private void init() {
        Assert.hasText(uri, "请求uri不能为空");
        Assert.hasText(token, "请求token不能为空");
        this.uri = this.uri.replace(WechatHttpConstant.ACCESS_TOKEN, token);
    }
}
