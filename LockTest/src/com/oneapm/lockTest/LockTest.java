package com.oneapm.lockTest;

public class LockTest {

	public static void main(String[] args) {
		BoundedBuffer pool = new BoundedBuffer();

		Thread threadConsumer = new Thread(new Consumer(pool));
		Thread threadProducer = new Thread(new Producer(pool));

		threadConsumer.start();
		threadProducer.start();
	}

}
