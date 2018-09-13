package p725;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		Counter.count();
	}
}
