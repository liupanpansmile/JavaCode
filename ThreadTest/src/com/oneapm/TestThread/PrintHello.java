package com.oneapm.TestThread;

public class PrintHello implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			for(;;)
			{
				System.out.println("I am Child");
				Thread.sleep(100);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
