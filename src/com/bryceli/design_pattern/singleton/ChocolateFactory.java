package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:38
 * @description 使用单例模式创建一个巧克力工厂
 * @Version 1.0
 */
public class ChocolateFactory {


    public static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    //优化一：使用synchronized修饰接口方法，设置接口方法为同步方法
    //使用同步锁使某一时刻有且只有一个线程能进入
    //缺点是，同步锁开销较大，如果需要多次调用get方法，则会出现性能瓶颈
    public static synchronized ChocolateFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateFactory();
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
