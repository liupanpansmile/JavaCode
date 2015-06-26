package com.oneapm.staticFinalTest;

/*
 * 测试static块   普通块   构造方法的调用顺序
 * */

public class Test {
	
	static
	{
		System.out.println("Static Block Called");
	}
	
	{
		System.out.println("Common Block Called ");
	}
	
	public Test()
	{
		System.out.println("Construction Called !");
	}

}
