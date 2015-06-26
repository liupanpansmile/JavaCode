package com.oneapm.srcCodeTest;

public class LiftOff implements Runnable {

	private  int countDown = 10 ;
	private static int countTask = 0 ;
	private final int id = ++countTask ;
	
	public LiftOff() {}
	
	public LiftOff(int count)
	{
		this.countDown = count ;
	}
	
	private String status()
	{
		return  "#" + id + "(" + (countDown==0 ? "LiftOff":countDown) + ")";
	}
	
	@Override
	public void run() {
		
		while(countDown >= 0)
		{
			System.out.println( status()) ;
			--countDown ;
		}
	}

}
