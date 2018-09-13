class BindingTest{
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3  c = new Child3();

		// 상속관계에서
		// 변수는 은닉되고 == 지칭하는 자료형에 따라 변수가 사용된다
		// 메소드는 재정의 된다 == 지칭하는 자료형과 관계없이 실체에 가장 가까운 메소드가 사용된다
		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent3 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;

	@Override
	void method() {
		System.out.println("Child Method");
	}
}
