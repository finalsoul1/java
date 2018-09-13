class ThreadEx01 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		// ThreadEx1_2 Ŭ����(Runnable�������̽�) ������ start() �޼ҵ尡 �����Ƿ�
		// Thread Ŭ������ ������ �޾Ƽ� ó���ؾ� �մϴ�
		Thread t2 = new Thread(r); // ������ Thread(Runnable target) 
		
		t1.start(); // �������� �ݽ����� ������� �� run �޼ҵ尡 ����ȴ�
		t2.start();
		// Thread Ŭ������ �����ڿ� Runnable ����ü�� �����ϸ�
		// Thread ��ü�� start() �޼ҵ� ȣ�� �� �ݽ����� ����� �� �� Runnable ����ü run() �޼ҵ带 �����մϴ�
	}
}

class ThreadEx1_1 extends Thread {
	@Override
	public void run() {
		// ������ �����尡 ó���ؾ� �� ������ ��ġ�մϴ�
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); // ������ Thread�� getName()�� ȣ��
		}
	}
}

class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread.currentThread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
