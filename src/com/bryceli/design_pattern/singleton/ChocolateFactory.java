package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:38
 * @description 使用单例模式创建一个巧克力工厂
 * @Version 1.0
 */
public class ChocolateFactory {

    //优化二：急切创建对象，类加载时就直接创建对象
    //缺点，如果运行时没有使用该类对象，则造成资源浪费
    private static ChocolateFactory uniqueInstance = new ChocolateFactory();

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateFactory getInstance() {
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
