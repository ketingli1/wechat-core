package com.souche.wechat.core.http;

import com.google.common.collect.Maps;
import com.souche.wechat.core.constants.WechatHttpConstant;
import com.souche.wechat.core.util.GsonUtils;

import java.util.Map;

/**
 * @author kalle
 * @class_name WechatHttpEntity
 * @description 公众号交互请求实体
 * @create 2017/4/19
 */
public class WechatHttpEntity {
    /**
     * 请求参数容器
     */
    private Map<String, Object> requestParam;

    private WechatHttpEntity(){
        this.requestParam = Maps.newHashMap();
    }

    /**
     * 获取http请求实体
     * @return
     */
    public static WechatHttpEntity getHttpEntity() {
        return new WechatHttpEntity();
    }

    /**
     * 默认初始化一个key-value内容的实体
     * @param key
     * @param value
     * @return
     */
    public static WechatHttpEntity getHttpEntity(String key, Object value) {
        WechatHttpEntity entity = getHttpEntity();
        return entity.add(key, value);
    }

    /**
     * 添加请求实体
     * @param key
     * @param value
     * @return
     */
    public WechatHttpEntity add(String key, Object value) {
        this.requestParam.put(key, value);
        return  this;
    }

    /**
     * 获取POST请求json串
     * @return
     */
    public String getJson() {
        return GsonUtils.toJson(requestParam);
    }

    /**
     * 获取get方式查询参数字符串
     * @return
     */
    public String getQueryString() {
        if (null != requestParam && requestParam.size() == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(WechatHttpConstant.QUESTION_MARK);

        for (Map.Entry<String, Object> entry : requestParam.entrySet()) {
            sb.append(entry.getKey());
            sb.append(WechatHttpConstant.EQUALS_SIGN);
            sb.append(entry.getValue());
            sb.append(WechatHttpConstant.AND_SIGN);
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
