package com.bryceli.design_pattern.proxy.dyn_proxy;

import com.bryceli.design_pattern.proxy.static_proxy.MovieImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Bryce
 * @date 2020/8/5 11:39
 * @description 动态代理中的调用处理器，实现对真实对象的增强
 * @Version 1.0
 */
//1.实现java.lang.reflect.InvocationHandler接口，完成里面的invoke函数对对象进行增强
public class MovieHandler implements InvocationHandler {
    //传进来的对象任意，具有很好的扩展性
    private Object movie;

    public MovieHandler(Object movie) {
        this.movie = movie;
    }

    /**
     * proxy 代理对象，用户直接调用
     * method 代理对象被调用的具体方法
     * args 调用的方法中的参数
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    //2.重写invoke
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("播放广告");
        //调用传进来的接口实现对象的method同名方法，使用args参数，即用户调用动态代理中的什么方法，这里就调用接口实现对象的同名方法
        method.invoke(movie,args);
        System.out.println("欢迎下次光临");
        return null;
    }
}
