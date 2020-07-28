package com.bryceli.design_pattern.factory.absfactory;


import com.bryceli.design_pattern.factory.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
