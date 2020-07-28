package com.bryceli.design_pattern.factory.simple_factory.method;

import com.bryceli.design_pattern.factory.pizza.CheesePizza;
import com.bryceli.design_pattern.factory.pizza.GreekPizza;
import com.bryceli.design_pattern.factory.pizza.PepperPizza;
import com.bryceli.design_pattern.factory.pizza.Pizza;

/**
 * 使用简单工厂，将if...else逻辑抽取出来
 */
public class SimplePizzaFactory {

	public Pizza CreatePizza(String orderType) {
		Pizza pizza = null;

		if("cheese".equals(orderType)){
			pizza = new CheesePizza();
		}else if ("greek".equals(orderType)){
			pizza = new GreekPizza();
		}else if ("pepper".equals(orderType)){
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
