package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:38
 * @description 使用单例模式创建一个巧克力工厂
 * @Version 1.0
 */
public class ChocolateFactory {

    //优化三：双重检查加锁法
    //volatile变量，用来确保将变量的更新操作通知到其他线程,使所有的线程拿到的对象都是一样的
    //volatile变量是一种比sychronized关键字更轻量级的同步机制,在访问volatile变量时不会执行加锁操作，因此也就不会使执行线程阻塞
    private volatile static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateFactory getInstance() {
        //优点：只会发生一次锁竞争，同步区域只会使用一次，其他的调用都不会进入同步代码块
        //第一次检查
        if (uniqueInstance == null) {
            //加同步锁
            synchronized (ChocolateFactory.class){
                //第二次检查
                if (uniqueInstance == null){

                    uniqueInstance = new ChocolateFactory();
                }
            }
        }
        return uniqueInstance;
    }

    private boolean empty;
    private boolean boiled;

    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }
}
