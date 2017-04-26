package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatSubscribeEventMessage
 * @description 公众号关注事件消息
 * @create 2017/4/5
 */
public class WechatSubscribeEventMessage extends WechatEventMessage{

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("event", event)
                .toString();
    }
}
