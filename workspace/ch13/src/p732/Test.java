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
		
		Test test = new Test(); // �ƿ���Ŭ������ ��ü�� �����ؾ� �̳�Ŭ������ ��üȭ �� �� �ִ�
		A a = test.new A();
		B b = test.new B();
		a.start();
		b.start();
		
		try {
			a.join(); // A �����尡 ���� ��ĥ������ ��ٷ��� (main �����忡�� ����)
			b.join(); // =
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long result = test.resultA + test.resultB;
		System.out.println("result = " + result);
		
		long currentTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (currentTime - oldTime));
		
		// ���μ����� ���� ������ �����带 �ø��� �� ���α׷� ó���ӵ��� ��������
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
