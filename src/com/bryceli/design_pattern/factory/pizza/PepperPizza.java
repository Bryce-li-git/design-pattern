package com.bryceli.design_pattern.factory.pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		super.setname("PepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
