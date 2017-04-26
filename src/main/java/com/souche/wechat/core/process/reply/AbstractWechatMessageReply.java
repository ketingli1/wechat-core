package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name AbstractWechatMessageReply
 * @description 回复消息抽象类
 * @create 2017/4/6
 */
public abstract class AbstractWechatMessageReply {

    /**
     * 要回复的消息
     */
    protected WechatMessage wechatMessage;

    /**
     * 生成具体的回复内容
     * @return
     */
    public abstract Element generateContent(Element xmlElement);

    protected Element getXmlElement() {
        if (null == wechatMessage) {
            return null;
        }

        Document document = DocumentHelper.createDocument();
        Element xmlElement = document.addElement(WechatMessageConstant.XML);
        //设置目标用户
        Element toUserNameElement = xmlElement.addElement(WechatMessageConstant.TOUSERNAME);
        toUserNameElement.addCDATA(wechatMessage.getToUserName());
        //设置发送公众号
        Element fromUserNameElement = xmlElement.addElement(WechatMessageConstant.FROMUSERNAME);
        fromUserNameElement.addCDATA(wechatMessage.getFromUserName());
        //设置发送时间
        Element createTimeElement = xmlElement.addElement(WechatMessageConstant.CREATETIME);
        createTimeElement.addText("" + System.currentTimeMillis());

        Element content = generateContent(xmlElement);

        return content;
    }

    /**
     * 消息回复
     * @return
     */
    public String reply() {
        Element replyElement = this.getXmlElement();

        return null == replyElement ? null : replyElement.asXML();
    }

    public WechatMessage getWechatMessage() {
        return wechatMessage;
    }

    public void setWechatMessage(WechatMessage wechatMessage) {
        this.wechatMessage = wechatMessage;
    }
}
