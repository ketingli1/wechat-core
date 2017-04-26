package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.LocationContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatLocationProcessor
 * @description 地理位置消息处理器
 * @create 2017/4/13
 */
public class WechatLocationProcessor extends AbstractWechatProcessor {

    public WechatLocationProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new LocationContentParser();
    }
}
