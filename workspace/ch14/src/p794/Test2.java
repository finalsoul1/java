package p794;

public class Test2 {
	// �������̽��� �����ϴ� ����� ���� Ŭ������ ���� ��ü�� �Ҵ�
	// ? implements Runnable
	
	// �������̽��� �߻�޼ҵ带 ��üȭ��Ű�� �������̽��� new�� �ȴ�
	static Runnable mRunnable = new Runnable() { 
		// Ŭ�������� ���� (Anonymous Class)
		
		@Override
		public void run() {
			
		}
	};
	
	
	public static void main(String[] args) {

//		Worker worker = new Worker();
		
//		Thread work = new Thread(new Worker1(), "A");
//		work.start();
		
		// �����带 ���� Ŭ������ ���� ������ �ʰ� ����� �� �ִ� ���
		// �Ķ���ͷ� Runnable �������̽� ����ü�� �ޱ⸸ �ϸ� �ȴ�
		Thread work = new Thread(new Runnable() {
			
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
		}, "A");
		
	}
}

//class Worker1 implements Runnable { // Ŭ�������� ����
//	String who = Thread.currentThread().getName();
//
//	@Override
//	public void run() {
//		String who = Thread.currentThread().getName();
//		System.out.println("run who : " + who);
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException ignore) {
//			}
//		}
//	}
//}