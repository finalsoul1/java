class ThreadEx22 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx22();
		new Thread(r, "A").start();
		new Thread(r, "B").start();
	}
}

class Account2 {
	private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

	public  int getBalance() {
		return balance;
	}

	// synchronized : 동기화블록, 해당 범위는 한번에 하나의 스레드만 접근이 가능하다
	public synchronized void withdraw(int money){ // synchronized로 메서드를 동기화
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
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			System.out.println(name + " : " + money);

			acc.withdraw(money);
			System.out.println(name + " balance : " + acc.getBalance());
		}
	} // run()
}
