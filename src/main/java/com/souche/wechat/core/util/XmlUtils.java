package com.souche.wechat.core.util;


import org.dom4j.Element;

/**
 * @author kalle
 * @class_name XmlUtils
 * @description xml工具类
 * @create 2017/4/13
 */
public class XmlUtils {

    /**
     * 获取 element 子项的内容
     * @param element
     * @param name
     * @return
     */
    public static String getText(Element element, String name) {
        Element subElement = element.element(name);
        if (null == subElement) {
            return null;
        }

        return subElement.getText();
    }
}
