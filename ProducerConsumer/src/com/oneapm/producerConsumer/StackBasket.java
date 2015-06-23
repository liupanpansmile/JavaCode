package com.oneapm.producerConsumer;

public class StackBasket {

	private Mantou[] mt = new Mantou[6];
	private int index = 0;

	public synchronized void Push(Mantou m) {
		try {
			while (index == mt.length - 1) {
				System.out.println("-----生产满了------");
				this.wait();
			}
			
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IllegalMonitorStateException ex)
		{
			ex.printStackTrace();
		}
		
		mt[index] = m;
		++index;
		System.out.println("生产" + m.ToString()  + " 共 " +  index + "个馒头");
	}

	public synchronized  Mantou Pop()
	{
		try
		{
			while(index == 0)
			{
				System.out.println("-----生产空了");
				this.wait();
			}
			
			this.notify();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IllegalMonitorStateException ex)
		{
			ex.printStackTrace();
		}
		
		--index ;
		
		System.out.println("消费 了：------" + mt[index].ToString() + " 共" + index + " 个馒头");
		return mt[index] ;
		
	}
}
