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
	// 인스턴스 메소드 : 클래스가 객체가 되어야 이용할 수 있는 메소드
	// 메소드 오버로딩(Method Overloading) : 메소드명은 같지만 파라미터정의가 다른 다수의 메소드를 서비스하는 방법
	int add(int a, int b) {
		System.out.println("#1");
		return a + b;
	}
	
	// 시그너처 (Signature) : 메소드를 유일하게 구분하는 부분, = 메소드명 + 파라미터정의부분
	double add(double a, int b) {
		System.out.println("#2");
		return a + b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}
}