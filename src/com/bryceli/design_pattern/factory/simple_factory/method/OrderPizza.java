package com.bryceli.design_pattern.factory.simple_factory.method;

import com.bryceli.design_pattern.factory.simple_factory.pizza.CheesePizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.GreekPizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.PepperPizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimplePizzaFactory mSimplePizzaFactory;

    //传入简单工厂，进行创建。
    public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) {
        setFactory(mSimplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory mSimplePizzaFactory) {
        Pizza pizza = null;
        String ordertype;

        this.mSimplePizzaFactory = mSimplePizzaFactory;

        do {
            ordertype = gettype();
            pizza = mSimplePizzaFactory.CreatePizza(ordertype);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

        } while (true);

    }

	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
