package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatVoiceMessage
 * @description 公众号语音消息
 * @create 2017/4/5
 */
public class WechatVoiceMessage extends WechatNormalMessage{
    /**
     * 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
     */
    private String mediaId;
    /**
     * 语音格式，如amr，speex等
     */
    private String format;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("msgId", msgId)
                .add("mediaId", mediaId)
                .add("format", format)
                .toString();
    }
}
