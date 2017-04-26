package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatLinkMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name LinkContentParser
 * @description 链接消息解析器
 * @create 2017/4/13
 */
public class LinkContentParser implements RequestContentParser{
    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatLinkMessage message = new WechatLinkMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setTitle(XmlUtils.getText(xmlElement, WechatMessageConstant.TITLE));
        message.setDescription(XmlUtils.getText(xmlElement, WechatMessageConstant.DESCRIPTION));
        message.setUrl(XmlUtils.getText(xmlElement, WechatMessageConstant.URL));
        message.setMsgId(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGID));

        return message;
    }
}
