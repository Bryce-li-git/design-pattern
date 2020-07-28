package com.bryceli.design_pattern.factory.pizza;

public abstract class Pizza {
	protected String name;

	//假设只有准备的阶段是不一样的，其他都一样，进行抽象
	public abstract void prepare();
	public void bake()
	{
		System.out.println(name+" baking;");
	}
	public void cut()
	{
		System.out.println(name+" cutting;");
	}
	public void box()
	{
		System.out.println(name+" boxing;");
	}
	public void setname(String name)
	{
		this.name=name;
	}
}
