package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.TextContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatTextProcessor
 * @description 文本消息处理器
 * @create 2017/4/1
 */
public class WechatTextProcessor extends AbstractWechatProcessor {

    public WechatTextProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new TextContentParser();
    }
}
