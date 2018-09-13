package p794;

public class Test {
	public static void main(String[] args) {
		String who = Thread.currentThread().getName();
		System.out.println("who : " + who);

		Worker worker = new Worker();
//		worker.run();
		Thread work = new Thread(worker, "A");
		work.start();

		System.out.println("end who : " + who);

	}
}

class Worker implements Runnable {
	String who = Thread.currentThread().getName();

	@Override
	public void run() {
		String who = Thread.currentThread().getName();
		System.out.println("run who : " + who);
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ignore) {
			}
		}
	}
}