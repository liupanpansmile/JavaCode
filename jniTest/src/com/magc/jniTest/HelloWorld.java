package com.magc.jniTest;


class Base
{
	public void Func()
	{
		System.out.println("This is Base Function");
	}
}

class Derived extends Base
{
	public  void Func()
	{
		System.out.println("This is Derived Function");
	}
}


public class HelloWorld {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b = new Derived () ;
		b.Func();
		
	
		
	}

}
