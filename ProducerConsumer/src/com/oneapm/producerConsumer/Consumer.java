package com.oneapm.producerConsumer;

public class Consumer implements Runnable {

	
	private StackBasket sb = new StackBasket() ;
	public Consumer (StackBasket sb)
	{
		this.sb = sb ;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 0 ;i < 20 ; ++i)
		{
			Mantou m = sb.Pop() ;
			
			
			try
			{
				Thread.sleep((int)Math.random()*500 );
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
