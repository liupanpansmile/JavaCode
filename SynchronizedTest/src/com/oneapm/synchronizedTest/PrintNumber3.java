package com.oneapm.synchronizedTest;

public class PrintNumber3 implements Runnable {

	private static  int id ;
	public PrintNumber3(int id)
	{
		this.id = id ;
	}
	
	@Override
	public  void run() {

		
		count() ;
	}
	
	private static synchronized void count()
	{
			for(int i =1 ; i < 10000 ;++i)
			{
				System.out.println("thread-"+id+ ": "+i);
				
			}
	}

}

