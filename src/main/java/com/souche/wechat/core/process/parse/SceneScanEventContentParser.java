package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatScanEventMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.EventMsgType;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name SceneScanEventContentParser
 * @description 带场景值已关注扫码事件内容解析器
 * @create 2017/4/13
 */
public class SceneScanEventContentParser implements RequestContentParser{
    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatScanEventMessage message = new WechatScanEventMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setEvent(EventMsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.EVENT)));
        message.setEventKey(XmlUtils.getText(xmlElement, WechatMessageConstant.EVENTKEY));
        message.setTickey(XmlUtils.getText(xmlElement, WechatMessageConstant.TICKET));

        return message;
    }
}
