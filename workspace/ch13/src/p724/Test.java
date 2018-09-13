package p724;

public class Test {
	// ������(Thread) : �����ϸ� ���� �ǹ�. �ڵ带 ó���ϴ� �帧(��� �̾��� ������ ����)
	// �����ϰ� �ϲ�
	// �⵿ �޼ҵ尡 ���۵Ǹ� �ڵ����� main �̶�� �����尡 �ڵ带 ó���ϱ� �����մϴ�
	public static void main(String[] args) {
		String title = "������";
		System.out.println("title : " + title);

		String mainWorker = Thread.currentThread().getName(); // ���� �����尡 ������?.�̸��� ������
		System.out.println("Worker = " + mainWorker);

		MyThread myThread = new MyThread();
		myThread.setName("A");
//		myThread.run(); // ���� �� ���ÿ��� run�޼ҵ� ȣ��
		myThread.start(); // �� ���� ���� �� ���������� run�޼ҵ尡 ȣ��ȴ�



		MyRunnable myRunnable = new MyRunnable();
//		myRunnable.start();
		Thread mThread = new Thread(myRunnable);
		mThread.setName("B");
		mThread.start(); // �� ���� ���� ==> ThreadŬ������ run()��� �����ڷ� ����
		// Runnable�������̽� ����ü�� run()�� ȣ�� �ϴ°ŷ� ��ӵ�����
		
		// main ������� start() �޼ҵ带 ȣ���� �� �ٷ� ������ �����ͼ�
		// ���� �ڵ带 �����մϴ�
		Counter.count();
	}

}

class Counter {
	public static void count() {
		String name = Thread.currentThread().getName(); // ���� �����尡 ������?.�̸��� ������
		for (int i = 0; i <= 20; i++) {
			System.out.println(name + " / " + i + " ");
			try {
				Thread.sleep(500); // sleep �޼ҵ尡 try-catch�� ������
			} catch (InterruptedException ignore) { // �����ϰڴ�

			}
		}
	}
}

// ������ ���� #1
class MyThread extends Thread {
	@Override // ��Ʈ�� + �����̽� + ����
	public void run() {
		// ������ �����尡 ó���ؾ��� ������ ��ġ�մϴ�
		Counter.count();

	}
}

class Some {
}

// ������ ���� #2
class MyRunnable extends Some implements Runnable { // �߻�޼ҵ尡 �ϳ��� �������̽� = FunctionalInterface
	// ������ �����尡 ó���ؾ��� ������ ��ġ�մϴ�

	@Override
	public void run() {
		Counter.count();
	}
}