class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		/*
		 * 설계도 Value가 equals 메소드를 재정의 하지 않았다면: v1.equals(v2) <==> v1 == v2
		 * 
		 * 설계도 Value가 equals 메소드를 재정의해서 객체의 멤버변수가 같은지 비교하고있다면: v1.equals(v2) <==>
		 * v1.value == v2.value
		 */
		System.out.println(v1.equals(v2) ? "같다" : "다르다");
		System.out.println(v1 == v2 ? "같다" : "다르다");
		System.out.println("-------------------------");

		String x1 = "홍길동";
		String x2 = "홍길동";
		String x3 = new String("홍길동");

		System.out.println(x1.equals(x2) ? "같다" : "다르다");
		System.out.println(x1 == x2 ? "같다" : "다르다");
		System.out.println("-------------------------");

		System.out.println(x1.equals(x3) ? "같다" : "다르다");
		System.out.println(x1 == x3 ? "같다" : "다르다");

		/*
		 * 슈퍼 클래스 Object의 equals 메소드를 그대로 사용한다면 결과는 비교연산자 == 와 같다
		 */
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}

		v2 = v1;

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	} // main

}

class Value extends java.lang.Object {
	int value;

	Value(int value) {
		this.value = value;
	}

	// 코드를 자동으로 제너레이트 할 수 있다는 의미 :
	// 누가 짜도 똑같기 때문에 굳이 개발자가 타이핑 할 필요없이 자동으로 만들어도 된다는 뜻
	@Override
	public boolean equals(Object obj) {
		// 이 객체와 파라미터로 받은 obj가 가리키는 객체가 같은가?
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		// 객체의 상태정보를 비교한다. 설계도가 같은가?
		if (this.getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (this.value != other.value)
			return false;
		return true;
	}
}
