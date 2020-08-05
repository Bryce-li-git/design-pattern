package com.bryceli.design_pattern.proxy.static_proxy;

/**
 * @author Bryce
 * @date 2020/8/5 11:24
 * @description 静态代理测试。静态代理中代理类需要自己编写代码写成。
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //代理对象对传进来的真实对象进行增加
        Proxy proxy = new Proxy(new MovieImpl());
        //用户只对代理对象进行交互,与真实对象没有直接沟通
        proxy.play();
    }
}
