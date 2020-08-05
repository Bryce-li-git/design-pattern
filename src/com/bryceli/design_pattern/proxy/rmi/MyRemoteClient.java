package com.bryceli.design_pattern.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Bryce
 * @date 2020/8/4 19:07
 * @description 本地客户端，调用远程方法
 * @Version 1.0
 */
public class MyRemoteClient {
    public static void main(String[] args) {

        try {
            //1.使用Naming.lookup静态方法，传入“rmi://地址：端口号/服务名（远程进行服务注册时定义）”，一定要强转为对应的接口对象
            //记得处理异常
            //Naming.lookup（）生成代理对象
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:8787/RemoteHello");

            //2.使用接口对象调用远程方法
            System.out.println(service.sayHello());

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
