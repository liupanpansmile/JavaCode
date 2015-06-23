package com.oneapm.TestThread;

import java.lang.*;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			PrintHello ph = new PrintHello() ;
			Thread thread = new Thread(ph) ;
			//thread.start();
			for(;;)
			{
				System.out.println("I am parent");
				Thread.sleep(100);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
