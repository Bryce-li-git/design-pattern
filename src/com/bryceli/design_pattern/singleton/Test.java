package com.bryceli.design_pattern.singleton;

/**
 * @author Bryce
 * @date 2020/7/28 9:12
 * @description 测试类
 * @Version 1.0
 */
public class Test {

    public class Abc{
        public Abc(){

        };
    }

    public class Cbd{
        public Cbd(){
            Abc n1,n2;
            n1 = new Abc();
            n2 = new Abc();
        }
    }

}
