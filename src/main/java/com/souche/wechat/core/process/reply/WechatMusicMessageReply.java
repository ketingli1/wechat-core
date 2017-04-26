package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatMusicMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.MsgType;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatMusicMessageReply
 * @description 回复音乐消息
 * @create 2017/4/7
 */
public class WechatMusicMessageReply extends AbstractWechatMessageReply {

    @Override
    public Element generateContent(Element xmlElement) {
        WechatMusicMessage musicMessage = null;
        if (wechatMessage instanceof WechatMusicMessage) {
            musicMessage = (WechatMusicMessage)wechatMessage;
        }

        if (null == musicMessage) {
            throw new RuntimeException("MusicMessageReply不能回复WechatMusicMessage之外的消息");
        }

        // 设置回复类型
        Element msgTypeElement = xmlElement.addElement(WechatMessageConstant.MSGTYPE);
        msgTypeElement.addCDATA(MsgType.MUSIC.getType());
        // 设置回复内容
        Element musicElement = xmlElement.addElement(WechatMessageConstant.MUSIC);
        Element titleElement = musicElement.addElement(WechatMessageConstant.TITLE);
        titleElement.addCDATA(musicMessage.getTitle());
        Element descriptionElement = musicElement.addElement(WechatMessageConstant.DESCRIPTION);
        descriptionElement.addCDATA(musicMessage.getDescription());
        Element musicUrlElement = musicElement.addElement(WechatMessageConstant.MUSICURL);
        musicUrlElement.addCDATA(musicMessage.getMusicUrl());
        Element hqMusicUrlElement = musicElement.addElement(WechatMessageConstant.HQMUSICURL);
        hqMusicUrlElement.addCDATA(musicMessage.getHqMusicUrl());
        Element thumbMediaIdElement = musicElement.addElement(WechatMessageConstant.THUMBMEDIAID);
        thumbMediaIdElement.addCDATA(musicMessage.getThumbMediaId());

        return xmlElement;
    }
}
