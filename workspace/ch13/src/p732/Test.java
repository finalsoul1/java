package p732;

public class Test {

	public static void main(String[] args) {
		
//		System.out.println("START");
//		long oldTime = System.currentTimeMillis();
//
//		long result = Counter.count(1, 2000000000);
//		System.out.println("result = " + result);
//
//		long currentTime = System.currentTimeMillis();
//		System.out.println("Elapsed time = " + (currentTime - oldTime));
		
		System.out.println("START T");
		long oldTime = System.currentTimeMillis();
		
		Test test = new Test(); // 아우터클래스가 객체로 존재해야 이너클래스를 객체화 할 수 있다
		A a = test.new A();
		B b = test.new B();
		a.start();
		b.start();
		
		try {
			a.join(); // A 스레드가 일을 마칠때까지 기다려라 (main 스레드에게 명령)
			b.join(); // =
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long result = test.resultA + test.resultB;
		System.out.println("result = " + result);
		
		long currentTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (currentTime - oldTime));
		
		// 프로세스가 많기 때문에 스레드를 늘리면 본 프로그램 처리속도가 빨라진다
	}
	long resultA = 0;
	long resultB = 0;
	
	class A extends Thread {
		@Override
		public void run() {
			resultA = Counter.count(1, 1000000000);
		}
	}

	class B extends Thread {
		@Override
		public void run() {
			resultB = Counter.count(1000000001, 2000000000);
		}
	}
}

class Counter {

	public static long count(int start, int end) {
		long sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

