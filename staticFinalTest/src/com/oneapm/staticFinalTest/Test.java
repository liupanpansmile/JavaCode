package com.oneapm.staticFinalTest;

/*
 * ����static��   ��ͨ��   ���췽���ĵ���˳��
 * */

public class Test {
	
	static
	{
		System.out.println("Static Block Called");
	}
	
	{
		System.out.println("Common Block Called ");
	}
	
	public Test()
	{
		System.out.println("Construction Called !");
	}

}
