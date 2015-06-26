package com.oneapm.staticFinalTest;

public class Test2 {
	
	
	private static int  staticVar = 0 ;
	private int  var ;

	static
	{
		staticVar = 1 ;
		System.out.println("staticVar = " + staticVar);
		
		Test2 t = new  Test2() ; 
		t.func() ;
		t.setValue(10); 
		
		System.out.println("var = " + var);
	}
	
	public Test2()
	{
		System.out.println("Construction Called !");
	}
	
	public void setValue(int var)
	{
		this.var = var ;
	}
	
	public void func()
	{
		System.out.println("func called !");
	}
}
