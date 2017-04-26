package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.ImageContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatImageProcessor
 * @description 图片处理器
 * @create 2017/4/13
 */
public class WechatImageProcessor extends AbstractWechatProcessor {

    public WechatImageProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new ImageContentParser();
    }
}
