package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.SubscribeEventContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatUnSubscribeEventProcessor
 * @description 取消关注事件处理器
 * @create 2017/4/13
 */
public class WechatUnSubscribeEventProcessor extends AbstractWechatProcessor {

    public WechatUnSubscribeEventProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new SubscribeEventContentParser();
    }
}
