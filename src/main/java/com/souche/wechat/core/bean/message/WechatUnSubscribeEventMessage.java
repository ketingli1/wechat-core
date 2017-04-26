package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatUnSubscribeEventMessage
 * @description 公众号取消关注事件
 * @create 2017/4/13
 */
public class WechatUnSubscribeEventMessage extends WechatEventMessage{

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
