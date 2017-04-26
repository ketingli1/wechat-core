package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatImageMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatImageMessageReply
 * @description 回复图片消息
 * @create 2017/4/7
 */
public class WechatImageMessageReply extends AbstractWechatMessageReply {

    @Override
    public Element generateContent(Element xmlElement) {
        WechatImageMessage imageMessage = null;

        if (wechatMessage instanceof WechatImageMessage) {
            imageMessage = (WechatImageMessage) wechatMessage;
        }

        if (null == imageMessage) {
            throw new RuntimeException("ImageMessageReply不能回复WechatImageMessage之外的消息");
        }

        // 设置回复类型
        Element msgTypeElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        msgTypeElement.addCDATA(MsgType.IMAGE.getType());
        // 设置回复内容
        Element imageElement = xmlElement.addElement(WechatMessageConstant.IMAGE);
        Element mediaIdElement = imageElement.addElement(WechatMessageConstant.MEDIAID);
        mediaIdElement.addCDATA(imageMessage.getMediaId());

        return xmlElement;
    }
}
