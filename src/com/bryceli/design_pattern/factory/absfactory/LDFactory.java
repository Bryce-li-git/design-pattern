package com.bryceli.design_pattern.factory.absfactory;

import com.bryceli.design_pattern.factory.pizza.LDCheesePizza;
import com.bryceli.design_pattern.factory.pizza.LDPepperPizza;
import com.bryceli.design_pattern.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
