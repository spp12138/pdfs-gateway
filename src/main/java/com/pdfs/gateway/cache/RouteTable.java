package com.pdfs.gateway.cache;

import java.util.HashSet;
import java.util.Set;

/**
 *  存放路由表
 */
public class RouteTable {


    // 存放路由表
    static Set<String> gateWayTables = new HashSet<String>();

    /**
     * 将ip存到路由表，并放进缓存
     * @param ip
     * @return
     */
    public Set<String> set(String tableName,String ip) {
        if(gateWayTables.add(ip)){
            DataCache.put(tableName,gateWayTables);
        }
        return gateWayTables;
    }

    /**
     * 从缓存取出路由表
     * @return
     */
    public Set<String> get(String tableName) {
        return (Set<String>)DataCache.get(tableName);
    }

    /**
     * 存取网关节点的路由表
     */
    public static class GateWay extends RouteTable {

        static String tableName =  "gateway_route_table";

        public static Set<String> set(String ip) {
            return new RouteTable().set(tableName,ip);
        }

        public static Set<String> get() {
            return new RouteTable().get(tableName);
        }

    }

    /**
     * 存取存储节点的路由表
     */
    public static class Store extends RouteTable {

        static String tableName =  "store_route_table";

        public static Set<String> set(String ip) {
            return new RouteTable().set(tableName,ip);
        }

        public static Set<String> get() {
            return new RouteTable().get(tableName);
        }
    }
}
