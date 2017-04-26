package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatLocationEventMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.EventMsgType;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name LocationReportEventContentParser
 * @description 上报地理位置事件内容解析器
 * @create 2017/4/13
 */
public class LocationReportEventContentParser implements RequestContentParser{
    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatLocationEventMessage message = new WechatLocationEventMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setEvent(EventMsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.EVENT)));
        message.setLatitude(XmlUtils.getText(xmlElement, WechatMessageConstant.LATITUDE));
        message.setLongitude(XmlUtils.getText(xmlElement, WechatMessageConstant.LONGITUDE));
        message.setPrecision(XmlUtils.getText(xmlElement, WechatMessageConstant.PRECISION));

        return message;
    }
}
