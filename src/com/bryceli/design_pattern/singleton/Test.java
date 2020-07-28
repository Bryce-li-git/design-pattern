package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:12
 * @description 测试类
 * @Version 1.0
 */
public class Test {

    //将构造函数和对象私有，只能在自己类中创建对象，外部调用get方法返回单例对象
    public class Abc{
        private  Abc n1;

        private Abc(){

        };

        public Abc getInstance(){
            //创建对象，并返回
            return null;
        }
    }

    public class Cbd{
        public Cbd(){
            Abc n1,n2;
           // n1 = new Abc();
           // n2 = new Abc();
        }
    }

}
