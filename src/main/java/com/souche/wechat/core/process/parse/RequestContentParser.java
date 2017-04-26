package com.souche.wechat.core.process.parse;

import com.souche.wechat.core.bean.WechatMessage;
import org.dom4j.Element;

/**
 * @author kalle
 * @class_name RequestContentParser
 * @description 请求内容解析器
 * @create 2017/4/7
 */
public interface RequestContentParser {
    /**
     * 解析
     * @param xmlElement
     * @return
     */
    WechatMessage parse(Element xmlElement);
}
