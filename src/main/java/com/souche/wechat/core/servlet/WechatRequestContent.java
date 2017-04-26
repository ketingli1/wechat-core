package com.souche.wechat.core.servlet;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信请求内容
 * Created by ketl on 2017/4/7.
 */
public interface WechatRequestContent {
    /**
     * 获取请求内容
     * @return
     */
    String getRequestContent(HttpServletRequest request);
}
