class FlowEx12 {

	int count = 20; // 멤버변수 : 클래스를 new 할 때 만들어지는 객체의 기본 멤버가 된다, 값 할당 안하면 기본값 자동할당

	void print(int count) { // 파라미터 변수 : 메소드가 호출될 때 외부에서 전달 한 값이 할당되면서 만들어 진다

	}

	public static void main(String[] args) {

		int count = 10; // 지역변수 : 코드 처리의 흐름이 도달할 때 자동으로 메모리에 변수가 만들어진다. 값은 직접 할당해야함

		if(true) {
			// 범위연산자를 기준으로 안쪽에서 바깥쪽에 있는 변수는 접근해서 사용할 수 있다
			int count2 = count;
			
			int count3 = 20;
		}
		// 범위연산자를 기준으로 안쪽에서 선언한 변수는 바깥쪽에서 접근해서 사용할 수 있다
		// int count4 = count3;  < 안된다
		
		

		for (int i = 1; i <= 5; i++)
			System.out.println(i); // i의 값을 출력한다.

		for (int i = 1; i <= 5; i++)
			System.out.print(i); // println()대신 print()를 쓰면 가로로 출력된다.

		System.out.println();
	}
}
