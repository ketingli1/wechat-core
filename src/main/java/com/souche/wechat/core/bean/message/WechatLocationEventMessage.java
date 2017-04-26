package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;

/**
 * @author kalle
 * @class_name WechatLocationEventMessage
 * @description 公众号上报地理位置事件消息
 * @create 2017/4/5
 */
public class WechatLocationEventMessage extends WechatEventMessage{
    /**
     * 地理位置纬度
     */
    private String latitude;
    /**
     * 地理位置经度
     */
    private  String longitude;
    /**
     * 地理位置精度
     */
    private String precision;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("event", event)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .add("precision", precision)
                .toString();
    }
}
