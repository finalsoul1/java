package p803;

/*
 * ���� ����� ��´ٸ� �ִ��� �ڵ带 ª�� ���� �ʹ�
 */
public class Test {

	public static void main(String[] args) {
		// Runnable�������̽��� �䱸�ϴ� ����� ���� ��ü (����� ���)
		Runnable worker = new Worker();
		Thread t = new Thread(worker, "A");
		t.start();

		Runnable worker2 = new Worker();
		new Thread(worker2, "B").start();

//		new Thread().start(); // �����尴ü�� �Է°��� ������ �ݽ����� �����ߴٰ� �ٷ� �ı���

		// �͸�Ŭ���� (�������̽��� ������ '�̸�����Ŭ����'�� ��ü)
		new Thread(new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				for (int i = 0; i < 10; i++) {
					System.out.println(name + "������" + " i = " + i);
				}
			}
		}, "C").start();

		new Thread( () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 10; i++) {
				System.out.println(name + "������" + " i = " + i);
			}
		}, "R").start();

	}

}

class Worker implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "������" + " i = " + i);
		}
	}
}