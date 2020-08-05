package com.bryceli.design_pattern.proxy.dyn_proxy;

import com.bryceli.design_pattern.proxy.static_proxy.Movie;
import com.bryceli.design_pattern.proxy.static_proxy.MovieImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Bryce
 * @date 2020/8/5 11:44
 * @description 动态代理测试类
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        MovieImpl movie = new MovieImpl();
        InvocationHandler movieHandler = new MovieHandler(movie);

        /**
         * 生成代理对象的核心方法Proxy.newProxyInstance()
         * 第一个参数，被代理对象的类加载器，因为要动态的生成代理对象类肯定要用到类加载器
         * 第二个参数，被代理对象实现的接口对象的类对象，用于生成动态代理对象中的方法
         * 第三个参数，调用处理器接口的实现对象，对传进入的代理对象进行增强，是实际执行者。
         * 每个代理的实例都有一个与之关联的 InvocationHandler实现类，如果代理的方法被调用，那么代理便会通知和转发给内部的 InvocationHandler 实现类，由它决定处理。
         * invoke() 方法决定了怎么样处理代理传递过来的方法调用。
         */
        Movie movieProxy = (Movie) Proxy.newProxyInstance(MovieImpl.class.getClassLoader(),MovieImpl.class.getInterfaces(),movieHandler);
        movieProxy.play();
    }
}
