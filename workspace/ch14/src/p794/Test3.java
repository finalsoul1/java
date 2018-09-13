package p794;

public class Test3 {
	public static void main(String[] args) {

		// #1
		Thread t1 = new MyThread();
		t1.setName("A");
		t1.start();

		// #1 ����
		// class �͸�Ŭ���� extends Thread
		// Thread Ŭ������ ����� � Ŭ������ �ν��Ͻ�
		new Thread("a") {
			@Override
			public void run() {
				try {
					MyCounter.count(Thread.currentThread().getName());
				} catch (InterruptedException ignore) {
				}
			}
		}.start();

		// #2
		new Thread(new MyRunnable(), "B").start();

		// #2 ����
		// class �͸�Ŭ���� implements Runnable
		// Runnable �������̽��� ������ � Ŭ������ �ν��Ͻ�
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					MyCounter.count(Thread.currentThread().getName());
				} catch (InterruptedException ignore) {
				}
			}
		}, "b").start();

		// ����
		try {
			MyCounter.count(Thread.currentThread().getName());
		} catch (InterruptedException ignore) {
		}
	}
}



class MyThread extends Thread {
	@Override
	public void run() {
		try {
			MyCounter.count(Thread.currentThread().getName());
		} catch (InterruptedException ignore) {
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		try {
			MyCounter.count(Thread.currentThread().getName());
		} catch (InterruptedException ignore) {
		}
	}
}

class MyCounter {
	public static void count(String who) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(who + i + " ");
			Thread.sleep(500);
		}
	}
}