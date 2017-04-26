package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.SceneScanEventContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatSceneScanEventProcessor
 * @description 带场景值扫码已关注事件处理器
 * @create 2017/4/13
 */
public class WechatSceneScanEventProcessor extends AbstractWechatProcessor {

    public WechatSceneScanEventProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new SceneScanEventContentParser();
    }
}
