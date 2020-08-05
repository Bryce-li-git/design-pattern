package com.bryceli.design_pattern.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author Bryce
 * @date 2020/8/5 10:54
 * @description 远程服务器
 * @Version 1.0
 */
public class MyRemoteServer {
    public static void main(String[] args) {
        // System.setProperty("java.rmi.server.hostname","127.0.0.1");
        try {
            //1.创建服务接口的实现对象
            MyRemote service = new MyRemoteImpl();
            //使用java.rmi工具的静态方法进行注册和对象-服务名绑定
            LocateRegistry.createRegistry(8787);
            String location = "//127.0.0.1:8787/RemoteHello";
            Naming.rebind(location,service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e1){
            e1.printStackTrace();
        }
    }
}
