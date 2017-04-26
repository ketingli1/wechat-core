package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.MenuClickEventContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatMenuClickEventProcessor
 * @description 菜单点击事件处理器
 * @create 2017/4/13
 */
public class WechatMenuClickEventProcessor extends AbstractWechatProcessor {

    public WechatMenuClickEventProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new MenuClickEventContentParser();
    }
}
