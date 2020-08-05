package com.bryceli.design_pattern.proxy.static_proxy;

/**
 * @author Bryce
 * @date 2020/8/5 11:20
 * @description 电影对象的代理类，主要就是实现接口，创建真实的接口实现对象，在调用真实接口实现对象的方法的同时做增强
 * @Version 1.0
 */
public class Proxy implements Movie{
    //真实的接口实现对象
    private MovieImpl movie;

    //在构造方法中传入接口实现对象
    public Proxy(MovieImpl movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        //做增强
        System.out.println("播放广告");
        movie.play();
        System.out.println("欢迎下次光临");
    }
}
