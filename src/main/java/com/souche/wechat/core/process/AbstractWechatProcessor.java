package com.souche.wechat.core.process;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.process.parse.RequestContentParser;
import com.souche.wechat.core.process.reply.AbstractWechatMessageReply;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * 微信请求处理器
 * Created by ketl on 2017/4/1.
 */
public abstract class AbstractWechatProcessor {
    /**
     * 请求内容处理器
     */
    protected RequestContentParser contentParser;

    /**
     * 回复控制器
     */
    protected ReplyController replyController;

    /**
     * xml Element 解析后的 wechatMessage
     */
    protected WechatMessage requestMessage;

    public AbstractWechatProcessor(Element xmlElement, ReplyController replyController) {
        // 初始化 contentParser
        init(xmlElement);
        // 初始化 replyController
        this.replyController = replyController;
        // 获取解析的 wechatMessage
        this.requestMessage = contentParser.parse(xmlElement);
    }

    public abstract void init(Element xmlElement);

    /**
     * 根据请求处理后进行响应
     * @return
     */
    public AbstractWechatMessageReply process() {
        return replyController.handler(requestMessage);
    }
}


