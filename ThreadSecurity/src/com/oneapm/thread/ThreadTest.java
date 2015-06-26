package com.oneapm.thread;

public class ThreadTest {
	
	public static void MultiThreadSum() throws InterruptedException
	{
		Runnable runable = new Runnable() {
					
				Count count = new Count() ;
				@Override
				public void run() {
					count.count(); 
					}
				};
				
				
				for(int i = 0 ;i < 10 ;++i)
				{
					new Thread(runable).start();
					Thread.sleep(100);
				}
	}

	public static void test()
	{
	
		
		while(true){
			new Thread()
			{
				public void run()
				{
					Test.One();
				};
			}.start();
			
			new Thread()
			{
				public void run()
				{
					Test.Two();
				};
			}.start();
		}
	
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		test() ;
		
	}

}
