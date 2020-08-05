package com.bryceli.design_pattern.proxy.static_proxy;

/**
 * @author Bryce
 * @date 2020/8/5 11:19
 * @description 电影接口的实现类
 * @Version 1.0
 */
public class MovieImpl implements Movie{
    @Override
    public void play() {
        System.out.println("Playing movie...");
    }
}
