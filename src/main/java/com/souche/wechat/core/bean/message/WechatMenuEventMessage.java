package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatMenuEventMessage
 * @description 公众号自定义菜单点击事件消息
 * @create 2017/4/5
 */
public class WechatMenuEventMessage extends WechatEventMessage{
    /**
     * 事件KEY值，与自定义菜单接口中KEY值对应
     */
    private String eventKey;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("event", event)
                .add("eventKey", eventKey)
                .toString();
    }
}
