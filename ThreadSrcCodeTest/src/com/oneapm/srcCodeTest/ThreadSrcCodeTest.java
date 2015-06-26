package com.oneapm.srcCodeTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSrcCodeTest {

	public static void Test()
	{
		LiftOff liftOff = new LiftOff() ;
		Thread launch = new Thread(liftOff) ;
		System.out.println( launch.getName() );
		
		launch.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exec = Executors.newCachedThreadPool() ;
		for(int i =0 ;i < 5;++i)
		{
			exec.execute(new LiftOff());
		}
		exec.shutdown();
		
	}

}
