package com.souche.wechat.core.constants;

import okhttp3.MediaType;

/**
 * @author kalle
 * @class_name WechatHttpConstant
 * @description 公众号http常量池
 * @create 2017/4/14
 */
public class WechatHttpConstant {
    public final static MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public final static String ACCESS_TOKEN = "ACCESS_TOKEN";// 接口URI 中的token key
    public final static String QUESTION_MARK = "?";// 问号
    public final static String EQUALS_SIGN = "=";// 等号
    public final static String AND_SIGN = "&";// 且连接符
}
