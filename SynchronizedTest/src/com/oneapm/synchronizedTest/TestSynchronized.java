package com.oneapm.synchronizedTest;

public class TestSynchronized {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// 1  ����߳̽���ı����� �̼߳�ͬ��������
//		for(int i = 1;i < 10 ;++i )
//		{
//			new Thread(new PrintNumber(i)).start()  ;
//			//Thread.sleep(100);
//		}
		
		
		//2  lock��ָ��Ķ������ڴ���ֻ����һ�ݣ� �Ի�����������������Ӷ�ʹÿ���߳�˳��ı���
//		String lock ="lock" ;
//		for(int i = 1;i < 10 ;++i )
//		{
//			new Thread(new PrintNumber2(i,lock)).start()  ;
//			
//		}
		
		//3  �Ծ�̬�����������൱�ڶ�class������
		for(int i = 1;i < 10 ;++i )
		{
			new Thread(new PrintNumber3(i)).start()  ;
		}
		
	}

}
