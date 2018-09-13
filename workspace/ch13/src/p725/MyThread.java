package p725;

public class MyThread extends Thread {
	@Override
	public void run() {
		Counter.count();
	}
}
