package com.oneapm.lockTest;

public class Producer implements Runnable {

	BoundedBuffer buffer = null;

	public Producer(BoundedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; ++i) {
			try {
				buffer.put((char) i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Put:" + i);
		}
	}

}
