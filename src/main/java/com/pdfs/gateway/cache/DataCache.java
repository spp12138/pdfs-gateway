package com.pdfs.gateway.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  数据缓存
 */
public class DataCache {

    // 现在用Map做缓存
    private static Map<String,Object> data = new HashMap<String,Object>();

    /**
     * 存入缓存
     * @param k
     * @param v
     * @return
     */
    public static Map<String, Object> put(String k ,Object v) {
        data.put(k,v);
        return data;
    }

    /**
     * 取出缓存
     * @param k
     * @return
     */
    public static Object get(String k) {
        return data.get(k);
    }

}
