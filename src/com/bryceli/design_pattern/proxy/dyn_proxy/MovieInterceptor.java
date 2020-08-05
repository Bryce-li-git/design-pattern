package com.bryceli.design_pattern.proxy.dyn_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Bryce
 * @date 2020/8/5 12:44
 * @description Cglib实现动态代理
 * @Version 1.0
 */
public class MovieInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("播放广告");
        //调用传进来的接口实现对象的method同名方法，使用args参数，即用户调用动态代理中的什么方法，这里就调用接口实现对象的同名方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("欢迎下次光临");
        return null;
    }
}
