package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatLocationMessage
 * @description 公众号地理位置消息
 * @create 2017/4/5
 */
public class WechatLocationMessage extends WechatNormalMessage{
    /**
     * 地理位置维度
     */
    private String locationX;
    /**
     * 地理位置经度
     */
    private String locationY;
    /**
     * 地图缩放大小
     */
    private String scale;
    /**
     * 地理位置信息
     */
    private String label;

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("msgId", msgId)
                .add("locationX", locationX)
                .add("locationY", locationY)
                .add("scale", scale)
                .add("label", label)
                .toString();
    }
}
