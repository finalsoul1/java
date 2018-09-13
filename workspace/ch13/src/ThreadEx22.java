class ThreadEx22 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx22();
		new Thread(r, "A").start();
		new Thread(r, "B").start();
	}
}

class Account2 {
	private int balance = 1000; // private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.

	public  int getBalance() {
		return balance;
	}

	// synchronized : ����ȭ���, �ش� ������ �ѹ��� �ϳ��� �����常 ������ �����ϴ�
	public synchronized void withdraw(int money){ // synchronized�� �޼��带 ����ȭ
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
		}
	} // withdraw
}

class RunnableEx22 implements Runnable {
	Account2 acc = new Account2();

	public void run() {
		String name = Thread.currentThread().getName();

		while(acc.getBalance() > 0) {
			// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			System.out.println(name + " : " + money);

			acc.withdraw(money);
			System.out.println(name + " balance : " + acc.getBalance());
		}
	} // run()
}
