package com.oneapm.thread;

public class Count {
	
	private int count = 0;
	
	public void count()
	{
		for(int i = 1 ;i <= 10 ;++i)
		{
			count += i ;
		}
		System.out.println(Thread.currentThread().getName() + "-" + count) ;
	}
	

}
