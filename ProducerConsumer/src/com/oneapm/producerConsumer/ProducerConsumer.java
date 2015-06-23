package com.oneapm.producerConsumer;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackBasket sb = new StackBasket()  ;
		
		Producer producer = new Producer(sb) ;
		Consumer consumer = new Consumer(sb) ;
		
		Thread tp = new Thread(producer) ;
		Thread tc = new Thread(consumer) ;
		
		tp.start();
		tc.start();
		
	}

}
