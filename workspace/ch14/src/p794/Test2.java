package p794;

public class Test2 {
	// 인터페이스가 제안하는 기능을 갖춘 클래스로 만든 객체를 할당
	// ? implements Runnable
	
	// 인터페이스의 추상메소드를 구체화시키면 인터페이스도 new가 된다
	static Runnable mRunnable = new Runnable() { 
		// 클래스명이 없다 (Anonymous Class)
		
		@Override
		public void run() {
			
		}
	};
	
	
	public static void main(String[] args) {

//		Worker worker = new Worker();
		
//		Thread work = new Thread(new Worker1(), "A");
//		work.start();
		
		// 스레드를 위한 클래스를 따로 만들지 않고 사용할 수 있는 방법
		// 파라미터로 Runnable 인터페이스 구현체를 받기만 하면 된다
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

//class Worker1 implements Runnable { // 클래스명이 존재
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