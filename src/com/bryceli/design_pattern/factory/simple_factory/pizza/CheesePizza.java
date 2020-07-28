package com.bryceli.design_pattern.factory.simple_factory.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		super.setname("CheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
