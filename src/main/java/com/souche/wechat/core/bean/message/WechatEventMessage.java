package com.souche.wechat.core.bean.message;

import com.souche.wechat.core.enums.EventMsgType;
import com.souche.wechat.core.bean.WechatMessage;

/**
 * @author kalle
 * @class_name WechatEventMessage
 * @description 公众号事件消息
 * @create 2017/4/5
 */
public abstract  class WechatEventMessage extends WechatMessage {
    /**
     * 事件类型
     */
    protected EventMsgType event;

    public EventMsgType getEvent() {
        return event;
    }

    public void setEvent(EventMsgType event) {
        this.event = event;
    }
}
