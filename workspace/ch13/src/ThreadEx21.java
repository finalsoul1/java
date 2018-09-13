class ThreadEx21 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx21();
		new Thread(r, "A").start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r, "B").start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		// 이런 문법도 가능하다
	}
}

class Account {
	private int balance = 1000;
	// 변수를 private으로 잠구고 get, set으로 나누면
	// 조회와 변경을 구분해서 관리할 수 있다

	public int getBalance() {
		return balance;
	}

	// A, B 스레드가 순차적으로 withdraw 메소드를 호출하여 사용하는 것이 아니라
	// 거의 동시에 접근하고 있는 상황이다
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
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			System.out.println(name + " : " + money);
			acc.withdraw(money);
			
			System.out.println(name + " balance : " + acc.getBalance());
		}
	} // run()
}
