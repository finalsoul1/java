class ThreadEx10 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다.
		t.start();

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

			if (i == 5)
				autoSave = true;
		}

		System.out.println("프로그램을 종료합니다.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch (InterruptedException e) {
			}

			// autoSave의 값이 true이면 autoSave()를 호출한다.
			// 스레드끼리 직접 대화는 안된다
			// 별도의 변수로 조정
			if (autoSave) {
				autoSave();
				// break 문으로 while문을 종료하는 로직이 필요없는 이유는 
				// 데몬스레드가 수행하기 때문이다. 데몬스레드는 일반스레드가 종료되면
				// 존재 의미가 없어지기 때문에 자동으로 종료된다
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
