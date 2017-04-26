package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import com.souche.wechat.core.bean.message.WechatMenuEventMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import com.souche.wechat.core.enums.EventMsgType;
import com.souche.wechat.core.enums.MsgType;
import com.souche.wechat.core.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name MenuClickEventContentParser
 * @description 菜单点击事件内容解析器
 * @create 2017/4/13
 */
public class MenuClickEventContentParser implements RequestContentParser{

    @Override
    public WechatMessage parse(Element xmlElement) {
        WechatMenuEventMessage message = new WechatMenuEventMessage();

        message.setFromUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.FROMUSERNAME));
        message.setToUserName(XmlUtils.getText(xmlElement, WechatMessageConstant.TOUSERNAME));
        message.setCreateTime(XmlUtils.getText(xmlElement, WechatMessageConstant.CREATETIME));
        message.setMsgType(MsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.MSGTYPE)));
        message.setEvent(EventMsgType.valueOfType(XmlUtils.getText(xmlElement, WechatMessageConstant.EVENT)));
        message.setEventKey(XmlUtils.getText(xmlElement, WechatMessageConstant.EVENTKEY));

        return message;
    }
}
