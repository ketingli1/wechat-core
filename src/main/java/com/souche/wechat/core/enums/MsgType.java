package com.souche.wechat.core.enums;

import com.souche.wechat.core.util.StringUtils;

/**
 * 消息类型
 * Created by ketl on 2017/4/1.
 */
public enum MsgType {
    TEXT("text"),       // 文本消息
    IMAGE("image"),      // 图片消息
    VOICE("voice"),      // 语音消息
    VIDEO("video"),      // 视频消息
    MUSIC("music"),      // 视频消息
    SHORTVIDEO("shortvideo"), // 小视频消息
    LOCATION("location"),   // 地理位置消息
    LINK("link"),       // 链接消息
    NEWS("news"),       // 图文消息
    EVENT("event");     // 时间消息

    private String type;

    private MsgType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static MsgType valueOfType(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }

        return MsgType.valueOf(type.toUpperCase());
    }
}
