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

    //在多线程的场景下，这里的方法执行可能会被分割，是不是线程安全的
    public static ChocolateFactory getInstance() {
        if (uniqueInstance == null) {
            //断点
            //如果线程1执行到此停止，交给线程2，那么线程2仍然可以进入并在之后创建对象
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
