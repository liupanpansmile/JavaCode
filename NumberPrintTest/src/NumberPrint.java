class Printer implements Runnable {

	private String printerText = null;
	private Printer nextPrinter = null;

	public Printer(String text) {
		this.printerText = text;
	}

	public void setNextPrinter(Printer printer) {
		this.nextPrinter = printer;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; ++i) {
			synchronized (nextPrinter) {
				try {
					Thread.sleep(1000); // ģ�⴦����ʱ
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(printerText);
				nextPrinter.notifyAll(); 
			}

		}

		// wait other printer thread
		synchronized (this) {

			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class NumberPrint {

	public static void main(String[] args) throws InterruptedException {
		Printer a = new Printer("A");
		Printer b = new Printer("B");
		Printer c = new Printer("C");

		// set printer sequence
		a.setNextPrinter(b);
		b.setNextPrinter(c);
		c.setNextPrinter(a);

		new Thread(a).start();
		Thread.sleep(1000);
		new Thread(b).start();
		Thread.sleep(1000);
		new Thread(c).start();
		Thread.sleep(1000);

	}
}