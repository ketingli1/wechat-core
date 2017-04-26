package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatVideoMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name VideoContentParser
 * @description 视频消息解析器
 * @create 2017/4/13
 */
public class VideoContentParser implements RequestContentParser{

    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatVideoMessage message = new WechatVideoMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setThumbMediaId(XmlUtils.getText(xmlElement, WechatMessageConstant.THUMBMEDIAID));
        message.setMediaId(XmlUtils.getText(xmlElement, WechatMessageConstant.MEDIAID));
        message.setMsgId(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGID));

        return message;
    }
}
