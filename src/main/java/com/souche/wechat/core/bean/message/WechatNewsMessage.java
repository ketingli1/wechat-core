package com.souche.wechat.core.bean.message;

import com.google.common.base.MoreObjects;
import com.souche.wechat.core.bean.WechatMessage;

import java.util.List;

/**
 * @author kalle
 * @class_name WechatNewsMessage
 * @description 公众号图文消息
 * @create 2017/4/5
 */
public class WechatNewsMessage extends WechatMessage{
    /**
     * 图文消息个数，限制为8条以内
     */
    private int articleCount;
    /**
     * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过8，则将会无响应
     */
    private List<Article> articles;

    public int getArticleCount() {
        return articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) throws Exception {
        if (null != articles && articles.size() > 8) {
            throw new Exception("绑定图文数超过8个");
        }
        this.articleCount = articles.size();
        this.articles = articles;
    }

    public class Article {
        private String title;//         图文消息标题
        private String description;//   图文消息描述
        private String picUrl;//        图文链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
        private String url;//           点击图文消息跳转链接

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("toUserName", toUserName)
                .add("fromUserName", fromUserName)
                .add("createTime", createTime)
                .add("msgType", msgType)
                .add("articleCount", articleCount)
                .add("articles", articles)
                .toString();
    }
}
