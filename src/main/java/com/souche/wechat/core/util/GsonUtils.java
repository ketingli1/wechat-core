package com.souche.wechat.core.util;

import com.google.common.collect.Maps;
import com.google.gson.GsonBuilder;
import com.souche.wechat.core.bean.WechatMessage;

import java.util.Map;

/**
 * @author kalle
 * @class_name GsonUtils
 * @description json工具类
 * @create 2017/4/19
 */
public class GsonUtils {

    private static GsonBuilder defaultBuilder = new GsonBuilder();

    /**
     * 解析json字符串
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        return (T) defaultBuilder.create().fromJson(json, clazz);
    }

    /**
     * 将对象转化为json串
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        return defaultBuilder.create().toJson(object);
    }

    public static void main(String[] args) {
        WechatMessage message = new WechatMessage();
        message.setToUserName("ketingli");
        message.setFromUserName("openid1");
        message.setCreateTime("123");

        Map<String, Object> param = Maps.newHashMap();
        param.put("key1", "value1");
        param.put("key2", "value2");
        param.put("key3", "value3");
        param.put("key4", message);

        System.out.println(toJson(param ));
    }
}
