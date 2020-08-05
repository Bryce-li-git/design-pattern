package com.bryceli.design_pattern.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Bryce
 * @date 2020/8/4 18:59
 * @description 远程服务方法调用接口的具体实现，在远程服务器端实现
 * @Version 1.0
 */
//第一步，实现远程服务方法接口，继承java.rmi.server.UnicastRemoteObject
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    //构造时抛出继承过来的可检查异常RemoteException,是IOException的子类
    protected MyRemoteImpl()throws RemoteException{
        super();
    }


    @Override
    public String sayHello() throws RemoteException {
        return "Hello RMI!";
    }

}
