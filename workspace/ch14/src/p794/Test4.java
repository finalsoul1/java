package p794;

public class Test4 {
	
	// Lambda Expression
	// �Լ��� �ϳ��� ������ ǥ���ϴ� ���̴�
	// �Լ�? �ϳ��� ��ü�� �ϳ��� �޼ҵ常 ������ �� �ش� �޼ҵ带 �Լ��� ��Ī�Ѵ�
	// �Լ��� �������̽� ����ü�� �����ϰ� ������ �ٿ��� �� �� �ִ� ǥ����
	public static void main(String[] args) {

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

		// #2 ���� - ���ٽ����� �ٿ��� ����
		// new Thread( �޼ҵ�(�Ķ����) -> {�ٵ�} )
		// Ŭ�������� �޼ҵ���� ������ �� �ִ�
		// �����Ϸ��� �ֺ� �ڵ带 ���� �ƶ��� �����ؼ� ������
		// Ŭ�������� �޼ҵ���� �߷��� �� �ֱ� ����
		new Thread( () -> {
			try {
				MyCounter.count(Thread.currentThread().getName());
			} catch (InterruptedException ignore) {
			}
		}, "b-lambda" ).start();
		
	}
}


class MyCounter4 {
	public static void count(String who) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(who + i + " ");
			Thread.sleep(500);
		}
	}
}