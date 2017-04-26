package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.LinkContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatLinkProcessor
 * @description 链接消息处理器
 * @create 2017/4/13
 */
public class WechatLinkProcessor extends AbstractWechatProcessor {

    public WechatLinkProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new LinkContentParser();
    }
}
