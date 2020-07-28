package com.bryceli.design_pattern.factory.factory_method;

import com.bryceli.design_pattern.factory.pizza.NYCheesePizza;
import com.bryceli.design_pattern.factory.pizza.NYPepperPizza;
import com.bryceli.design_pattern.factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
