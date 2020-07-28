package com.bryceli.design_pattern.factory.absfactory;


import com.bryceli.design_pattern.factory.pizza.NYCheesePizza;
import com.bryceli.design_pattern.factory.pizza.NYPepperPizza;
import com.bryceli.design_pattern.factory.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
