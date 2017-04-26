package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.VoiceContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatVoiceProcessor
 * @description 语音处理器
 * @create 2017/4/13
 */
public class WechatVoiceProcessor extends AbstractWechatProcessor {

    public WechatVoiceProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new VoiceContentParser();
    }
}
