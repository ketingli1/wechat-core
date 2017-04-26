package com.souche.wechat.core.util;

import java.util.Collection;

/**
 * @author kalle
 * @class_name CollectionUtils
 * @description 集合工具
 * @create 2017/4/6
 */
public class CollectionUtils {
    public static boolean isEmpty(Collection<? extends Object> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<? extends Object> collection) {
        return !isEmpty(collection);
    }
}
