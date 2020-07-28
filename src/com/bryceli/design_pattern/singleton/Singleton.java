package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:32
 * @description 初步实现单例模式类
 * @Version 1.0
 */
public class Singleton {
    //创建私有且静态的对象引用
    private static Singleton uniqueInstace = null;
    //将构造方法私有，杜绝外部创建该对象实例
    private Singleton(){

    }
    //给外部一个get调用接口，在首次调用时进行创建对象，其它则直接不创建直接返回
    public static Singleton getInstance(){
        if(uniqueInstace == null){
            uniqueInstace = new Singleton();
        }
        return uniqueInstace;
    }
}
