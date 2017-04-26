package com.souche.wechat.core.process;

import com.souche.wechat.core.process.parse.LocationReportEventContentParser;
import com.souche.wechat.core.process.reply.ReplyController;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name WechatLocationReportEventProcessor
 * @description 上报地理位置事件解析器
 * @create 2017/4/13
 */
public class WechatLocationReportEventProcessor extends AbstractWechatProcessor {

    public WechatLocationReportEventProcessor(Element xmlElement, ReplyController replyController) {
        super(xmlElement, replyController);
    }

    @Override
    public void init(Element xmlElement) {
        this.contentParser = new LocationReportEventContentParser();
    }
}
