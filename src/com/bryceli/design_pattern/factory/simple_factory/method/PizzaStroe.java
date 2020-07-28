package com.bryceli.design_pattern.factory.simple_factory.method;

public class PizzaStroe {
	public static void main(String[] args) {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(simplePizzaFactory);
	}
}
