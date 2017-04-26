package com.souche.wechat.core.process.reply;

import com.souche.wechat.core.bean.message.WechatNewsMessage;
import com.souche.wechat.core.constants.WechatMessageConstant;
import org.dom4j.Element;

import java.util.List;

/**
 * @author kalle
 * @class_name WechatNewsMessageReply
 * @description 回复图文消息
 * @create 2017/4/7
 */
public class WechatNewsMessageReply extends AbstractWechatMessageReply {

    @Override
    public Element generateContent(Element xmlElement) {
        WechatNewsMessage newsMessage = null;
        if (wechatMessage instanceof WechatNewsMessage) {
            newsMessage = (WechatNewsMessage)wechatMessage;
        }

        if (null == newsMessage) {
            throw new RuntimeException("NewsMessageReply不能回复WechatNewsMessage之外的消息");
        }
        int articleCount = newsMessage.getArticleCount();
        List<WechatNewsMessage.Article> articles = newsMessage.getArticles();
        if (articleCount <= 0) {
            throw new RuntimeException("请至少添加一篇图文发送");
        }

        //添加图文消息个数
        Element articleCountElement = xmlElement.addElement(WechatMessageConstant.ARTICLECOUNT);
        articleCountElement.addCDATA("" + articleCount);
        // 添加Articles
        Element articlesElement = xmlElement.addElement(WechatMessageConstant.ARTICLES);
        for (WechatNewsMessage.Article article : articles) {
            //添加item
            Element itemElement = articlesElement.addElement(WechatMessageConstant.ITEM);

            Element titleElement = itemElement.addElement(WechatMessageConstant.TITLE);// Title
            titleElement.addCDATA(article.getTitle());
            Element describtionElement = itemElement.addElement(WechatMessageConstant.DESCRIPTION);// Description
            describtionElement.addCDATA(article.getDescription());
            Element picUrlElement = itemElement.addElement(WechatMessageConstant.PICURL);// PicUrl
            picUrlElement.addCDATA(article.getPicUrl());
            Element urlElement = itemElement.addElement(WechatMessageConstant.URL);// URL
            urlElement.addCDATA(article.getUrl());
        }

        return xmlElement;
    }
}
