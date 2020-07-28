package com.bryceli.design_pattern.factory.simple_factory.method;

import com.bryceli.design_pattern.factory.simple_factory.pizza.CheesePizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.GreekPizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.PepperPizza;
import com.bryceli.design_pattern.factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		//每增加一种pizza类型，都要修改这里，不符合开闭原则，扩展性和维护性差
		while (true){
			//获取输入的披萨类型
			orderType = gettype();
			if("cheese".equals(orderType)){
				pizza = new CheesePizza();
			}else if ("greek".equals(orderType)){
				pizza = new GreekPizza();
			}else if ("pepper".equals(orderType)){
				pizza = new PepperPizza();
			}else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
	}

	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
