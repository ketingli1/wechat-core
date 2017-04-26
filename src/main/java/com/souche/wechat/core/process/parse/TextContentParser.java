package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatTextMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name TextContentParser
 * @description 文本内容解析器
 * @create 2017/4/7
 */
public class TextContentParser implements RequestContentParser{

    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatTextMessage message = new WechatTextMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setContent(XmlUtils.getText(xmlElement, WechatMessageConstant.CONTENT));
        message.setMsgId(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGID));

        return message;
    }
}
