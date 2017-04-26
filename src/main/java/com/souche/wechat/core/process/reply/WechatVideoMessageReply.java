package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatVideoMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatVideoMessageReply
 * @description 回复视频消息
 * @create 2017/4/7
 */
public class WechatVideoMessageReply extends AbstractWechatMessageReply {
    @Override
    public Element generateContent(Element xmlElement) {
        WechatVideoMessage videoMessage = null;
        if (wechatMessage instanceof WechatVideoMessage) {
            videoMessage = (WechatVideoMessage)wechatMessage;
        }

        if (null == videoMessage) {
            throw new RuntimeException("VideoMessageReply不能回复WechatVideoMessage之外的消息");
        }

        // 设置回复类型
        Element msgTypeElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        msgTypeElement.addCDATA(MsgType.VIDEO.getType());
        // 设置回复内容
        Element videoElement = xmlElement.addElement(WechatMessageConstant.VIDEO);
        Element mediaIdElement = videoElement.addElement(WechatMessageConstant.MEDIAID);//mediaId
        mediaIdElement.addCDATA(videoMessage.getMediaId());
        Element titleElement = videoElement.addElement(WechatMessageConstant.TITLE);// title
        titleElement.addCDATA(videoMessage.getTitle());
        Element descriptionElement = videoElement.addElement(WechatMessageConstant.DESCRIPTION);// description
        descriptionElement.addCDATA(videoMessage.getDescription());

        return xmlElement;
    }
}
