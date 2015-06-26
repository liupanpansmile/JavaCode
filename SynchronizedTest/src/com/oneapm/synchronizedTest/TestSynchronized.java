package com.oneapm.synchronizedTest;

public class TestSynchronized {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// 1  多个线程交叉的报数， 线程间同步有问题
//		for(int i = 1;i < 10 ;++i )
//		{
//			new Thread(new PrintNumber(i)).start()  ;
//			//Thread.sleep(100);
//		}
		
		
		//2  lock所指向的对象在内存中只保存一份， 对互斥变量变量加锁，从而使每个线程顺序的报数
//		String lock ="lock" ;
//		for(int i = 1;i < 10 ;++i )
//		{
//			new Thread(new PrintNumber2(i,lock)).start()  ;
//			
//		}
		
		//3  对静态方法加锁，相当于对class加锁，
		for(int i = 1;i < 10 ;++i )
		{
			new Thread(new PrintNumber3(i)).start()  ;
		}
		
	}

}
