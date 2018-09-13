package p725;

public class Counter {

	public static void count() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i <= 20; i++) {
			System.out.println(name + " / " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ignore) {

			}
		}
	}
}
