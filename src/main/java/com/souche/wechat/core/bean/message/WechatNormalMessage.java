package com.souche.wechat.core.bean.message;

import com.souche.wechat.core.bean.WechatMessage;

/**
 * @author kalle
 * @class_name WechatNormalMessage
 * @description 公众号普通消息
 * @create 2017/4/5
 */
public abstract class WechatNormalMessage extends WechatMessage {
    /**
     * 消息id
     */
    protected String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
