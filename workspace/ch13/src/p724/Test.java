package p724;

public class Test {
	// 스레드(Thread) : 직역하면 실을 의미. 코드를 처리하는 흐름(길게 이어진 선으로 보임)
	// 간단하게 일꾼
	// 기동 메소드가 시작되면 자동으로 main 이라는 스레드가 코드를 처리하기 시작합니다
	public static void main(String[] args) {
		String title = "스레드";
		System.out.println("title : " + title);

		String mainWorker = Thread.currentThread().getName(); // 현재 스레드가 누구야?.이름을 밝혀라
		System.out.println("Worker = " + mainWorker);

		MyThread myThread = new MyThread();
		myThread.setName("A");
//		myThread.run(); // 기존 콜 스택에서 run메소드 호출
		myThread.start(); // 콜 스택 생성 후 최종적으로 run메소드가 호출된다



		MyRunnable myRunnable = new MyRunnable();
//		myRunnable.start();
		Thread mThread = new Thread(myRunnable);
		mThread.setName("B");
		mThread.start(); // 콜 스택 생성 ==> Thread클래스의 run()대신 생성자로 받은
		// Runnable인터페이스 구현체의 run()을 호출 하는거로 약속돼있음
		
		// main 스레드는 start() 메소드를 호출한 후 바로 밑으로 내려와서
		// 다음 코드를 수행합니다
		Counter.count();
	}

}

class Counter {
	public static void count() {
		String name = Thread.currentThread().getName(); // 현재 스레드가 누구야?.이름을 밝혀라
		for (int i = 0; i <= 20; i++) {
			System.out.println(name + " / " + i + " ");
			try {
				Thread.sleep(500); // sleep 메소드가 try-catch를 강제함
			} catch (InterruptedException ignore) { // 무시하겠다

			}
		}
	}
}

// 스레드 문법 #1
class MyThread extends Thread {
	@Override // 컨트롤 + 스페이스 + 엔터
	public void run() {
		// 별도의 스레드가 처리해야할 로직을 배치합니다
		Counter.count();

	}
}

class Some {
}

// 스레드 문법 #2
class MyRunnable extends Some implements Runnable { // 추상메소드가 하나인 인터페이스 = FunctionalInterface
	// 별도의 스레드가 처리해야할 로직을 배치합니다

	@Override
	public void run() {
		Counter.count();
	}
}