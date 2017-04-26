package com.souche.wechat.core.servlet;

import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.EventMsgType;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.process.*;
import com.souche.wechat.core.process.reply.AbstractWechatMessageReply;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import javax.servlet.http.HttpServletRequest;

/**
 * 公众号回调请求
 * Created by ketl on 2017/4/1.
 */
public abstract class WechatCallbackRequest implements HttpServletRequest, WechatRequestContent{

    protected AbstractWechatProcessor processor;

    /**
     * 解析请求内容
     * @return
     */
    public AbstractWechatMessageReply process(ReplyController replyController) throws DocumentException {
        // 获取请求xml字符串
        String inputXml = getRequestContent(this);

        // 解析xml
        Document document = DocumentHelper.parseText(inputXml);
        Element xmlElement = document.getRootElement();

        // 获取处理器
        processor = getProcessor(xmlElement, replyController);

        // 获取处理回复结果
        AbstractWechatMessageReply reply = processor.process();

        return reply;
    }

    public AbstractWechatProcessor getProcessor(Element xmlElement, ReplyController replyController) {
        AbstractWechatProcessor processor = null;
        String msgTypeStr = xmlElement.elementText(WechatMessageConstant.MSGTYPE);
        MsgType msgType = MsgType.valueOfType(msgTypeStr);

        switch (msgType) {
            case TEXT:
                // 文本处理器
                processor = new WechatTextProcessor(xmlElement, replyController);
                break;
            case IMAGE:
                processor = new WechatImageProcessor(xmlElement, replyController);
                break;
            case VOICE:
                processor = new WechatVoiceProcessor(xmlElement, replyController);
                break;
            case VIDEO:
                processor = new WechatVideoProcessor(xmlElement, replyController);
                break;
            case SHORTVIDEO:
                processor = new WechatShortVideoProcessor(xmlElement, replyController);
                break;
            case LOCATION:
                processor = new WechatLocationProcessor(xmlElement, replyController);
                break;
            case LINK:
                processor = new WechatLinkProcessor(xmlElement, replyController);
                break;
            case EVENT:
                String eventTypeStr = xmlElement.elementText(WechatMessageConstant.EVENT);
                EventMsgType eventType = EventMsgType.valueOfType(msgTypeStr);
                switch (eventType) {
                    case SUBSCRIBE :
                        processor = new WechatSubscribeEventProcessor(xmlElement, replyController);
                        break;
                    case UNSUBSCRIBE :
                        processor = new WechatUnSubscribeEventProcessor(xmlElement, replyController);
                        break;
                    case SCAN :
                        processor = new WechatSceneScanEventProcessor(xmlElement, replyController);
                        break;
                    case LOCATION :
                        processor = new WechatLocationProcessor(xmlElement, replyController);
                        break;
                    case CLICK :
                        processor = new WechatMenuClickEventProcessor(xmlElement, replyController);
                        break;
                }
                break;
        }

        return processor;
    }
}
