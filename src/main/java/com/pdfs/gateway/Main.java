package com.pdfs.gateway;

import com.pdfs.gateway.cache.RouteTable;
import com.pdfs.gateway.netty.server.NettyServer;

public class Main {

    public static void main(String[] args) {
        // 缓存类 测试
        RouteTable.Store.set("1.1.1.2");
        RouteTable.Store.set("1.2.1.2");
        System.out.println(RouteTable.Store.get());
        System.out.println(RouteTable.GateWay.get());

        //nio测试
        new NettyServer(8899).run();
    }

}