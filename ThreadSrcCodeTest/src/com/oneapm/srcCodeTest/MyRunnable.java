package com.oneapm.srcCodeTest;

public class MyRunnable implements Runnable {

	
	public MyRunnable()
	{
		System.out.println("thread begin");
	}
	@Override
	public void run() {
		
		for(int i = 0 ;i < 3 ;++i)
		{
			System.out.println("I am running !");
			Thread.yield();
		}

	}
	
	
	public void finalize()
	{
		System.out.println("thread end");
	}

}
