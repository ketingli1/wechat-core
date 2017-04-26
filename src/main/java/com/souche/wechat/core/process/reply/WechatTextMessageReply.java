package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatTextMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatTextMessageReply
 * @description 回复文本消息
 * @create 2017/4/7
 */
public class WechatTextMessageReply extends AbstractWechatMessageReply {

    @Override
    public Element generateContent(Element xmlElement) {
        WechatTextMessage textMessage = null;
        if (wechatMessage instanceof WechatTextMessage) {
            textMessage = (WechatTextMessage)wechatMessage;
        }

        if (null == textMessage) {
            throw new RuntimeException("TextMessageReply不能回复WechatTextMessage之外的消息");
        }
        // 设置回复类型
        Element msgTypeElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        msgTypeElement.addCDATA(MsgType.TEXT.getType());
        // 设置回复内容
        Element contentElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        contentElement.addCDATA(textMessage.getContent());

        return xmlElement;
    }
}
