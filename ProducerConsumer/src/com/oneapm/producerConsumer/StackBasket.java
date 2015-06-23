package com.oneapm.producerConsumer;

public class StackBasket {

	private Mantou[] mt = new Mantou[6];
	private int index = 0;

	public synchronized void Push(Mantou m) {
		try {
			while (index == mt.length - 1) {
				System.out.println("-----��������------");
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
		System.out.println("����" + m.ToString()  + " �� " +  index + "����ͷ");
	}

	public synchronized  Mantou Pop()
	{
		try
		{
			while(index == 0)
			{
				System.out.println("-----��������");
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
		
		System.out.println("���� �ˣ�------" + mt[index].ToString() + " ��" + index + " ����ͷ");
		return mt[index] ;
		
	}
}
