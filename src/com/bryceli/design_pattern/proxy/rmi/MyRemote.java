package com.bryceli.design_pattern.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Bryce
 * @date 2020/8/4 18:55
 * @description 远程服务方法接口，本地和远程都需要使用到，相当与一种协议，在远程服务器端实现，在本地客户端调用
 * @Version 1.0
 */
//第一步，继承java.rmi.Remote，称为一个远程服务方法接口
public interface MyRemote extends Remote {

    //第二步，抛出java.rmi.RemoteException异常
    public String sayHello() throws RemoteException;

}
