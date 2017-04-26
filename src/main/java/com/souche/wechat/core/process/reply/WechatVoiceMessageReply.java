package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatVoiceMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatVoiceMessageReply
 * @description 回复语音消息
 * @create 2017/4/7
 */
public class WechatVoiceMessageReply extends AbstractWechatMessageReply {

    @Override
    public Element generateContent(Element xmlElement) {
        WechatVoiceMessage voiceMessage = null;
        if (wechatMessage instanceof WechatVoiceMessage) {
            voiceMessage = (WechatVoiceMessage)wechatMessage;
        }

        if (null == voiceMessage) {
            throw new RuntimeException("VoiceMessageReply不能回复WechatVoiceMessage之外的消息");
        }

        // 设置回复类型
        Element msgTypeElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        msgTypeElement.addCDATA(MsgType.VOICE.getType());
        // 设置回复内容
        Element voiceElement = xmlElement.addElement(WechatMessageConstant.VOICE);
        Element mediaIdElement = voiceElement.addElement(WechatMessageConstant.MEDIAID);
        mediaIdElement.addCDATA(voiceMessage.getMediaId());

        return xmlElement;
    }
}
