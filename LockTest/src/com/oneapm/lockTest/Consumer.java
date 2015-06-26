package com.oneapm.lockTest;

public class Consumer implements Runnable {

	BoundedBuffer buffer = null;

	public Consumer(BoundedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; ++i) {
			int c;
			try {
				c = buffer.get();
				System.out.println("Get:" + c);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
