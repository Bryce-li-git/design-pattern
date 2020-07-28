package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:38
 * @description 使用单例模式创建一个巧克力工厂
 * @Version 1.0
 */
public class ChocolateFactory {

    //补充一下，这里使用static是因为要配合可全局调用的静态方法getInstance()
    public static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {
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
