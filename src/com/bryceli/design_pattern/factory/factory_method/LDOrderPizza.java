package com.bryceli.design_pattern.factory.factory_method;

import com.bryceli.design_pattern.factory.pizza.LDCheesePizza;
import com.bryceli.design_pattern.factory.pizza.LDPepperPizza;
import com.bryceli.design_pattern.factory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
