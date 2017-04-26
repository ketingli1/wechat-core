package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatLocationMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name LocationContentParser
 * @description 小视频解析器
 * @create 2017/4/13
 */
public class LocationContentParser implements RequestContentParser{

    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatLocationMessage message = new WechatLocationMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setLocationX(XmlUtils.getText(xmlElement, WechatMessageConstant.LOCATION_X));
        message.setLocationY(XmlUtils.getText(xmlElement, WechatMessageConstant.LOCATION_Y));
        message.setScale(XmlUtils.getText(xmlElement, WechatMessageConstant.SCALE));
        message.setLabel(XmlUtils.getText(xmlElement, WechatMessageConstant.LABEL));
        message.setMsgId(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGID));

        return message;
    }
}
