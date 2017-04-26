package com.souche.wechat.core.bean;

import com.souche.wechat.core.enums.MsgType;

/**
 * @author kalle
 * @class_name WechatMessage
 * @description 微信消息
 * @create 2017/4/1
 */
public class WechatMessage {
    /**
     * 开发者微信号
     */
    protected String toUserName;
    /**
     * 发送方帐号（一个OpenID）
     */
    protected String fromUserName;
    /**
     * 消息创建时间 （整型）
     */
    protected String createTime;
    /**
     * 消息类型
     */
    protected MsgType msgType;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }
}
