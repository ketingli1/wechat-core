package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.WechatMessage;

/**
 * @author kalle
 * @class_name ReplyController
 * @description 回复控制器
 * @create 2017/4/24
 */
public interface ReplyController {

    /**
     * 处理要回复的 WechatMessage , 获取AbstractWechatMessageReply
     * @param message
     * @return
     */
    AbstractWechatMessageReply handler(WechatMessage message);
}
