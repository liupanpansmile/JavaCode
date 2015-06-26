package com.oneapm.synchronizedTest;

public class PrintNumber2 implements Runnable {

	private int id ;
	private String lock ;
	public PrintNumber2(int id,String lock)
	{
		this.id = id ;
		this.lock = lock ;
	}
	
	@Override
	public  void run() {

		synchronized (lock) {
			for(int i =1 ; i < 10000 ;++i)
			{
				System.out.println("thread-"+id+ ": "+i);
				
			}
		}
		
	}

}
