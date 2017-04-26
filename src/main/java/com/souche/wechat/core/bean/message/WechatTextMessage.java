package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatTextMessage
 * @description 公众号普通文本消息
 * @create 2017/4/5
 */
public class WechatTextMessage extends WechatNormalMessage{
    /**
     * 文本消息的内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("msgId", msgId)
                .add("content", content)
                .toString();
    }
}
