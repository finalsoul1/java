class ThreadEx21 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx21();
		new Thread(r, "A").start(); // ThreadGroup�� ���� �����ǹǷ� gc����� �ƴϴ�.
		new Thread(r, "B").start(); // ThreadGroup�� ���� �����ǹǷ� gc����� �ƴϴ�.
		// �̷� ������ �����ϴ�
	}
}

class Account {
	private int balance = 1000;
	// ������ private���� �ᱸ�� get, set���� ������
	// ��ȸ�� ������ �����ؼ� ������ �� �ִ�

	public int getBalance() {
		return balance;
	}

	// A, B �����尡 ���������� withdraw �޼ҵ带 ȣ���Ͽ� ����ϴ� ���� �ƴ϶�
	// ���� ���ÿ� �����ϰ� �ִ� ��Ȳ�̴�
	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	} // withdraw
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();

	public void run() {
		String name = Thread.currentThread().getName();
		while (acc.getBalance() > 0) {
			// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			System.out.println(name + " : " + money);
			acc.withdraw(money);
			
			System.out.println(name + " balance : " + acc.getBalance());
		}
	} // run()
}
