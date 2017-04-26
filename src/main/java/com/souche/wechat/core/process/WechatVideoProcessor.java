package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.VideoContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatVideoProcessor
 * @description 视频处理器
 * @create 2017/4/13
 */
public class WechatVideoProcessor extends AbstractWechatProcessor {

    public WechatVideoProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new VideoContentParser();
    }
}
