package com.oneapm.lockTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {

	/* Lock */
	private Lock lock = new ReentrantLock();
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();

	private char[] data = new char[10];
	private int count = 0;

	public void put(char c) throws InterruptedException {
		lock.lock();
		try {
			while (count == data.length - 1) {
				System.out.println("buffer ����");
				notFull.await();

			}
			notEmpty.signal();
			data[count++] = c;
			Thread.sleep(100);

		} finally {
			lock.unlock();
		}
	}

	public char get() throws InterruptedException {
		char c;
		lock.lock();
		try {
			while (count == 0) {
				System.out.println("buffer ��");
				notEmpty.await();
			}

			notFull.signal();
			c = data[--count];
			
			Thread.sleep(100);
		} finally {
			lock.unlock();
		}
		return c;
	}

}
