class MyMathTestBasic {
	public static void main(String args[]) {

		MyCalculator calc = new MyCalculator();
		int result = calc.add(2, 3);
		System.out.println(result);
		System.out.println(calc.add(2D, 3));
	
		
		int result2 = MyCalculator.multiply(4, 3);
		System.out.println(result2);
		
	}
}

class MyCalculator {
	// �ν��Ͻ� �޼ҵ� : Ŭ������ ��ü�� �Ǿ�� �̿��� �� �ִ� �޼ҵ�
	// �޼ҵ� �����ε�(Method Overloading) : �޼ҵ���� ������ �Ķ�������ǰ� �ٸ� �ټ��� �޼ҵ带 �����ϴ� ���
	int add(int a, int b) {
		System.out.println("#1");
		return a + b;
	}
	
	// �ñ׳�ó (Signature) : �޼ҵ带 �����ϰ� �����ϴ� �κ�, = �޼ҵ�� + �Ķ�������Ǻκ�
	double add(double a, int b) {
		System.out.println("#2");
		return a + b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}
}