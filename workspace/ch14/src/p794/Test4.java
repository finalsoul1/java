package p794;

public class Test4 {
	
	// Lambda Expression
	// 함수를 하나의 식으로 표현하는 것이다
	// 함수? 하나의 객체에 하나의 메소드만 존재할 때 해당 메소드를 함수로 지칭한다
	// 함수형 인터페이스 구현체를 간단하게 식으로 줄여서 쓸 수 있는 표현법
	public static void main(String[] args) {

		// #1 변형
		// class 익명클래스 extends Thread
		// Thread 클래스를 상속한 어떤 클래스를 인스턴스
		new Thread("a") {
			@Override
			public void run() {
				try {
					MyCounter.count(Thread.currentThread().getName());
				} catch (InterruptedException ignore) {
				}
			}
		}.start();

		// #2 변형
		// class 익명클래스 implements Runnable
		// Runnable 인터페이스를 구현한 어떤 클래스를 인스턴스
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					MyCounter.count(Thread.currentThread().getName());
				} catch (InterruptedException ignore) {
				}
			}
		}, "b").start();

		// #2 변형 - 람다식으로 줄여서 쓰기
		// new Thread( 메소드(파라미터) -> {바디} )
		// 클래스명과 메소드명을 생략할 수 있다
		// 컴파일러가 주변 코드를 보고 맥락을 이해해서 생략된
		// 클래스명과 메소드명을 추론할 수 있기 때문
		new Thread( () -> {
			try {
				MyCounter.count(Thread.currentThread().getName());
			} catch (InterruptedException ignore) {
			}
		}, "b-lambda" ).start();
		
	}
}


class MyCounter4 {
	public static void count(String who) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(who + i + " ");
			Thread.sleep(500);
		}
	}
}