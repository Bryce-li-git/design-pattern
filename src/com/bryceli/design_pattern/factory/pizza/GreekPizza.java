package com.bryceli.design_pattern.factory.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		super.setname("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
