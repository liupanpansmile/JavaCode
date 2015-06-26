package com.oneapm.thread;

public class Test {
	
	private static int i = 0,j = 0 ;
	
	public static void One()
	{

			++i ;
			++j ;
		
		
	}
	public synchronized static void Two() {
		System.out.println("i = " + i +" j = " +j);
	}

}
