package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatScanEventMessage
 * @description 公众号带场景值扫码事件消息
 * @create 2017/4/5
 */
public class WechatScanEventMessage extends WechatEventMessage{
    /**
     * 事件KEY值，qrscene_为前缀，后面为二维码的参数值
     */
    private String eventKey;

    /**
     * 二维码的ticket，可用来换取二维码图片
     */
    private String tickey;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTickey() {
        return tickey;
    }

    public void setTickey(String tickey) {
        this.tickey = tickey;
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
                .add("tickey", tickey)
                .toString();
    }
}
