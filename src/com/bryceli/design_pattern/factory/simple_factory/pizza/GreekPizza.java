package com.bryceli.design_pattern.factory.simple_factory.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		super.setname("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
