package com.souche.wechat.core.enums;

import com.souche.wechat.core.util.StringUtils;

/**
 * 事件消息类型
 * Created by ketl on 2017/4/5.
 */
public enum EventMsgType {
    SUBSCRIBE("subscribe"),//    用户未关注时的事件推送
    UNSUBSCRIBE("unsubscribe"),//  取消订阅的事件推送
    SCAN("scan"),//         用户已关注时的事件推送
    LOCATION("location"),//     上报地理位置事件
    CLICK("click");//        自定义菜单用户点击事件

    private String type;

    private EventMsgType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static EventMsgType valueOfType(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }

        return EventMsgType.valueOf(type.toUpperCase());
    }
}
