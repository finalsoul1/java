@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

@FunctionalInterface
interface Adder {
	int add(int a, int b);
}

class LambdaEx1 {

	static int proceed(Adder adder, int a, int b) {
		return adder.add(a, b);
	}

	static void execute(MyFunction f) { // �Ű������� Ÿ���� MyFunction�� �޼���
		f.run();
	}

	static MyFunction getMyFunction() { // ��ȯ Ÿ���� MyFunction�� �޼���
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {

//		Adder adder = new Adder() {
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//		};

		// ����1
		// (�Ķ����) -> {�ٵ�}
//		int result = proceed((int a, int b) -> {return a + b;}, 2, 3);

		// ����2
		// {} �ٵ𿬻��ڸ� �����ϸ� �ڵ����� return�� �ȴ�
		// () -> �ٵ� (���� ����)
//		int result = proceed((int a, int b) -> a + b, 2, 3);

		// ����3
		// �Ķ���� �ڷ��� ����
		// ��ü�� �޼ҵ尡 �ϳ��� ��ü = ���ٽ��� �͸�Ŭ������ ��ü�� ����
		int result = proceed((a, b) -> a + b, 2, 3);

		System.out.println("result = " + result);

		// ���ٽ����� MyFunction�� run()�� ����
		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() { // �͸�Ŭ������ run()�� ����
			public void run() { // public�� �ݵ�� �ٿ��� ��
				System.out.println("f2.run()");
			}
		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(() -> System.out.println("run()"));
	}
}